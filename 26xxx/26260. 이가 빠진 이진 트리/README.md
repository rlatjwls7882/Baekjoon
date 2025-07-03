# [Gold V] 이가 빠진 이진 트리

[문제 링크](https://www.acmicpc.net/problem/26260) 

## 문제 설명

<p>김소마는 최근에 포화 이진 트리에 대해 배웠다. 포화 이진 트리란, 이진 트리에서 리프 노드를 제외한 모든 노드가 두 자식 노드를 가지며, 모든 리프 노드가 채워진 것을 말한다. 아래의 그림을 통해 쉽게 이해하자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ce12902b-0148-4863-be4c-812683455221/-/preview/" style="height: 343px; width: 600px;"></p>

<p>김소마는 예쁜 포화 이진 <strong>검색</strong> 트리를 그려 만족했지만, 밥 먹다 흘린 소스가 리프 노드 한 개를 가려버렸다. 여기서 이진 검색 트리란, 모든 왼쪽 자식이 자신보다 작고, 모든 오른쪽 자식이 자신보다 큰 이진 트리를 이야기한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6038d927-7b9e-4147-95ea-99304a3c672f/-/preview/" style="height: 310px; width: 600px;"></p>

<p>그림을 버리려던 찰나, 김소마는 갑자기 포화 이진 검색 트리를 유지하며, 임의의 수를 넣을 때, 트리 구조가 어떻게 바뀔지 궁금해졌다. 멍청한 김소마를 위해 당신이 도와주자.</p>

## 입력 

 <p>첫 번째 줄에 가려진 노드를 포함한 노드의 개수 $N$이 주어진다. $(N=2^k-1;$ $2 \le k \le 17;$ $k$는 정수$)$</p>

<p>두 번째 줄에 $A_1, A_2, \cdots, A_N$이 공백으로 구분되어 주어진다. $A_i$는 $i$번 노드에 적혀있는 수이다. $(0 \le A_i \le 10^9;$ 가려진 하나의 노드에 대해서만 $A_i = -1)$ $i \neq j$이면 $A_i \neq A_j$이다. 노드 번호는 루트 노드부터 시작하여, 같은 깊이 내 왼쪽에서 오른쪽으로 갈수록 증가하는 순서로 매겨진다 (아래 그림 참조).</p>

<p>세 번째 줄에 트리에 넣을 수 $X$가 주어진다. $(0 \le X \le 10^9;$ $X \neq A_i)$</p>

<p>입력으로 주어지는 모든 수는 정수이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c4d28fc3-1469-4849-913e-6249ed50cd64/-/preview/" style="height: 346px; width: 900px;"></p>

## 출력 

 <p>첫 번째 줄에 바뀐 트리를 후위(postorder) 순회한 결과를 출력한다. (단, 왼쪽 자식 노드를 먼저 방문한다.)</p>

