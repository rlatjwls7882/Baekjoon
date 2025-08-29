# [Gold III] Dominating Duos

[문제 링크](https://www.acmicpc.net/problem/21138) 

## 문제 설명

<p>A group of people are standing in a line. Each person has a distinct height. You would like to count the number of unordered pairs of people in the line such that they are taller than everyone in between them in the line.</p>

<p>More formally, let $d$ be a sequence of the heights of the people in order from left to right. We want to count the number of pairs of indices $i$ and $j$ with $i < j$ such that for all $k$ with $i < k < j$, $d_i > d_k$ and $d_j > d_k$. Note that if $j = i + 1$ (<em>i.e.</em>, there are no $k$’s between $i$ and $j$), it is trivially true.</p>

## 입력 

 <p>The first line of input contains an integer $n$ ($2 \le n \le 10^6$), which is the number of people.</p>

<p>Each of the next n lines contains a single integer $d_i$ ($1 \le d_i \le n$). These are the heights of the people in the group, in the order in which they’re standing. The sequence is guaranteed to be a permutation of the integers $1$ through $n$.</p>

## 출력 

 <p>Output a single integer, which is the number of pairs of people who are taller than everyone between them.</p>

