# [Bronze II] 비밀번호

[문제 링크](https://www.acmicpc.net/problem/33702) 

## 문제 설명

<p>쿠는 $9$자리 비밀번호를 정하려고 한다. 비밀번호 버튼은 아래와 같이 생겼다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="height: 100px; width: 100px;">
	<tbody>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">3</td>
		</tr>
		<tr>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">6</td>
		</tr>
		<tr>
			<td style="text-align: center;">7</td>
			<td style="text-align: center;">8</td>
			<td style="text-align: center;">9</td>
		</tr>
	</tbody>
</table>

<p>쿠가 만들고 싶은 비밀번호의 조건은 아래와 같다.</p>

<ul>
	<li>가장 먼저 $K$가 적힌 버튼을 눌러야 한다.</li>
	<li>이후 직전에 누른 버튼과 상하좌우로 인접한 버튼을 눌러야 한다.</li>
	<li>각 버튼을 한 번씩만 눌러야 하며, 모든 버튼을 눌러야 한다.</li>
</ul>

<p>$K$가 적힌 버튼에서 비밀번호를 누르기 시작할 때 만들 수 있는 서로 다른 비밀번호의 개수를 구해보자.</p>

## 입력 

 <p>쿠가 비밀번호를 가장 먼저 누르는 버튼에 적힌 수 $K$가 주어진다. $\left(1 \leq K \leq 9\right)$</p>

## 출력 

 <p>$K$가 적힌 버튼에서 비밀번호를 누르기 시작할 때, 만들 수 있는 서로 다른 비밀번호의 개수를 출력한다.</p>

