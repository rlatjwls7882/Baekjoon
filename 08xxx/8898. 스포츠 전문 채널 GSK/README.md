# [Diamond III] 스포츠 전문 채널 GSK

[문제 링크](https://www.acmicpc.net/problem/8898) 

## 문제 설명

<p>상근이는 자신의 이름을 딴 방송국 GSK를 만들었다. GSK는 스포츠 전문 방송국으로 곧 열리는 경기 N개를 모두 취재하려고 한다.</p>

<p>각각의 스포츠 경기 E<sub>i</sub>(1 ≤ i ≤ n)의 시작 시간은 s<sub>i</sub>, 경기 시간은 d<sub>i</sub>, 경기장은 g<sub>i</sub>이다. g<sub>i</sub>에서 g<sub>j</sub>로 가는 이동 시간은 t<sub>i,j</sub>(1 ≤ i,j ≤ n)이며, t<sub>i,j</sub> = t<sub>j,i</sub>와 t<sub>i,j</sub> ≤ t<sub>i,k</sub> + t<sub>k,j</sub> (1 ≤ i,j,k ≤ n)을 만족한다.</p>

<p>리포터는 경기가 열리는 동안 그 경기장에서 계속 취재를 해야 한다. 즉, 한 리포터가 두 경기 E<sub>i</sub>와 E<sub>j</sub>를 취재하려면, s<sub>i</sub> + d<sub>i</sub> + t<sub>i,j</sub> ≤ s<sub>j</sub> 나 s<sub>j</sub> + d<sub>j</sub> + t<sub>j,i</sub> ≤ s<sub>i</sub>를 만족해야 한다.</p>

<p>경기 정보가 모두 주어졌을 때, 한 리포터가 동시에 취재할 수 없는 가장 큰 경기의 부분집합을 구하는 프로그램을 작성하시오.</p>

## 입력 

 <p>첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 경기의 수 n (1 ≤ n ≤ 1,000)이 주어진다. 둘째 줄에는 각 경기의 시작 시간 s<sub>i</sub>, 셋째 줄에는 경기 시간 d<sub>i</sub>가 주어진다. (1 ≤ s<sub>i</sub>, d<sub>i</sub> ≤ 1,000,000) 넷째 줄부터 총 n개 줄 중 i번째 줄에는 n-i+1개의 정수가 주어지며, t<sub>i,i</sub>, t<sub>i,i+1</sub>, ..., t<sub>i,n</sub>을 나타낸다. (0 ≤ t<sub>i,j</sub> ≤ 1,000,000) t<sub>i,i</sub>는 항상 0이다.</p>

## 출력 

 <p>각 테스트 케이스마다 두 줄을 출력한다. 첫째 줄은 한 리포터가 동시에 취재할 수 없는 가장 큰 경기의 부분집합의 크기 k이고, 둘째 줄에는 집합에 포함된 경기의 번호를 출력한다. (E<sub>i</sub>에서 i) 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.</p>

