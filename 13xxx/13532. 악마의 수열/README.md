# [Gold I] 악마의 수열

[문제 링크](https://www.acmicpc.net/problem/13532) 

### 문제 설명

<p>악마의 수열은 다음과 같이 정의된다.</p>

<ul>
	<li>x<sub>0</sub> = 0</li>
	<li>x<sub>1</sub> = 1</li>
	<li>x<sub>n</sub> = (x<sub>n-1</sub> + x<sub>n-2</sub>) / 2</li>
</ul>

<p>예를 들어, x<sub>10</sub> = 0.666015625 이다. n이 주어졌을 때, x<sub>n</sub>의 첫부분에 6이 몇 개 연속되는지 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 n (2 ≤ n ≤ 100000)이 주어진다.</p>

### 출력 

 <p>x<sub>n</sub>의 첫부분에 6이 몇 개 연속되는지 출력한다.</p>

