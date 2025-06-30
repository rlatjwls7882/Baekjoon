# [Gold V] 레드스톤

[문제 링크](https://www.acmicpc.net/problem/28291) 

## 문제 설명

<p>마인크래프트 고수인 당신은 midori, changwook987과 함께 마인크래프트를 플레이 중이다.</p>

<p>changwook987은 레드스톤 회로 블록들을 이용해 $W×H$ 크기의 사각형 맵에 회로를 만들었다. 회로 블록에는 레드스톤 가루, 레드스톤 블록, 레드스톤 램프가 있다.</p>

<ul>
	<li><strong>레드스톤 가루(redstone_dust)</strong>는 상하좌우로 인접한 회로 블록에 매초마다 전기 신호를 전달하며, 전달할 회로 블록에 더 큰 전기 신호가 있다면 전달하지 않는다.</li>
	<li><strong>레드스톤 블록(redstone_block)</strong>은 전기 신호를 15만큼 가지고 있으며 상하좌우로 인접한 회로 블록에 15만큼의 전기 신호를 매초마다 전달한다.</li>
	<li><strong>레드스톤 램프(redstone_lamp)</strong>는 1 이상의 전기 신호를 받을 경우 불이 켜진다.</li>
</ul>

<p><strong>전기 신호</strong>는 회로 블록들이 작동하기 위해 필요한 에너지로 <strong>레드스톤 가루(redstone_dust)</strong>에서 다른 블록으로 전달될 때 1 감소하며 0 이하가 될 시 사라진다. 또한 여러 전기 신호가 한 블록에 모일 경우 그중 가장 큰 신호가 그 블록의 신호의 세기가 된다.</p>

<p>모든 회로 블록은 여러 번 행동할 수 있으며, 모두 동시에 행동한다.</p>

<p>changwook987은 midori에게 이 회로에 있는 모든 레드스톤 램프가 켜지는 순간이 있는지 알아보는 프로그램을 만들어 달라고 한다.</p>

<p>마인크래프트 초보인 midori는 당신에게 도움을 요청했다. midori를 도와 프로그램을 작성해 주자.</p>

## 입력 

 <p>첫째 줄에는 맵의 가로 길이 $W$와 세로 길이 $H$가 정수로 주어진다. $(1 \le W,H \le 50)$</p>

<p>둘째 줄에는 회로 블록의 개수 $N$이 정수로 주어진다. $(1 \le N \le W×H)$</p>

<p>셋째 줄부터 $N$개의 줄에는 회로 블록의 타입 $B$ ("<code>redstone_dust</code>", "<code>redstone_block</code>", "<code>redstone_lamp</code>" 중 하나)와 회로 블록의 가로 위치 $X$, 세로 위치 $Y$가 정수로 주어진다. $(0 \le X \le W-1; 0 \le Y \le H-1)$</p>

<p>또한 입력으로 주어지는 회로 블록에는 "<code>redstone_lamp</code>"가 하나 이상 포함되어 있다.</p>

## 출력 

 <p>모든 레드스톤 램프가 켜지는 순간이 존재하면 "<code>success</code>", 모든 레드스톤 램프가 켜지는 순간이 존재하지 않는다면 "<code>failed</code>"를 출력한다.</p>

