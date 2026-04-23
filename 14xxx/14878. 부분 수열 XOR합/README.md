# [Diamond IV] 부분 수열 XOR합

[문제 링크](https://www.acmicpc.net/problem/14878) 

## 문제 설명

<p>총 n개의 수로 이루어진 수열 A = a<sub>0</sub>, a<sub>1</sub>, ..., a<sub>n-1</sub>가 있다. 수열의 부분 수열은 다음과 같이 정의할 수 있다.</p>

<p>0 ≤ i ≤ j < n이면서, a<sub>i</sub>, a<sub>i+1</sub>, ..., a<sub>j-1</sub>, a<sub>j</sub></p>

<p>예를 들어, n = 3인 경우 아래와 같은 6개의 부분 수열이 존재한다.</p>

<ol>
	<li>a<sub>0</sub></li>
	<li>a<sub>1</sub></li>
	<li>a<sub>2</sub></li>
	<li>a<sub>0</sub>, a<sub>1</sub></li>
	<li>a<sub>1</sub>, a<sub>2</sub></li>
	<li>a<sub>0</sub>, a<sub>1</sub>, a<sub>2</sub></li>
</ol>

<p>크기가 n인 수열 A가 주어졌을 때, 모든 부분 수열에 대해서 XOR 합을 구한다. XOR 합이란 수열에 포함되어있는 모든 수를 XOR한 것이다. 부분 수열은 총 n(n+1)/2개가 존재하기 때문에, XOR 합도 n(n+1)/2개가 존재하게 된다. 그 다음, 가장 많이 나오는 XOR 합이 몇 번 나오는지 구하는 프로그램을 작성하시오.</p>

## 입력 

 <p>첫째 줄에 수열 A의 크기 n(1 ≤ n ≤ 10<sup>5</sup>)이 주어진다. 둘째 줄에는 a<sub>0</sub>, a<sub>1</sub>, ..., a<sub>n-1</sub>이 주어진다. (1 ≤ a<sub>i</sub> < 2<sup>16</sup>)</p>

## 출력 

 <p>첫째 줄에 두 정수를 공백으로 구분해 출력한다. 첫 번째 정수는 XOR 합으로 가장 많이 등장한 정수이고, 두 번째 정수는 그 정수의 등장한 횟수이다. 만약, 가장 많이 등장한 정수가 여러 가지라면, 가장 작은 것을 출력한다.</p>

