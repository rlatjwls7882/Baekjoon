# [Gold IV] 나비의 간식을 훔쳐먹은 춘배

[문제 링크](https://www.acmicpc.net/problem/30407) 

## 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/615d1ace-c9b7-4d7f-ae2a-1cd6d0cb90fe/-/preview/"></p>

<p>춘배가 나비의 간식을 뺏어 먹고 도망가자 화난 나비는 냥냥펀치를 날리려 한다. </p>

<p><strong>냥냥펀치</strong> : 문제에서 주어진 $R_i$에서 춘배와 나비 사이의 거리를 뺀 값만큼 춘배의 체력이 깎인다. 데미지가 $10$이고 현재 춘배와 나비 사이의 거리가 $3$일 경우 $7$만큼 체력이 깎인다. <strong>체력이 깎이는 양은 음수가 될 수 없다.</strong></p>

<p>춘배는 도망가다 상자를 발견해서 숨게 되었고 자신이 가진 $3$가지 기술로 대응하려 한다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 500px;">
	<tbody>
		<tr>
			<td style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6d08a486-8bd2-4952-9b57-f4d1d3258873/-/preview/"></td>
			<td style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/600456a1-4c88-49a0-a381-fe50d672fb64/-/preview/"></td>
			<td style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ceb2aa77-d110-438a-a481-560787fe08c4/-/preview/"></td>
		</tr>
		<tr>
			<td style="text-align: center;">웅크리기</td>
			<td style="text-align: center;">네발로 걷기</td>
			<td style="text-align: center;">깜짝 놀라게 하기</td>
		</tr>
	</tbody>
</table>

<ul>
	<li><strong>웅크리기:</strong> 나비가 공격할 시 데미지가 절반 감소한다. 이는 데미지가 거리만큼 약해진 후 계산된다. <strong>단, 감소 후 데미지의 소수점 아래는 버린다.</strong></li>
	<li><strong>네발로 걷기: </strong>문제에서 주어진 값 $K$ 만큼 나비와 멀어지는 방향으로 이동할 수 있다.</li>
	<li><strong>깜짝 놀라게 하기: </strong>나비의 <strong>다음</strong> 행동을 $1$번 무시한다. $i$번째 사용 할 시 $R_{i+1}$를 무시한다. <strong>단 $1$번 사용할 수 있고 $N$번째에 사용 시 아무 일도 일어나지 않는다.</strong></li>
</ul>

<p>한 턴은 춘배의 기술, 냥냥펀치, 데미지 계산의 순서대로 실행된다. 춘배는 턴마다 $1$개의 기술만 쓸 수 있다. 나비가 모든 $N$개의 냥냥펀치를 하여 지칠 때까지 춘배가 유지할 수 있는 최대 체력을 알아보자. 어떤 행동을 해도 체력이 $0$이하가 된다면 $-1$을 출력한다.</p>

## 입력 

 <p>첫 번째 줄에 나비가 지칠 때까지의 냥냥펀치 수 $N$이 정수로 주어진다. $(1 \le N \le 18)$</p>

<p>두 번째 줄에 춘배의 체력 $H$, 현재 나비 사이의 거리 $D$, 춘배가 <strong>네발로 걷기</strong> 시 이동하는 거리 $K$가 공백으로 구분되어 주어진다. $(1  \le H \le 1000,  1  \le D \le 10,  1  \le K \le 3)$</p>

<p>세 번째 줄부터 $N$개의 줄에 걸쳐 $i$번째 냥냥펀치의 데미지 $R_i$가 주어진다. $(1  \le R_i \le 100)$</p>

## 출력 

 <p>춘배가 가질 수 있는 최대 체력을 출력한다. 답이 $0$ 이하일 경우 $-1$을 출력한다.</p>

