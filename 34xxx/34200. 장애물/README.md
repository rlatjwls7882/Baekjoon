# [Bronze I] 장애물

[문제 링크](https://www.acmicpc.net/problem/34200) 

## 문제 설명

<p>당신은 친구들과 함께 운동장에서 장애물 뛰기 놀이를 하고 있다. 놀이는 수직선 위의 위치 $0$에서 시작하며, 각 장애물은 왼쪽부터 차례로 $X_1 < X_2 < \dots < X_N$ 에 놓여 있다. $X_1 ≥ 1$이다.</p>

<p>당신의 목표는 수직선 위에 놓인 $N$개의 장애물을 모두 뛰어넘는 것이다. 이를 위해 당신은 다음과 같은 두 가지 행동을 할 수 있다:</p>

<ul>
	<li>오른쪽으로 $1$만큼 걸어간다. 즉, 위치 $x$에서 시작했다면 $x + 1$에 도착한다.</li>
	<li>오른쪽으로 $2$만큼 점프한다. 즉, 위치 $x$에서 시작했다면 $x + 2$에 도착한다.</li>
</ul>

<p>장애물을 뛰어넘었다는 것은, 장애물을 점프로 넘어갔다는 것을 뜻한다. 다시 말해, 위치 $X_i$ 에 있는 장애물을 뛰어넘으려면 반드시 위치 $X_i − 1$에서 오른쪽으로 $2$만큼 점프해서 위치 $X_i + 1$에 도착해야 한다.</p>

<p>예를 들어, 아래 그림과 같이 수직선 위의 위치 $2$, $5$, $11$에 장애물이 놓여 있다고 가정하자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/40bf1a86-5483-4606-80b5-802d0da6b38b/-/preview/" style="width: 653px; height: 46px;"></p>

<p>다음과 같은 방법들로 장애물을 모두 넘어갈 수 있다. 아래에서 $→$는 걷기, $⟹$는 점프를 의미한다.</p>

<ul>
	<li>방법 $1$: $0 → 1 ⟹ 3 → 4 ⟹ 6 → 7 ⟹ 9 → 10 ⟹ 12$ ($8$회 이동, 장애물 $3$개 넘음)</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/fc553c24-d7e2-48d0-9893-2207aa634938/-/preview/" style="width: 615px; height: 73px;"></p>

<ul>
	<li>방법 $2$: $0 → 1 ⟹ 3 → 4 ⟹ 6 ⟹ 8 ⟹ 10 ⟹ 12$ ($7$회 이동, 장애물 $3$개 넘음)</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0ca1be51-1db0-496b-8cc2-894287590bbf/-/preview/" style="width: 615px; height: 71px;"></p>

<p>하지만, 다음과 같은 방법들은 장애물을 모두 넘어갈 수 없다.</p>

<ul>
	<li>방법 $3$: $0 ⟹ 2 ⟹ 4 ⟹ 6 ⟹ 8 ⟹ 10 ⟹ 12$ ($6$회 이동, 장애물 $2$개 넘음)</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/48d59a78-62ba-46a3-b873-7d4e46a004bb/-/preview/" style="width: 615px; height: 71px;"></p>

<ul>
	<li>방법 $4$: $0 → 1 ⟹ 3 ⟹ 5 ⟹ 7 ⟹ 9 → 10 ⟹ 12$ ($7$회 이동, 장애물 $2$개 넘음)</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ffe05e94-b7ff-41dc-b291-f693acc6ae48/-/preview/" style="width: 615px; height: 72px;"></p>

<ul>
	<li>방법 $5$: $0 → 1 ⟹ 3 → 4 → 5 ⟹ 7$ ($5$회 이동, 장애물 $1$개 넘음)</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a1a6fa5b-6038-4ba4-bc34-782638f144da/-/preview/" style="width: 615px; height: 72px;"></p>

<p>각 예시에서, <strong>이동 횟수</strong>는 걸어간 횟수와 점프한 횟수의 합이다. 이 예시에서, 방법 $2$가 최소 이동 횟수로 장애물을 모두 넘어갈 수 있는 최적의 방법이다.</p>

<p>당신은 <strong>이동 횟수</strong>를 최소화하여 모든 장애물을 넘어가는 최적의 방법을 찾고자 한다. 단, 주어진 두 행동만으로 모든 장애물을 넘어가는 것이 불가능한 경우도 있다.</p>

## 입력 

 <p>첫 번째 줄에는 $N$이 주어진다.</p>

<p>두 번째 줄에는 $N$개의 정수 $X_1 , X_2 , \cdots , X_N$이 공백을 사이에 두고 차례대로 주어진다.</p>

## 출력 

 <p>모든 장애물을 넘어갈 수 없다면, <code>-1</code>을 출력한다.</p>

<p>모든 장애물을 넘어갈 수 있다면, 모든 장애물을 넘기 위해 필요한 최소 이동 횟수를 출력한다.</p>

