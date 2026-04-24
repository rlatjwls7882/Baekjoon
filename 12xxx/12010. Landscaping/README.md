# [Diamond I] Landscaping

[문제 링크](https://www.acmicpc.net/problem/12010) 

## 문제 설명

<p>Farmer John is building a nicely-landscaped garden, and needs to move a large amount of dirt in the process.</p>

<p>The garden consists of a sequence of \(N\) flowerbeds (\(1 \leq N \leq 100,000\)), where flowerbed \(i\) initially contains \(A_i\) units of dirt. Farmer John would like to re-landscape the garden so that each flowerbed \(i\) instead contains \(B_i\) units of dirt. The \(A_i\)'s and \(B_i\)'s are all integers in the range \(0 \ldots 10\).</p>

<p>To landscape the garden, Farmer John has several options: he can purchase one unit of dirt and place it in a flowerbed of his choice for \(X\) units of money. He can remove one unit of dirt from a flowerbed of his choice and have it shipped away for \(Y\) units of money. He can also transport one unit of dirt from flowerbed \(i\) to flowerbed \(j\) at a cost of \(Z\) times \(|i-j|\). Please compute the minimum total cost for Farmer John to complete his landscaping project.</p>

## 입력 

 <p>The first line of input contains \(N\), \(X\), \(Y\), and \(Z\) (\(0 \leq X, Y \le 10^8; 0 \le Z \leq 1000\)). Line \(i+1\) contains the integers \(A_i\) and \(B_i\).</p>

## 출력 

 <p>Please print the minimum total cost FJ needs to spend on landscaping.</p>

