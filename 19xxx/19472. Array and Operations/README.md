# [Diamond I] Array and Operations

[문제 링크](https://www.acmicpc.net/problem/19472) 

## 문제 설명

<p>You have an array $a$ with $n$ integers. There are three types of operations:</p>

<ul>
	<li>"1 $l$ $r$ $x$": for each $i$ in $[l, r]$, change $a_i$ to $a_i + x$;</li>
	<li>"2 $l$ $r$": for each $i$ in $[l, r]$, change $a_i$ to $\lfloor \sqrt{a_i} \rfloor$;</li>
	<li>"3 $l$ $r$": sum up $a_i$ for all $i$ in $[l, r]$ and print the answer.</li>
</ul>

<p>Your goal is to process the operations and print the answers of all type 3 operations.</p>

## 입력 

 <p>The first line of the input contains two integers $n$ and $q$ ($1 \le n, q \le 10^5$). The second line contains $n$ integers $a_1, \ldots, a_n$. Then $q$ lines follow, each line describes an operation.</p>

<p>It is guaranteed that $1 \le a_i, x \le 10^5$, $1 \le l \le r \le n$.</p>

## 출력 

 <p>For each operation of type 3, print a single line containing the required sum.</p>

