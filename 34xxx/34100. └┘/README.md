# [Platinum V] └┘

[문제 링크](https://www.acmicpc.net/problem/34100) 

## 문제 설명

<p>$N \times M$ 크기의 격자가 주어진다. 처음에 격자의 각 칸은 막혀있거나 비어 있는 상태이다. 여러분은 $1 \times 1$ 크기의 조각을 세 개 이어 붙여서 만든 └ 모양 블록과 ┘모양 블록을 무한히 많이 가지고 있다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7ceac108-cc11-4356-af76-0fefa233b6d0/-/preview/"></p>

<p>여러분은 이 블록을 격자 위에 적절히 배치하여 모든 빈칸을 블록으로 덮고자 한다. 단, 격자 위에 블록을 배치할 때는 다음 조건을 모두 만족해야 한다.</p>

<ul>
	<li>각 블록의 조각이 격자에 칸에 정확히 들어맞도록 배치해야 한다.</li>
	<li>블록을 회전시키거나 뒤집는 것은 불가능하다.</li>
	<li>블록의 전체 또는 일부가 격자를 벗어나거나 막혀있는 칸을 덮으면 안 된다.</li>
	<li>격자의 빈칸은 정확히 하나의 블록에 의해서만 덮여야 한다.</li>
</ul>

<p>조건을 만족하는 블록의 배치가 있는지 판별하고, 가능하다면 격자에 블록을 배치해 보자.</p>

## 입력 

 <p>첫째 줄에 테스트 케이스의 개수를 나타내는 정수 $T$가 주어진다. $(1 \leq T \leq 300\ 000)$</p>

<p>각 테스트 케이스의 첫째 줄에 두 정수 $N$, $M$이 공백으로 구분되어 주어진다. $(2 \leq N,M \leq 3\ 000)$</p>

<p>이후 $N$개의 줄에 걸쳐 <span style="color:#e74c3c;"><code>#</code></span>과 <code><span style="color:#e74c3c;">.</span></code>으로만 구성된 길이 $M$의 문자열이 한 줄에 하나씩 주어진다. $i+1$번째 줄의 $j$번째 문자가 <span style="color:#e74c3c;"><code>#</code></span>이면 격자의 $i$행 $j$열이 막혀 있는 칸임을, <code><span style="color:#e74c3c;">.</span></code>면 빈칸임을 의미한다.</p>

<p>모든 테스트 케이스에서 $N \times M$의 합이 $3\ 000^2$을 넘지 않음이 보장된다.</p>

## 출력 

 <p>각 테스트 케이스마다 격자에 블록을 배치할 수 있다면 └ 모양 블록을 <span style="color:#e74c3c;"><code>a</code></span>, ┘모양 블록을 <span style="color:#e74c3c;"><code>b</code></span>로 하여 격자에 블록을 배치한 모습을 출력한다. 답이 여러 개라면 그중 하나를 출력한다.</p>

<p>불가능하다면 <code><span style="color:#e74c3c;">-1</span></code>을 출력한다.</p>

