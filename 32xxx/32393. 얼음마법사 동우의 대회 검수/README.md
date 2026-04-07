# [Diamond V] 얼음마법사 동우의 대회 검수

[문제 링크](https://www.acmicpc.net/problem/32393) 

## 문제 설명

<p>고려대학교 최강의 얼음마법사로 유명한 동우는 $N$명의 검수자와 함께 $M$개의 대회를 개최하고자 한다. 동우가 할 수 있는 행동은 총 세 가지로, 아래와 같다.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>1</code> $j$ $i$</span>: $i$번째 검수자가 $j$번째 대회의 검수자가 아니라면 검수자로 임명하고, 이미 $j$번째 대회의 검수자였다면 더 이상 해당 대회의 검수자가 아니게 된다. 한 검수자가 여러 대회의 검수자일 수 있다.</li>
	<li><span style="color:#e74c3c;"><code>2</code> $j$ $x$</span>: $j$번째 대회의 검수자들을 전부 불러 $x$시간 동안 검수를 진행한다. 검수 동안 검수자들은 시간당 $1$의 고통을 받는다.</li>
	<li><span style="color:#e74c3c;"><code>3</code> $i$</span>: $i$번째 검수자가 지금까지 받은 총 고통을 물어본다.</li>
</ul>

<p>동우의 질문에 너무 늦게 답하거나 실수로 잘못 대답한다면 당신은 모든 대회의 검수자가 되어버릴 것이다. 빠르게 계산하여 검수의 늪에서 탈출하자!</p>

## 입력 

 <p>첫 번째 줄에 $N,M,Q(1\leq N,M,Q\leq 10^5)$가 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄부터 $Q$줄에 걸쳐 아래 세 가지 중 하나의 형식으로 동우의 행동이 주어진다.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>1</code> $j$ $i$</span></li>
	<li><span style="color:#e74c3c;"><code>2</code> $j$ $x$</span></li>
	<li><span style="color:#e74c3c;"><code>3</code> $i$</span></li>
</ul>

<p>여기서 각 변수는 $1\leq i\leq N;$ $1\leq j\leq M;$ $1\leq x\leq 10^9$를 만족한다. 각 행동별 $i$와 $j$의 순서에 유의하자.</p>

<p><span style="color:#e74c3c;"><code>3</code></span>번 행동은 적어도 한 번 주어진다.</p>

## 출력 

 <p><span style="color:#e74c3c;"><code>3</code></span>번 행동이 주어질 때마다 $i$번째 검수자가 지금까지 받은 총 고통을 한 줄에 하나씩 출력한다.</p>

