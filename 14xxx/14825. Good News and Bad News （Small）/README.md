# [Gold III] Good News and Bad News (Small) - 14825 

[문제 링크](https://www.acmicpc.net/problem/14825) 

### 성능 요약

메모리: 2020 KB, 시간: 8 ms

### 분류

브루트포스 알고리즘

### 제출 일자

2024년 9월 14일 14:52:16

### 문제 설명

<p>You would like to get your <strong>F</strong> friends to share some news. You know your friends well, so you know which of your friends can talk to which of your other friends. There are <strong>P</strong> such one-way relationships, each of which is an ordered pair (<strong>A<sub>i</sub></strong>, <strong>B<sub>i</sub></strong>) that means that friend <strong>A<sub>i</sub></strong>can talk to friend <strong>B<sub>i</sub></strong>. It does not imply that friend <strong>B<sub>i</sub></strong> can talk to friend <strong>A<sub>i</sub></strong>; however, another of the ordered pairs might make that true.</p>

<p>For <em>every</em> such existing ordered pair (<strong>A<sub>i</sub></strong>, <strong>B<sub>i</sub></strong>), you want friend <strong>A<sub>i</sub></strong> to deliver some news to friend <strong>B<sub>i</sub></strong>. In each case, this news will be represented by an integer value; the magnitude of the news is given by the absolute value, and the type of news (good or bad) is given by the sign. The integer cannot be 0 (or else there would be no news!), and its absolute value cannot be larger than <strong>F</strong><sup>2</sup> (or else the news would be just <em>too</em> exciting!). These integer values may be different for different ordered pairs.</p>

<p>Because you are considerate of your friends' feelings, for each friend, the sum of the values of all news given <em>by</em> that friend must equal the sum of values of all news given <em>to</em>that friend. If no news is given by a friend, that sum is considered to be 0; if no news is given to a friend, that sum is considered to be 0.</p>

<p>Can you find a set of news values for your friends to communicate such that these rules are obeyed, or determine that it is impossible?</p>

### 입력 

 <p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each begins with one line with two integers <strong>F</strong> and <strong>P</strong>: the number of friends, and the number of different ordered pairs of friends. Then, <strong>P</strong> more lines follow; the i-th of these lines has two different integers <strong>A<sub>i</sub></strong> and <strong>B<sub>i</sub></strong> representing that friend <strong>A<sub>i</sub></strong> can talk to friend <strong>B<sub>i</sub></strong>. Friends are numbered from 1 to <strong>F</strong>.</p>

<p>Limits</p>

<ul>
	<li>1 ≤ <strong>T</strong> ≤ 100.</li>
	<li>1 ≤ <strong>A<sub>i</sub></strong> ≤ <strong>F</strong>, for all i.</li>
	<li>1 ≤ <strong>B<sub>i</sub></strong> ≤ <strong>F</strong>, for all i.</li>
	<li><strong>A<sub>i</sub></strong> ≠ <strong>B<sub>i</sub></strong>, for all i. (A friend does not self-communicate.)</li>
	<li>(<strong>A<sub>i</sub></strong>, <strong>B<sub>i</sub></strong>) ≠ (<strong>A<sub>j</sub></strong>, <strong>B<sub>j</sub></strong>), for all i ≠ j. (No pair of friends is repeated within a test case in the same order.)</li>
	<li>2 ≤ <strong>F</strong> ≤ 4.</li>
	<li>1 ≤ <strong>P</strong> ≤ 12.</li>
</ul>

### 출력 

 <p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is either <code>IMPOSSIBLE</code> if there is no arrangement satisfying the rules above, or, if there is such an arrangement, <strong>P</strong> integers, each of which is nonzero and lies inside [-<strong>F</strong><sup>2</sup>, <strong>F</strong><sup>2</sup>]. The i-th of those integers corresponds to the i-th ordered pair from the input, and represents the news value that the first friend in the ordered pair will communicate to the second. The full set of values must satisfy the conditions in the problem statement.</p>

<p>If there are multiple possible answers, you may output any of them.</p>

