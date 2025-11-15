# [Gold II] Busy Beaver's Colorful Walk

[문제 링크](https://www.acmicpc.net/problem/34501) 

## 문제 설명

<p>Busy Beaver is taking a walk on a path of colorful tiles.</p>

<p>The path consists of a line of $N$ tiles, each colored either red (<code>r</code>), green (<code>g</code>), blue (<code>b</code>), or yellow (<code>y</code>).</p>

<p>Busy Beaver's walk will follow these rules:</p>

<ul>
	<li>The walk visits $N$ tiles, starting from any initial tile.</li>
	<li>Each move must be to a tile at most two positions away from the current tile (possibly revisiting a previously visited tile, going backwards, or staying at the same tile).</li>
</ul>

<p>Busy Beaver will record the sequence of tile colors he visits on the walk in order. Busy Beaver is confident that he can recreate any sequence of $N$ colors on his walk.</p>

<p>Prove him wrong by providing any sequence of $N$ colors he can't recreate.</p>

<p>It can be shown that an answer always exists.</p>

## 입력 

 <p>Each test contains multiple test cases. The first line contains the number of test cases $T$ ($1 \leq T \leq 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains an integer $N$ ($3 \leq N \leq 3000$) --- the number of tiles.</p>

<p>The second line of each test case contains a length $N$ string of characters in ('<code>r</code>', '<code>g</code>', '<code>b</code>', '<code>y</code>'), the $i$'th character denoting the color of the $i$'th tile.</p>

<p>It is guaranteed that the sum of $N$ across all test cases is no more than $3 \cdot 10^5$.</p>

## 출력 

 <p>For each test case, output the answer-sequence as a string of characters in ('<code>r</code>', '<code>g</code>', '<code>b</code>', '<code>y</code>').</p>

