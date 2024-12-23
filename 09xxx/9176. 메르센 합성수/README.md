# [Gold IV] 메르센 합성수

[문제 링크](https://www.acmicpc.net/problem/9176) 

### 문제 설명

<p>메르센 수는 2<sup>P</sup>-1 (P는 소수) 인 수를 말한다.</p>

<p>메르센 수는 P가 작을 땐 모두 소수인 듯 보인다.</p>

<table class="table table-bordered" style="width:40%">
	<thead>
		<tr>
			<th>Prime</th>
			<th>Corresponding Mersenne Number</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>2</td>
			<td>4-1 = 3 - prime</td>
		</tr>
		<tr>
			<td>3</td>
			<td>8-1 = 7 - prime</td>
		</tr>
		<tr>
			<td>5</td>
			<td>32-1 = 31 - prime</td>
		</tr>
		<tr>
			<td>7</td>
			<td>128-1 = 127 - prime</td>
		</tr>
	</tbody>
</table>

<p>하지만 P가 충분히 큰 소수일 경우, 메르센 수는 소수가 아닐 수도 있다.</p>

<p>이렇게 메르센 수이면서 소수가 아닌 수를 '메르센 합성수' 라 하자.</p>

<p>이때, K(< 63)가 주어지면, P가 K 이하인 모든 메르센 합성수를 찾아 소인수분해하는 프로그램을 작성하여라.</p>

### 입력 

 <p>입력에는 단 하나의 정수 K가 주어진다. (K < 63)</p>

### 출력 

 <p>P<=K 인 모든 메르센 합성수 2 <sup>P</sup>-1에 대해, 예제 출력과 같은 형식으로 소인수분해한 결과를 출력한다.</p>

<p>메르센 합성수 자체가 작은 수부터 출력해야 하며, 각 소인수들은 오름차순으로 출력되어야 한다.</p>

