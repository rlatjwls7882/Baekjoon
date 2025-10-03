# [Gold III] Average Substring Value

[문제 링크](https://www.acmicpc.net/problem/32806) 

## 문제 설명

<p>Let $s$ be a nonempty string consisting entirely of base-$10$ digits (<code>0</code>-<code>9</code>). If the length of $s$ is $n,$ number the digits $1, 2, 3, \ldots, n$ from left to right, and for $1 \leq i \leq j \leq n,$ let $s[i,j]$ denote the substring consisting of the digits from position $i$ to position $j$, inclusive. (It follows that we are only considering <em>nonempty</em> substrings.) Assign a value to each substring that is simply equal to the largest digit in the substring. What is the average value of the substrings of $s$?</p>

<p>Note that two different substrings may be identical (as strings), but for the purposes of this problem they are treated as distinct. For example, if $s = $<code>1010</code>, then $s[1,2] = s[3,4] = $<code>10</code> are distinct substrings (both with value $1$).</p>

## 입력 

 <p>The input is a single nonempty string, $s,$ of base-$10$ digits. The length of $s$ is at most $200\,000$.</p>

## 출력 

 <p>Output a line containing the average value of the substrings of $s$. If the average is an integer, print the integer. If the average is a proper fraction, i.e., is equal to $a/b$, where $a$ and $b$ are positive integers and $a < b$, print this fraction in lowest terms, with a '<code>/</code>' symbol separating the numerator and denominator. If the average is greater than $1$ and does not simplify to an integer, print the whole part followed by the proper fractional part, separated by a space, with the proper fractional part in lowest terms and formatted as described in the previous sentence.</p>

