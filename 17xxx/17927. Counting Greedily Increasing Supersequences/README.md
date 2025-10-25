# [Gold I] Counting Greedily Increasing Supersequences

[문제 링크](https://www.acmicpc.net/problem/17927) 

## 문제 설명

<p>Given a permutation $A = (a_1, a_2, \dots, a_N)$ of the integers $1, 2, \dots, N$, we define the <em>greedily increasing subsequence</em> (GIS) in the following way.</p>

<p>Let $g_1 = a_1$. For every $i > 1$, let $g_i$ be the leftmost integer in $A$ that is strictly larger than $g_{i-1}$. If for a given $i$ there is no such integer, we say that the GIS of the sequence is the sequence $(g_1, g_2, ..., g_{i - 1})$.</p>

<p>For example, consider the permutation $(2, 3, 1, 5, 4, 7, 6)$. First, we have $g_1 = 2$. The leftmost integer larger than $2$ is $3$, so $g_2 = 3$. The leftmost integer larger than $3$ is $5$ ($1$ is too small), so $g_3 = 5$. Finally, $g_4 = 7$. Thus, the GIS of $(2, 3, 1, 5, 4, 7, 6)$ is $(2, 3, 5, 7)$.</p>

<p>Given a sequence $G = (g_1, g_2, \dots, g_L)$, how many permutations $A$ of the integers $1, 2, \dots, N$ have $G$ as its GIS?</p>

## 입력 

 <p>The first line of input contains the integers $1 \le N \le 10^6$, the number of elements of the permutation $A$, and $1 \le L \le 10^6$, the length of the sequence $G$.</p>

<p>The next line contains $L$ positive integers between $1$ and $N$, the elements $g_1, \dots, g_L$ of the sequence $G$.</p>

## 출력 

 <p>Output a single integer: the number of $N$-element permutations having the given sequence as its GIS. Since this number may be large, output it modulo the prime number $10^9 + 7$.</p>

