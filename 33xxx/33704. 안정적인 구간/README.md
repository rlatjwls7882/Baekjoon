# [Silver II] 안정적인 구간

[문제 링크](https://www.acmicpc.net/problem/33704) 

## 문제 설명

<p>길이가 $N$인 배열 $A$가 주어진다. 길이가 $2$ 이상인 연속된 부분 배열 $B = \left\{A_i, A_{i+1}, \cdots, A_j \right\}$가 다음 조건을 만족하면, 쿠는 구간 $\left[i,j \right]$에서 안정감을 느낀다.</p>

<ul>
	<li>$K$를 $B$의 길이라고 할 때, $B$의 $\left\lceil \frac{K}{2}\right\rceil$번째 원소의 값과 $B$를 오름차순으로 정렬했을 때의 $\left\lceil \frac{K}{2}\right\rceil$번째 원소의 값이 같다.</li>
</ul>

<p>배열 $A$에 쿠가 안정감을 느낄 수 있는 구간이 존재하는지 판별해 보자.</p>

## 입력 

 <p>첫째 줄에 배열 $A$의 길이 $N$이 주어진다. $\left(2\leq N\leq 100\, 000\right)$</p>

<p>둘째 줄에 $N$개의 정수 $A_1,\, A_2,\, \cdots,\, A_N$이 공백으로 구분되어 주어진다. $\left(1\leq A_i\leq 10^9\right)$</p>

## 출력 

 <p>배열 $A$에 쿠가 안정감을 느끼는 구간이 존재한다면 <span style="color:#e74c3c;"><code>YES</code></span>를, 그렇지 않다면 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>

