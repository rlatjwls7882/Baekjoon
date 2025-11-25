# [Silver V] 같은 배열

[문제 링크](https://www.acmicpc.net/problem/34761) 

## 문제 설명

<p>길이가 $N$인 배열 $A_1, A_2, \cdots , A_N$과, 길이가 $2N$인 배열 $B_1, B_2, \cdots ,B_{2N}$이 주어진다.</p>

<p>당신은 아래의 연산을 배열 $A$에 $N$번 수행해야 한다.</p>

<ul>
<li>현재 배열 $A$의 길이를 $M$이라고 할 때, $1\leq i\leq M$를 만족하는 $i$를 고른다.</li>
<li>이후 $A_i$를 배열 $A$의 뒤에 삽입한다. 즉, 배열 $A$는 $[A_1, A_2, \cdots , A_M, A_i ]$가 된다.</li>
</ul>

<p>배열 $A$에 연산을 적절하게 $N$번 수행했을 때, $B$와 동일하게 만들 수 있는지 판정해 보자.</p>

## 입력 

 <p>첫째 줄에 배열 $A$의 초기 길이를 의미하는 정수 $N$이 주어진다. $(1\leq N\leq 200\, 000)$</p>

<p>둘째 줄에 정수 $A_1, A_2, \cdots , A_N$이 공백으로 구분되어 주어진다. $(1\leq A_i\leq N)$</p>

<p>셋째 줄에 정수 $B_1, B_2, \cdots ,B_{2N}$이 공백으로 구분되어 주어진다. $(1\leq B_i\leq N)$</p>

## 출력 

 <p>배열 $A$에 연산을 적절하게 $N$번 수행했을 때, $B$와 동일하게 만들 수 있다면 <code><span style="color:#e74c3c;">YES</span></code>를, 그렇지 않다면 <code><span style="color:#e74c3c;">NO</span></code>를 출력한다.</p>

