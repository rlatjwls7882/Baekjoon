# [Silver II] 제곱수 순열$^2$

[문제 링크](https://www.acmicpc.net/problem/34347) 

## 문제 설명

<p>당신은 다음 조건을 만족하는 길이 $N$의 순열 $A=[A_1,A_2,\cdots,A_N], B=[B_1,B_2,\cdots,B_N]$을 찾아야 한다.</p>

<ul>
	<li>$1\le i<N$인 모든 정수 $i$에 대해 $A_i^{ B_i} \times A_{i+1}^{ B_{i+1}}$가 제곱수이다.</li>
</ul>

## 입력 

 <p>첫째 줄에 테스트 케이스의 개수 $T$가 주어진다. $(1\le T\le 100)$</p>

<p>각 테스트 케이스의 첫째 줄에 양의 정수 $N$이 주어진다. $(2\le N\le 5\,000)$</p>

<p>모든 테스트 케이스에서 $N$의 합은 $5\,000$을 넘지 않는다.</p>

## 출력 

 <p>각 테스트 케이스의 첫째 줄에 순열 $A, B$가 존재한다면 <code><span style="color:#e74c3c;">YES</span></code>를, 존재하지 않는다면 <code><span style="color:#e74c3c;">NO</span></code>를 출력한다.</p>

<p><code><span style="color:#e74c3c;">YES</span></code>를 출력하였다면 둘째 줄에 $A_1, A_2, \cdots, A_N$을 공백으로 구분하여 출력한다.</p>

<p><code><span style="color:#e74c3c;">YES</span></code>를 출력하였다면 셋째 줄에 $B_1, B_2, \cdots, B_N$을 공백으로 구분하여 출력한다.</p>

<p>답이 여러 개 있다면, 그중 하나를 아무 것이나 출력한다.</p>

