# [Gold I] 경인 국가의 행사

[문제 링크](https://www.acmicpc.net/problem/33152) 

## 문제 설명

<p>2024년, shake! 나라가 건국되었다. 건국을 맞아 shake! 나라는 초대 대통령을 선출하고자 하며, $X$ 후보와 $Y$ 후보, 총 $2$명의 후보가 당선을 놓고 경쟁하게 된다. shake! 나라는 총 $N$개의 도시로 이루어져 있으며 $i$번 도시에는 $A_{i}(1\leq i \leq N)$명의 국민들이 거주하고 있다. 민주주의 국가인 shake! 나라는 대통령을 뽑기 위한 선거 방식을 고민하던 중, 수연이와 현빈이가 각자 아이디어를 내게 되었다.</p>

<ol>
	<li>수연이의 방식
	<ul>
		<li>shake! 나라의 국민들이 투표를 진행하고, 각 국민들이 거주하는 도시와 관계 없이 표를 합산한다.</li>
		<li>최종적으로 더 많은 표를 얻은 후보가 당선된다.</li>
	</ul>
	</li>
	<li>현빈이의 방식
	<ul>
		<li>shake! 나라의 국민들이 투표를 진행하고, 각 국민들의 표는 국민들이 거주하는 도시의 표에 합계된다. </li>
		<li>각 도시마다 더 많은 표를 얻은 후보가 해당 도시에서 승리한다.</li>
		<li>최종적으로 더 많은 도시에서 승리한 후보가 당선된다.</li>
	</ul>
	</li>
</ol>

<p>예를 들어, $3$개의 도시에 각각 $801$명, $556$명, $500$명이 살고 있고, 투표 결과가 아래와 같다고 해보자.</p>

<table class="table table-bordered table-center-50">
	<tbody>
		<tr>
			<td style="text-align: center;"><strong>후보</strong></td>
			<td style="text-align: center;"><strong>$1$번 도시</strong></td>
			<td style="text-align: center;"><strong>$2$번 도시</strong></td>
			<td style="text-align: center;"><strong>$3$번 도시</strong></td>
		</tr>
		<tr>
			<td style="text-align: center;">$X$</td>
			<td style="text-align: center;">$650$</td>
			<td style="text-align: center;">$100$</td>
			<td style="text-align: center;">$180$</td>
		</tr>
		<tr>
			<td style="text-align: center;">$Y$</td>
			<td style="text-align: center;">$151$</td>
			<td style="text-align: center;">$456$</td>
			<td style="text-align: center;">$320$</td>
		</tr>
	</tbody>
</table>

<p>만약 선거를 수연이의 방식으로 진행하게 된다면 $X$ 후보는 $650+100+180=930$표, $Y$ 후보는 $151+456+320=927$표를 받아 $X$ 후보가 당선된다. 반면 현빈이의 방식으로 선거를 진행하게 되면, $X$ 후보는 $1$번 도시에서만 승리하고, $Y$ 후보는 $2$, $3$번 도시에서 승리하여 $Y$ 후보가 당선된다.</p>

<p>모든 국민이 투표에 참여하며 하나의 후보에게만 투표를 할 수 있을 때 선거 진행을 수연이의 방식으로 하면 $X$ 후보가, 현빈이의 방식으로 하면 $Y$ 후보가 승리하는 경우를 찾아보자. 단, 투표가 동률이라면 두 후보 모두 패배한 것으로 생각한다.</p>

## 입력 

 <p>첫 번째 줄에 테스트 케이스의 개수 $T$가 주어진다.$(1\leq T\leq 100\,000)$</p>

<p>다음 줄부터 각 테스트 케이스의 정보가 주어진다. 하나의 테스트 케이스는 두 개의 줄로 이루어져 있으며, 첫 번째 줄에 shake! 나라의 도시 수 $N$이 주어진다. $\left(1\leq N \leq 10^{6}\right)$</p>

<p>두 번째 줄에 각 도시에 사는 국민의 수를 나타내는 정수 $A_{1},A_{2},\dots,A_{N}$이 공백으로 구분되어 주어진다. $(1\leq A_{i}\leq 10^{9})$</p>

<p>모든 테스트 케이스의 $N$의 합은 $10^6$을 넘지 않는다.</p>

## 출력 

 <p>각 테스트 케이스마다 shake! 나라의 선거 진행을 수연이의 방식으로하면 $X$ 후보가, 현빈이의 방식으로하면 $Y$ 후보가 승리하는 경우가 존재한다면, 첫 번째 줄에 <span style="color:#e74c3c;"><code>YES</code></span>를 출력하고 두 번째 줄에 $1$번부터 $N$번 도시까지 $X$ 후보가 얻은 표의 수를, 세 번째 줄에 $Y$ 후보가 얻은 표의 수를 공백으로 구분하여 출력한다.</p>

<p>그렇지 않다면 첫 번째 줄에 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>

<p>가능한 경우가 여러 개라면, 그중 아무거나 출력한다.</p>

