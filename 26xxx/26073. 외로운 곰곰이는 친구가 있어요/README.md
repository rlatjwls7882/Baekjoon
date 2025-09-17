# [Gold III] 외로운 곰곰이는 친구가 있어요

[문제 링크](https://www.acmicpc.net/problem/26073) 

## 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4f41643e-fc1b-40fc-a6f1-78ab98050b62/-/preview/" style="max-height: 360px; object-fit:contain; display:inline-block;"></p>

<p>곰곰이가 오늘 생일이래요.</p>

<p>며칠 전부터 친구들에게 파티 초대장도 보내고, 즐거운 생일파티를 기대 중이었대요.</p>

<p>그런데 왜 지금 혼자일까요...?</p>

<p>친구들이 길을 못 찾고 있는 걸까요...?</p>

<p>설마 파티장에 올 수 없는 건 아닐까요...?</p>

<p>곰곰이는 무한한 2차원 좌표공간의 원점 $(0, 0)$에 있어요.</p>

<p>친구들은 한 번 이동할 때마다, 주어진 여러 거리 중 하나를 골라 상하좌우 네 방향 중 한 방향으로 이동할 수 있어요.</p>

<p>각 친구의 처음 위치와 이동할 수 있는 거리들이 주어지면, 그 친구가 곰곰이의 생일파티에 올 수 있는지 확인해주세요!</p>

## 입력 

 <p>첫 번째 줄에 친구의 수 $N\ (1 \le N \le 10\,000)$이 주어집니다.</p>

<p>이후 $N$개의 친구 정보가 각각 두 줄에 걸쳐 주어집니다.</p>

<p>$i$번째 친구 정보의 첫 번째 줄에는 친구의 처음 위치 $X_i$, $Y_i\ (-100\,000 \le X_i, Y_i \le 100\,000)$가 공백을 사이에 두고 주어집니다.</p>

<p>$i$번째 친구 정보의 두 번째 줄에는 한 번에 이동할 수 있는 거리의 수 $K_i\ (1 \le K_i \le 32)$, 이어서 $K_i$개의 거리 $A_{ij}\ (1 \le A_{ij} \le 100\,000, 1 \le j \le K_i)$가 공백을 사이에 두고 주어집니다.</p>

<p>모든 입력은 정수로 주어집니다.</p>

## 출력 

 <p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b6e82302-f167-49ac-a2dd-ca6e8d9aebfa/-/preview/" style="max-height: 360px; object-fit:contain; display:inline-block;"></p>

<p>총 $N$개의 줄을 출력해야 합니다.</p>

<p>$i$번째 친구가 곰곰이의 생일 파티에 올 수 없으면 $i$번째 줄에 <span style="color:#e74c3c;"><code>Gave up</code></span>, 올 수 있으면 <span style="color:#e74c3c;"><code>Ta-da</code></span> 를 출력해주세요.</p>

