# [Bronze II] NEMODEMIC

[문제 링크](https://www.acmicpc.net/problem/35149) 

## 문제 설명

<p><strong>NEMODEMIC</strong>은 <a href="https://apps.apple.com/kr/app/네모데믹/id6757725643">App Store</a>와 <a href="https://play.google.com/store/apps/details?id=kr.yurim.nemodemic">Google Play Store</a>에서 화제가 되고 있는 2D 퍼즐게임이다. <strong>NEMODEMIC</strong>는 바이러스가 퍼지는 격자 보드에서 플레이어가 <strong>시작점</strong>에서 출발하여 <strong>탈출구</strong>를 향해 이동하는 탈출 게임이다. 사방으로 확산되는 <strong>바이러스</strong>를 피해서 전략적으로 <strong>백신</strong>을 수집하며 <strong>탈출구</strong>에 도달해야 한다.</p>

<p><strong>NEMODEMIC</strong>은 $N$개의 행과 $M$개의 열로 이루어진 격자 모양의 보드에서 진행된다. 보드의 각 칸은 <strong>빈 칸</strong>, <strong>벽</strong>, <strong>바이러스</strong>, <strong>백신</strong>, <strong>시작점</strong>, <strong>탈출구</strong> 중 하나이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5fa0d649-943f-44a1-84d2-00db989623c6/-/preview/" style="width: 600px; max-width: 100%;"></p>

<p><strong>빈 칸</strong>: 플레이어가 이동하거나 바이러스가 확산될 수 있는 칸이다.</p>

<p><strong>벽</strong>: 플레이어가 뚫고 지나가거나 위치할 수 없으며, 바이러스 역시 벽을 뚫고 확산될 수 없다.</p>

<p><strong>바이러스</strong>: 상, 하, 좌, 우 네 방향 중 <strong>활성화된 방향</strong>으로만 확산된다. 바이러스는 <strong>한 방향 바이러스</strong>와 <strong>모든 방향 바이러스</strong>로 나뉜다. <strong>한 방향 바이러스</strong>는 상, 하, 좌, 우 중 한 방향만 <strong>활성화된 방향</strong>이다. <strong>모든 방향 바이러스</strong>는 상, 하, 좌, 우 네 방향 모두 <strong>활성화된 방향</strong>이다. 확산은 해당 방향 혹은 방향들로 매턴 한 칸씩 확산된다.</p>

<p><strong>백신</strong>: 플레이어가 백신 칸에 도달하면 백신을 수집한다. 백신 하나당 한 개의 바이러스가 확산된 칸을 지나갈 수 있게 한다. 플레이어는 여러 개의 백신을 수집하여 가지고 있을 수 있다. 백신이 있는 칸도 바이러스가 확산될 수 있으며, 이미 바이러스가 확산된 칸에 있는 백신을 수집하기 위해서는 기존에 가지고 있는 백신을 하나 소모해야만 한다.</p>

<p><strong>시작점</strong>: 플레이어가 시작하는 위치로, 이를 제외하고는 <strong>빈 칸</strong>과 같다.</p>

<p><strong>탈출구</strong>: 플레이어가 도착해야 하는 위치로, 이를 제외하고는 <strong>빈 칸</strong>과 같다. 탈출구에도 바이러스가 확산될 수 있으며, 바이러스가 확산된 탈출구로 이동하기 위해서는 백신을 하나 소모해야만 한다.</p>

<p>플레이어는 매턴 상, 하, 좌, 우 네 방향 중 벽이 아닌 한 방향으로 한 칸 움직인다. 이때 바이러스가 이미 어떤 칸에 확산되었거나 확산된 턴에는, 백신을 하나 소모해야 해당 칸으로 움직일 수 있다. 플레이어는 보드를 벗어날 수 없다.</p>

<p>바이러스 확산과 관련해 한 가지 예시를 보자. $N=5$, $M=5$이고 $\left( 2,2 \right)$에 벽이 $1$개, $\left( 3,3 \right)$에 우측 방향 <strong>한 방향 바이러스</strong>가 $1$개, $\left( 4,1 \right)$에 백신이 $1$개, $\left( 5,4 \right)$에 <strong>모든 방향 바이러스</strong>가 $1$개 있는 보드를 생각하자. <strong>한 방향 바이러스</strong>는 지정된 방향으로만, <strong>모든 방향 바이러스</strong>는 네 방향 모두로 확산된다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a512db0a-109a-40d6-ba44-039541780caf/-/preview/" style="width: 600px; max-width: 100%;"></p>

<p>이 게임은 여러 스테이지로 구성되어 있으며, 각 스테이지는 보드에 존재하는 칸들의 조건에 따라 아래와 같이 $1$단계부터 $4$단계까지의 <strong>난이도</strong> 중 하나를 가진다. 여러 난이도의 조건을 동시에 만족하면 가장 낮은 난이도로 판단된다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered centered-table" style="width: 800px; max-width: 100%;">
<thead>
<tr>
			<th scope="col" style="text-align: center; vertical-align: middle;"><strong>난이도</strong></th>
			<th scope="col" style="text-align: center; vertical-align: middle;"><strong>빈 칸</strong></th>
			<th scope="col" style="text-align: center; vertical-align: middle;"><strong>벽</strong></th>
			<th scope="col" style="text-align: center; vertical-align: middle;"><strong>한 방향 바이러스</strong></th>
			<th scope="col" style="text-align: center; vertical-align: middle;"><strong>모든 방향 바이러스</strong></th>
			<th scope="col" style="text-align: center; vertical-align: middle;"><strong>백신</strong></th>
			<th scope="col" style="text-align: center; vertical-align: middle;"><strong>시작점</strong></th>
			<th scope="col" style="text-align: center; vertical-align: middle;"><strong>탈출구</strong></th>
</tr>
</thead>
<tbody>
<tr>
			<td colspan="8" style="text-align: center; vertical-align: middle; height: 1px; padding:0">
			<div style="height:1px;"> </div>
</td>
</tr>
<tr>
			<td style="text-align: center; vertical-align: middle;">$1$</td>
			<td style="text-align: center; vertical-align: middle;">제한 없음</td>
			<td style="text-align: center; vertical-align: middle;">$1$개 이하</td>
			<td style="text-align: center; vertical-align: middle;">방향과 관계없이 총 $1$개 이하</td>
			<td colspan="2" rowspan="2" style="text-align: center; vertical-align: middle;">$0$개</td>
			<td colspan="2" rowspan="4" style="text-align: center; vertical-align: middle;">각각 $1$개</td>
</tr>
<tr>
			<td style="text-align: center; vertical-align: middle;">$2$</td>
			<td colspan="3" rowspan="2" style="text-align: center; vertical-align: middle;">제한 없음</td>
</tr>
<tr>
			<td style="text-align: center; vertical-align: middle;">$3$</td>
			<td style="text-align: center; vertical-align: middle;">$0$개</td>
			<td style="text-align: center; vertical-align: middle;">제한 없음</td>
</tr>
<tr>
			<td style="text-align: center; vertical-align: middle;">$4$</td>
			<td colspan="5" rowspan="1" style="text-align: center; vertical-align: middle;">제한 없음</td>
</tr>
</tbody>
</table>

<p>게임 올 클리어를 목표로 하는 유림이는 주어지는 스테이지의 보드를 보고 해당 스테이지의 <strong>난이도</strong>를 알고 싶다. 주어진 스테이지의 <strong>난이도</strong>를 알아내 보자.</p>

## 입력 

 <p>첫 번째 줄에 스테이지 보드의 행과 열의 개수 $N,M(1\le N,M\le 50)$이 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄부터 $N$줄에 걸쳐 보드판의 각 행을 나타내는 길이 $M$의 <span style="color:#e74c3c;"><code>.</code></span>, <span style="color:#e74c3c;"><code>#</code></span>, <span style="color:#e74c3c;"><code>U</code></span>, <span style="color:#e74c3c;"><code>D</code></span>, <span style="color:#e74c3c;"><code>L</code></span>, <span style="color:#e74c3c;"><code>R</code></span>, <span style="color:#e74c3c;"><code>A</code></span>, <span style="color:#e74c3c;"><code>V</code></span>, <span style="color:#e74c3c;"><code>S</code></span>, <span style="color:#e74c3c;"><code>E</code></span>로만 이루어진 문자열이 공백 없이 주어진다. 각 문자의 의미는 아래와 같다.</p>

<ul>
<li><span style="color:#e74c3c;"><code>.</code> </span>: <strong>빈 칸</strong></li>
<li><span style="color:#e74c3c;"><code>#</code> </span>: <strong>벽</strong></li>
<li><span style="color:#e74c3c;"><code>U</code></span>, <span style="color:#e74c3c;"><code>D</code></span>, <span style="color:#e74c3c;"><code>L</code></span>, <span style="color:#e74c3c;"><code>R</code> </span>: <strong>한 방향 바이러스</strong>로, 각각 <strong>활성화된 방향</strong>이 상, 하, 좌, 우다.</li>
<li><span style="color:#e74c3c;"><code>A</code> </span>: <strong>모든 방향 바이러스</strong></li>
<li><span style="color:#e74c3c;"><code>V</code> </span>: <strong>백신</strong></li>
<li><span style="color:#e74c3c;"><code>S</code> </span>: <strong>시작점</strong></li>
<li><span style="color:#e74c3c;"><code>E</code> </span>: <strong>탈출구</strong></li>
</ul>

## 출력 

 <p>첫 번째 줄에 주어진 스테이지의 <strong>난이도</strong>를 출력한다. 만약 조건을 만족하는 난이도가 없다면 대신 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>

