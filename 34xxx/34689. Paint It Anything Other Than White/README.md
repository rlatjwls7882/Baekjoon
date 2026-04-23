# [Diamond V] Paint It Anything Other Than White

[문제 링크](https://www.acmicpc.net/problem/34689) 

## 문제 설명

<p>우리는 빛의 3가지 원색 R, G, B을 조합하여 다양한 색을 만들어 낼 수 있다. 이 문제에서는 R, G, B가 이분법적으로 포함되어 있거나, 포함되어 있지 않은 $2^3 = 8$가지 색에 대해서만 생각해 보자.</p>

<p>각 색의 R, G, B 포함 여부는 다음과 같다.</p>

<table class="table table-bordered td-center th-center table-center-50">
<thead>
<tr>
<th>색</th>
<th>ID</th>
<th>R 포함</th>
<th>G 포함</th>
<th>B 포함</th>
</tr>
</thead>
<tbody>
<tr>
<td>검정</td>
<td>K</td>
<td>X</td>
<td>X</td>
<td>X</td>
</tr>
<tr>
<td>빨강</td>
<td>R</td>
<td>O</td>
<td>X</td>
<td>X</td>
</tr>
<tr>
<td>초록</td>
<td>G</td>
<td>X</td>
<td>O</td>
<td>X</td>
</tr>
<tr>
<td>파랑</td>
<td>B</td>
<td>X</td>
<td>X</td>
<td>O</td>
</tr>
<tr>
<td>노랑</td>
<td>Y</td>
<td>O</td>
<td>O</td>
<td>X</td>
</tr>
<tr>
<td>청록</td>
<td>C</td>
<td>X</td>
<td>O</td>
<td>O</td>
</tr>
<tr>
<td>보라</td>
<td>P</td>
<td>O</td>
<td>X</td>
<td>O</td>
</tr>
<tr>
<td>흰색</td>
<td>W</td>
<td>O</td>
<td>O</td>
<td>O</td>
</tr>
</tbody>
</table>

<p>두 가지 이상의 색의 합성은, 각 색에 포함된 원색의 집합을 합집합한 색을 의미한다. 예를 들어, 여러 개의 색 중 원색 R을 포함하는 색이 하나라도 있다면 최종 색은 원색 R을 포함하게 된다.</p>

<p>$1$부터 $N$까지 번호가 매겨진 $N$개의 칸이 있고, 각 칸은 검정, 빨강, 초록, 파랑, 노랑, 청록, 보라, 흰색 중 하나의 색을 가질 수 있다.</p>

<p>모든 칸은 흰색인 상태에서 시작한다.</p>

<p>이때 다음의 쿼리를 수행하는 프로그램을 작성하시오.</p>

<ul>
<li>$Q$ $i$ $j$: $i\le a\le b\le j$를 만족하며, $a,a+1\dots b-1,b$번째 칸을 합성한 색이 흰색이 아닌 $a,b$에 대해 $b-a+1$의 최댓값을 출력한다. 만약 이와 같은 $a,b$가 존재하지 않는다면 $0$을 출력한다.</li>
<li>$U$ $i$ $X$: $i$번째 칸의 색을 $X$로 바꾼다. $X$는 <span style="color:#e74c3c;"><code>K</code></span>, <span style="color:#e74c3c;"><code>R</code></span>, <span style="color:#e74c3c;"><code>G</code></span>, <span style="color:#e74c3c;"><code>B</code></span>, <span style="color:#e74c3c;"><code>Y</code></span>, <span style="color:#e74c3c;"><code>C</code></span>, <span style="color:#e74c3c;"><code>P</code></span>, <span style="color:#e74c3c;"><code>W</code></span> 중 하나이며, 위 표의 ID에 대응된다.</li>
</ul>

## 입력 

 <p>첫째 줄에 칸의 개수 $N$, 쿼리의 개수 $K$가 공백으로 구분되어 주어진다. $(1\le N\le 100\, 000;$ $1 \le K \le 200\,000)$</p>

<p>다음 $K$개의 줄에 걸쳐 쿼리가 한 줄에 하나씩 주어진다.</p>

<p>입력으로 주어지는 모든 수는 정수이다.</p>

## 출력 

 <p>한 줄에 하나씩, 각각의 쿼리의 결과를 순서대로 출력한다.</p>

