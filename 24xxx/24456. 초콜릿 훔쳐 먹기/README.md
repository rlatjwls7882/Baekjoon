# [Gold III] 초콜릿 훔쳐 먹기

[문제 링크](https://www.acmicpc.net/problem/24456) 

## 문제 설명

<p>초콜릿을 좋아하는 인규는 연진이의 초콜릿을 하나씩 훔쳐먹으려고 한다. 연진이는 $N \times M$ 크기의 초콜릿을 가지고 있다. 인규는 여기서 하나를 훔쳐먹고 $M \times N - 1$개의 초콜릿을 만들 것이다. 그런데 인규가 초콜릿을 하나를 훔쳐먹으면 모양이 바뀌게 되므로 초콜릿을 훔쳐먹었다는 사실이 들통나게 될 것이다! 따라서 인규는 남은 초콜릿을 재배열해 직사각형 형태로 만들 것이다.</p>

<p>이때 주의해야 할 점은, 새로 만든 초콜릿의 가로와 세로 길이의 차이 $\texttt{D}_\texttt{new}$가 처음 초콜릿의 가로와 세로의 차이 $\texttt{D}_\texttt{old}$와 크게 변함이 없어야 훔쳐 먹었다는 티가 나지 않는다. 따라서 인규는 $|\texttt{D}_\texttt{new} - \texttt{D}_\texttt{old}|$를 $K$ 이하로 유지하며 최대한 많은 초콜릿을 먹을 것이다.</p>

<p>아래 그림을 예로 들어 보자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b7e0126e-c900-41f3-a5e8-e5822efd18f1/-/preview/" style="width: 650px; height: 366px;"></p>

<p>$K=5$일 때 $4 \times 4=16$개의 초콜릿이 있다. 처음 초콜릿의 가로와 세로 길이가 동일하므로 $\texttt{D}_\texttt{old}$를 계산하면 $0$이 된다.</p>

<p>만약 인규가 초콜릿을 하나 먹고 $3 \times 5$ 모양으로 재배열한다면, $\texttt{D}_\texttt{new} = |3 - 5| = 2 \le \texttt{D}_\texttt{old} + K = 5$이 되므로 초콜릿을 하나 먹을 수 있다.</p>

<p>여기서 초콜릿을 하나 더 먹게 된다면 $2 \times 7$ 모양으로 재배열이 가능하다. 이때 $\texttt{D}_\texttt{new} = |2-7| = 5 \le \texttt{D}_\texttt{old} + K = 5$이므로 초콜릿을 하나 더 먹을 수 있다.</p>

<p>여기서 초콜릿을 하나 더 먹게 된다면 $1 \times 13$ 모양으로만 재배열이 가능하다. 이때 $\texttt{D}_\texttt{new} = |1-13| = 12 > \texttt{D}_\texttt{old} + K = 5$으로 규칙을 만족하지 못하므로 세 번째 초콜릿은 먹을 수 없다.</p>

<p>한 가지 예를 더 보자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4d39f259-c17a-43e3-953c-e34d625b2ef4/-/preview/" style="width: 650px; height: 366px;"></p>

<p>$K=4$일 때 $4 \times 5 = 20$개의 초콜릿이 있다. 처음 초콜릿에서 $\texttt{D}_\texttt{old}$를 계산하면 $1$이 된다.</p>

<p>만약 인규가 초콜릿을 하나 먹게 된다면 $19$개의 초콜릿을 직사각형 모양으로 만들어야 하는데 가장 작은 $|\texttt{D}_\texttt{new} - \texttt{D}_\texttt{old}|$는 $18$이며, $K$보다 크므로 인규는 초콜릿을 하나도 먹을 수 없다. 인규가 초콜릿을 $2$개 먹은 후에 $3 \times 6$ 모양으로 배열하면 $|\texttt{D}_\texttt{new} - \texttt{D}_\texttt{old}|$는 $K$보다 작은 $2$가 되지만, 한 번에 하나의 초콜릿만 먹을 수 있으므로 이 상태에 도달하지 못한다.</p>

<p>$N,\ M,\ K$가 주어질 때, 인규가 몰래 먹을 수 있는 연진이의 초콜릿의 개수를 구하시오.</p>

<p><strong>단, 인규가 모든 초콜릿을 먹게 되면 연진이가 눈치챌 수 있으므로, 최소 $1$개의 초콜릿은 남겨놓아야 한다.</strong></p>

## 입력 

 <p>첫 번째 줄에는 세 정수 $N,\ M,\ K$가 공백으로 구분되어 입력된다. ($1 \le N,\ M \le 10\,000$, $0 \le K \le N \times M$)</p>

## 출력 

 <p>인규가 몰래 먹을 수 있는 초콜릿의 수를 출력한다.</p>

