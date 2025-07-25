# [Gold II] 인덕이와 산책

[문제 링크](https://www.acmicpc.net/problem/33933) 

## 문제 설명

<p>인하는 $N$개의 지점과 $M$개의 양방향 길로 이루어져 있는 인하대의 산책로에서 산책하려고 한다. 이때, $1$번 지점에서 시작해 $N$번 지점에서 끝내려고 한다. 인하는 길을 따라 두 지점 사이를 이동하거나, 어떤 지점에서 이동하지 않고 $1$분 동안 쉴 수 있다. 두 지점 사이를 이동하는 데 걸리는 시간은 항상 $1$분이며, 서로 다른 두 지점 사이에는 최대 $1$개의 길만 존재한다. 또한, 출발지와 도착지가 같은 길은 존재하지 않는다.</p>

<p>한편, 인하대 내부에는 엄청 귀여운 오리인 인덕이가 살고 있다. 인덕이는 길과 무관하게 모든 임의의 두 지점 사이를 $1$분마다 순간 이동할 수 있다.</p>

<p>인덕이는 $T$분 주기의 사이클을 나타내는 $T$개의 번호로 이루어진 수열 $c$를 따라 $1$분마다 산책로의 특정한 지점들 사이를 순간 이동한다. 즉, 인하가 산책을 시작한 시점으로부터 $k \left(k \ge 0\right)$분이 지난 시점에 인덕이는 $c_{k \bmod T}$번 지점에 존재한다. 이 사이클은 <strong>항상 $N$번 지점을 포함</strong>한다. 인하가 산책을 시작하는 순간, 인덕이도 이 사이클을 따라 순간 이동을 시작한다.</p>

<p>만약 인하가 산책 도중에 인덕이와 마주치면 인덕이의 엄청난 귀여움에 빠져버려서 인덕이가 $N$번 지점에 도착할 때까지 인덕이의 뒤에 붙어 <strong>인덕이와 같이 순간 이동</strong>하게 된다. 인하와 인덕이가 둘 다 $1$번 지점에서 시작한다면, 인하는 바로 인덕이의 뒤에 붙어버리게 된다. 인하가 $N$번 정점에 도착하면 무조건 산책이 끝난다.</p>

<p>인하가 $N$번 지점에 도착하는 데 걸리는 최소 이동 시간을 구해보자.</p>

## 입력 

 <p>첫 번째 줄에 지점의 수 $N$, 길의 수 $M$, 그리고 사이클의 주기 $T$가 주어진다.</p>

<p>이어서 $M$개의 줄에 걸쳐 산책로의 $i$번째 길이 연결하는 두 지점의 번호 $a_i, b_i$가 공백으로 구분되어 주어진다.</p>

<p>$M+2$ 번째 줄에, 사이클에 포함된 지점의 번호 $c_0, c_1, \cdots, c_{T-1}$가 공백으로 구분되어 주어진다.</p>

## 출력 

 <p>인하가 $N$번 지점에 도착하는 데에 걸리는 최단 시간을 분 단위로 출력한다. 만약 도착할 수 없다면, <code><span style="color:#e74c3c;">-1</span></code>을 대신 출력한다.</p>

