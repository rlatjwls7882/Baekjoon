# [Gold II] 덱 조작과 쿼리

[문제 링크](https://www.acmicpc.net/problem/32354) 

## 문제 설명

<p>하넬은 카드게임의 덱(deck)을 조작하는 방법을 연구하고 있다. 덱은 위와 아래가 있는 카드의 리스트고, 각 카드에는 $0$ 이상 $10^9$ 이하의 정수가 하나씩 적혀있다. 덱은 처음에 카드가 없는 비어있는 상태고, 하넬은 현재 덱에 4가지 중 하나의 <strong>행동</strong>을 해서 덱의 상태를 바꾸고자 한다:</p>

<ul>
	<li><span style="color:#e74c3c;"><code>push</code>$x$</span>: $x$가 적혀있는 카드를 덱의 가장 위에 둔다. $(0 \le x\le 10^9)$</li>
	<li><span style="color:#e74c3c;"><code>pop</code></span>: 덱 가장 위에서 카드를 제거한다. 현재 덱에 카드가 없는 경우에는 <span style="color:#e74c3c;"><code>pop</code></span>이 주어지지 않는다.</li>
	<li><span style="color:#e74c3c;"><code>restore</code>$i$</span>: 현재 덱의 상태를 $i$번째 <strong>행동</strong> 이후의 덱의 상태와 동일하게 만든다. $i$가 $0$인 경우는 덱을 카드가 없는 초기 상태로 되돌린다. $i$번째 <strong>행동</strong>이 아직 이뤄지지 않은 경우는 주어지지 않는다.</li>
	<li><span style="color:#e74c3c;"><code>print</code></span>: 현재 덱에 있는 카드에 적힌 모든 수의 합을 출력한다. 덱에 카드가 $1$장도 없을 경우에는 $0$을 출력한다.</li>
</ul>

<p>하넬은 아쉽게도 덱 조작 방법을 연구하느라 바쁘다. 하넬을 대신해서 각 <span style="color:#e74c3c;"><code>print</code></span><strong>행동</strong>이 주어질 때 덱에 있는 카드의 수를 계산해주자.</p>

## 입력 

 <p>첫 번째 줄에 행동의 수 $N$가 주어진다. $(1\le N\le 500\,000)$</p>

<p>두 번째 줄 부터 $N$개의 줄에 걸쳐 행동이 문제에 적힌 형식대로 한 줄에 하나씩 주어진다. <span style="color:#e74c3c;"><code>push</code></span>와 <span style="color:#e74c3c;">$x$</span>, <span style="color:#e74c3c;"><code>restore</code></span>와 <span style="color:#e74c3c;">$i$</span>사이에는 공백이 하나씩 주어지며, <span style="color:#e74c3c;"><code>print</code></span> 명령은 반드시 $1$개 이상 주어진다.</p>

## 출력 

 <p><span style="color:#e74c3c;"><code>print</code></span> 행동이 주어질 때마다 덱에 있는 카드의 수의 합을 한 줄에 하나씩 출력한다.</p>

