# [Silver V] SCSC 기차 놀이

[문제 링크](https://www.acmicpc.net/problem/33967) 

## 문제 설명

<p>기차를 좋아하는 SCSC 부원 연호는 S와 C 모양을 한 줄로 이어 기차를 만들어 보고자 한다. 연호가 기차를 만드는 데에 사용할 S와 C 모양 차량들은 다음 그림과 같다.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td style="text-align: center;"><img alt="" src=""></td>
			<td style="text-align: center;"><img alt="" src=""></td>
			<td style="text-align: center;"><img alt="" src=""></td>
			<td style="text-align: center;"><img alt="" src=""></td>
		</tr>
		<tr>
			<td style="text-align: center;">그림1. S-5 모양 차량</td>
			<td style="text-align: center;">그림2. C-[ 모양 차량</td>
			<td style="text-align: center;">그림3. S-2 모양 차량</td>
			<td style="text-align: center;">그림4. C-] 모양 차량</td>
		</tr>
	</tbody>
</table>

<p>연호가 차량을 일렬로 빈틈없이 연결할 때 차량의 벽으로 구분되는 각각의 공간을 기차간(汽車間)이라고 한다. 이때 연호는 자기가 만든 SCSC 기차가 총 몇 개의 기차간을 가지게 될지 궁금해졌다. 연호의 SCSC 기차 설계도가 주어질 때, SCSC 기차가 총 몇 개의 기차간을 가지게 될지 구해보자!</p>

## 입력 

 <p>첫째 줄에 SCSC 기차 설계도에 포함된 차량의 수를 나타내는 정수 $N$이 주어진다. $(2 \le N \le 200\,000)$</p>

<p>둘째 줄에 문자열 <span style="color:#e74c3c;"><code>2</code></span>,<span style="color:#e74c3c;"> <code>5</code></span>, <span style="color:#e74c3c;"><code>[</code></span>, <span style="color:#e74c3c;"><code>]</code></span>로 이루어진 연호의 SCSC 기차 설계도가 주어진다.</p>

<p>설계도의 처음은 반드시 <span style="color:#e74c3c;"><code>[</code></span>로 시작하고, 끝은 반드시 <span style="color:#e74c3c;"><code>]</code></span>로 끝난다.</p>

## 출력 

 <p>첫째 줄에 연호의 설계도에 따라 만들어질 SCSC 기차의 기차간 총 개수를 출력한다.</p>

