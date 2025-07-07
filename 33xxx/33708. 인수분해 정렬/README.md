# [Gold III] 인수분해 정렬

[문제 링크](https://www.acmicpc.net/problem/33708) 

## 문제 설명

<p>쿠는 길이가 $N$인 수열 $A$를 가지고 있다. 쿠는 다음과 같은 연산을 통해 수열을 정렬하려고 한다.</p>

<ul>
	<li>$1 \le i \lt N$인 $i$를 선택하여, $A_i$와 $A_{i+1}$을 각각 $a\times b= A_i \times A_{i+1}$과 $a+b \neq A_i+A_{i+1}$을 만족하는 두 양의 정수 $a$, $b$로 바꾼다.</li>
</ul>

<p>연산을 원하는 만큼 시행하여, 수열을 <strong>비내림차순</strong>으로 만들 수 있는지 판별해 보자.</p>

## 입력 

 <p>첫째 줄에 수열의 길이를 나타내는 정수 $N$이 주어진다. $\left(2 \le N \le 200\, 000\right)$</p>

<p>둘째 줄에 $N$개의 정수 $A_1,\, A_2,\, \cdots,\, A_N$이 공백으로 구분되어 주어진다. $\left(1 \le A_i \le 10^6 \right)$</p>

## 출력 

 <p>수열 $A$를 비내림차순으로 만들 수 있다면 <span style="color:#e74c3c;"><code>YES</code></span>를, 그렇지 않다면 <code><span style="color:#e74c3c;">NO</span></code>를 출력한다.</p>

