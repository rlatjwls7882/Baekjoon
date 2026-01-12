# [Platinum II] 나이트 오브 나이츠(Hard)

[문제 링크](https://www.acmicpc.net/problem/33928) 

## 문제 설명

<p>$N \times N$ 크기의 체스판이 있다. 안즈는 이 체스판 위에 나이트를 적절하게 배치하여 최대한 많은 점수를 얻으려고 한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/32f27ac8-e289-49e7-a621-e53bf579aa55/-/preview/" style="height: 389px; width: 500px;"></p>

<p>체스판의 $x$행 $y$열에 위치한 칸에 나이트를 놓는다면, $A_{x, y}$점을 얻을 수 있다. 단, 서로 공격할 수 있는 두 나이트는 동시에 배치할 수 없다.</p>

<p>체스에서 나이트는 'L'자 형태로 이동하며, 한 번에 가로로 두 칸 이동 후 세로로 한 칸, 또는 세로로 두 칸 이동 후 가로로 한 칸 이동할 수 있다. 아래는 나이트가 이동할 수 있는 위치를 나타낸 그림이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ed224d3b-ae4c-4b71-abcd-b8fcb9622de4/-/preview/" style="height: 297px; width: 300px;"></p>

<p>나이트는 이동할 수 있는 위치에 있는 말을 공격할 수 있으며, 두 나이트가 이러한 상대적 위치에 있을 경우 서로를 공격할 수 있다.</p>

<p>안즈가 얻을 수 있는 점수의 최댓값을 구하시오.</p>

## 입력 

 <p>첫 번째 줄에 체스판의 크기를 나타내는 $N$이 주어진다.</p>

<p>이어서 $N$개의 줄에 걸쳐, 정수 $N$개가 공백으로 구분되어 주어진다. $i$번째 줄의 $j$번째 수는 $A_{i,j}$를 나타낸다.</p>

## 출력 

 <p>안즈가 얻을 수 있는 점수의 최댓값을 출력한다.</p>

