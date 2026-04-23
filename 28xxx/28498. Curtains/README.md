# [Diamond IV] Curtains

[문제 링크](https://www.acmicpc.net/problem/28498) 

## 문제 설명

<p>Benson the Rabbit is organizing a performance on his plane!</p>

<p>He has a stage with $n$ sections numbered $1$ to $n$ from left to right. He also has $m$ curtains numbered from $1$ to $m$.</p>

<p>Each of these $m$ curtains can be lowered. Lowering curtain $i$ covers sections $l[i]$ to $r[i]$. A <strong>curtain configuration</strong> is a set of lowered curtains. Given a curtain configuration, a section $x$ ($1 ≤ x ≤ n$) is <strong>covered</strong> if and only if there exists a <strong>lowered</strong> curtain $i$ such that $l[i] ≤ x ≤ r[i]$.</p>

<p>Benson wants to give a total of $q$ performances, numbered from $1$ to $q$. For each performance $j$, Benson requires a curtain configuration such that the sections $s[j]$ to $e[j]$ are covered and nothing else is covered. More formally, for each $1 ≤ x ≤ n$,</p>

<ul>
	<li>If $s[j] ≤ x ≤ e[j]$, section $x$ is covered.</li>
	<li>Otherwise, section $x$ is not covered.</li>
</ul>

<p>For each of these $q$ performances, help Benson to determine if there exists a curtain configuration satisfying his requirements.</p>

## 입력 

 <p>The first line of input will contain $3$ spaced integers $n$, $m$ and $q$, representing the number of sections, curtains and performances respectively.</p>

<p>The next $m$ lines of input will contain $2$ spaced integers each. The $i$-th of these lines will contain $l[i]$ and $r[i]$ respectively, describing the range of sections that curtain $i$ can cover.</p>

<p>The next $q$ lines of input will contain $2$ spaced integers each. The $j$-th of these lines will contain $s[j]$ and $e[j]$ respectively, describing the range of sections that need to be covered for performance $j$.</p>

## 출력 

 <p>Output $q$ lines, the $j$-th of which should contain <code>YES</code> if it is possible to cover the required sections for the $j$-th performance using the curtains, and <code>NO</code> otherwise.</p>

