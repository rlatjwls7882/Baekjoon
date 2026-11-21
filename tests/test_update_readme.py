"""Index behavior tests use temporary data; submission programs are never run."""
from contextlib import redirect_stderr, redirect_stdout
from io import StringIO
import json
from pathlib import Path
import tempfile
import unittest
from unittest.mock import patch

import update_README as index


class IndexTests(unittest.TestCase):
    def setUp(self):
        self.directory = tempfile.TemporaryDirectory()
        self.addCleanup(self.directory.cleanup)
        self.root = Path(self.directory.name)

    def metadata(self, records):
        (self.root / 'problems.json').write_text(json.dumps(records), encoding='utf-8')

    def source(self, number, suffix='.cpp', variant='', content=b'original\r\nbytes\n'):
        key = index.number_name(number)
        p = self.root / index.bucket_name(number) / key / (key + variant + suffix)
        p.parent.mkdir(parents=True, exist_ok=True)
        p.write_bytes(content)
        return p

    def run_main(self, *args):
        with redirect_stderr(StringIO()), redirect_stdout(StringIO()):
            return index.main(['--root', str(self.root), *args])

    def test_multiple_languages_variants_and_exact_source_preservation(self):
        files = [self.source(1000), self.source(1000, '.java'), self.source(1000, '.txt', '-alt')]
        before = {p: p.read_bytes() for p in files}
        self.metadata({'01000': {'title': 'A+B', 'level': 1}})
        with patch('socket.socket', side_effect=AssertionError('network forbidden')):
            self.assertEqual(self.run_main(), 0)
        s = (self.root / '01xxx/README.md').read_text()
        self.assertIn('[C++](./01000/01000.cpp)', s)
        self.assertIn('[Text (alt)](./01000/01000-alt.txt)', s)
        self.assertEqual(before, {p: p.read_bytes() for p in files})
        self.assertEqual(self.run_main('--check'), 0)

    def test_numeric_bucket_order_beyond_five_digits(self):
        for n in (100000, 99000, 1000):
            self.source(n)
        self.metadata({index.number_name(n): {'title': str(n), 'level': None} for n in (100000, 99000, 1000)})
        output = index.build_readmes(self.root)
        top = output[Path('README.md')]
        self.assertLess(top.index('./01xxx/'), top.index('./99xxx/'))
        self.assertLess(top.index('./99xxx/'), top.index('./100xxx/'))
        self.assertIn('[100000](https://www.acmicpc.net/problem/100000)', output[Path('100xxx/README.md')])

    def test_titles_are_safe_in_markdown_tables(self):
        self.source(1000)
        self.metadata({'01000': {'title': '[x] | <b>&', 'level': 0}})
        s = index.build_readmes(self.root)[Path('01xxx/README.md')]
        self.assertIn(r'\[x\] \| &lt;b&gt;&amp;', s)
        self.assertIn('../assets/0.svg', s)

    def test_check_is_read_only_and_detects_stale_indexes(self):
        self.source(1000)
        self.metadata({'01000': {'title': 'One', 'level': None}})
        self.assertEqual(self.run_main('--check'), 1)
        self.assertFalse((self.root / 'README.md').exists())
        self.assertEqual(self.run_main(), 0)
        (self.root / 'README.md').write_bytes(b'custom\r\n')
        self.assertEqual(self.run_main('--check'), 1)
        self.assertEqual((self.root / 'README.md').read_bytes(), b'custom\r\n')

    def test_metadata_mismatch_does_not_partially_rewrite_indexes(self):
        self.source(1000)
        for data in ({}, {'01000': {'title': 'One', 'level': 1}, '01001': {'title': 'Two', 'level': 2}}):
            with self.subTest(data=data):
                self.metadata(data)
                self.assertEqual(self.run_main(), 2)
                self.assertFalse((self.root / 'README.md').exists())

    def test_duplicate_metadata_and_invalid_levels_are_rejected(self):
        self.source(1000)
        (self.root / 'problems.json').write_text('{"01000":{},"01000":{}}')
        self.assertEqual(self.run_main(), 2)
        for level in (True, -1, 31, '1'):
            with self.subTest(level=level):
                self.metadata({'01000': {'title': 'One', 'level': level}})
                self.assertEqual(self.run_main(), 2)

    def test_old_paths_wrong_bucket_and_extra_files_are_rejected(self):
        self.metadata({'01000': {'title': 'One', 'level': 1}})
        for relative in ('01xxx/1000/1000.cpp', '02xxx/01000/01000.cpp',
                         '01xxx/01000/01001.cpp', '01xxx/01000/01000.cc',
                         '01xxx/01000/01000-alt-1.cpp'):
            with self.subTest(relative=relative):
                p = self.root / relative
                p.parent.mkdir(parents=True, exist_ok=True)
                p.write_text('code')
                self.assertEqual(self.run_main(), 2)
                p.unlink()
                p.parent.rmdir()
                if not list(p.parent.parent.iterdir()):
                    p.parent.parent.rmdir()

    def test_symlink_source_is_rejected(self):
        p = self.source(1000)
        target = self.root / 'outside.txt'
        target.write_text('other')
        p.unlink()
        p.symlink_to(target)
        self.metadata({'01000': {'title': 'One', 'level': 1}})
        self.assertEqual(self.run_main(), 2)


if __name__ == '__main__':
    unittest.main()
