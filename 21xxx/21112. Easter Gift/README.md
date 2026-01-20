# [Gold III] Easter Gift

[문제 링크](https://www.acmicpc.net/problem/21112) 

## 문제 설명

<p>Wesley got an array of $N$ elements ($a_1, a_2, \ldots, a_N$) for Easter, and is eager to sort it (so that $a_1 \le a_2 \le \ldots \le a_N$). Bored, Wesley decided to make it harder on himself by only allowing himself to swap two elements if the absolute difference between them is less than or equal to $K$. Note that the elements can be anywhere; as long as their absolute difference is less than or equal to $K$, Wesley can swap them.</p>

<p>Unfortunately, Wesley quickly realized that it might not be possible to sort the array. He then wonders: what is the minimum value of $K$ required to be able to sort the array?</p>

## 입력 

 <p>The first line contains an integer $N$, the number of elements in the array ($1 \le N \le 2 \cdot 10^5$).</p>

<p>The next line contains $N$ integers $a_1, a_2, \ldots, a_N$, the array itself ($1 \le a_i \le 10^{18}$).</p>

## 출력 

 <p>Output the minimum value of $K$ required to be able to sort the array. If the elements are already sorted, you should output $0$.</p>

