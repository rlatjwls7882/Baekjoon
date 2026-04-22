# [Ruby V] Bitwise Queries

[문제 링크](https://www.acmicpc.net/problem/19455) 

## 문제 설명

<p>You are given an array $a$ of size $n$ and you need to perform $m$ queries on it. There are three types of queries:</p>

<ol>
	<li>"<code>&</code> $l$ $r$ $x$": change $a_i$ to ($a_i$ <code>AND</code> $x$) for all $i$ = $l$, $l+1$, $\ldots$, $r$;</li>
	<li>"<code>|</code> $l$ $r$ $x$": change $a_i$ to ($a_i$ <code>OR</code> $x$) for all $i$ = $l$, $l+1$, $\ldots$, $r$;</li>
	<li>"<code>?</code> $l$ $r$": find the minimal value among $a_l$, $a_{l+1}$, $\ldots$, $a_r$.</li>
</ol>

<p>Output the answers for all queries of the third type.</p>

## 입력 

 <p>The first line contains one integer $n$ ($1 \le n \le 5 \cdot 10^5$) --- the size of the array.</p>

<p>The second line contains $n$ space-separated integers $a_i$ ($0 \le a_i < 2^{30}$) --- the elements of the array.</p>

<p>The third line contains one integer $m$ ($1 \le m \le 2 \cdot 10^5$) --- the number of queries.</p>

<p>Next $m$ lines contain descriptions of queries in the format described above. For all queries $1 \le l \le r \le n$, for queries of the first and second types $0 \le x < 2^{30}$.</p>

## 출력 

 <p>For each query of the third type, print the answer on a separate line.</p>

