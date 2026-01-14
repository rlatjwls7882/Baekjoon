# [Bronze IV] 2025

[문제 링크](https://www.acmicpc.net/problem/35097) 

## 문제 설명

<p>In Japan, the multiplication table below is learned in elementary schools.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f7d236fd-d833-4566-8e52-5433fe63fd41/-/preview/" style="width: 300px; height: 275px;"></p>

<p>Such a table with $9 \times 9$ items, called <em>kuku</em> in Japanese, is not necessarily a world standard. In some cultures, $12 \times 12$ or $20 \times 20$ tables are learned.</p>

<p>Interestingly, the total of all the $9 \times 9$ items in the kuku table is $2025$, which happens to be this year. Are there any other interesting cases like this?</p>

<p>Your task is to compute, for a given integer $n$, the sum of all the items in an $n \times n$ multiplication table. More specifically, find $$\displaystyle\sum_{a=1}^n \sum_{b=1}^n ab\text{.}$$</p>

## 입력 

 <p>The input consists of at most $100$ test cases. Each test case is a line containing one integer $n$ ($1 ≤ n ≤ 100$).</p>

<p>The end of the input is indicated by a line consisting only of a zero.</p>

## 출력 

 <p>For each test case, output the value of $$\displaystyle\sum_{a=1}^n \sum_{b=1}^n ab$$ in a line.</p>

