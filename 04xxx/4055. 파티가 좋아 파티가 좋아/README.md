# [Gold V] 파티가 좋아 파티가 좋아

[문제 링크](https://www.acmicpc.net/problem/4055) 

## 문제 설명

<p>아람이는 고등학교를 졸업하였다. 아람이네 마을에서는 학교의 모든 졸업생들이 참가할 수 있는 다양한 파티가 관습처럼 열리고 있다. 파티를 좋아하는 아람이는 최대한 많은 파티에 참가하려고 한다. </p>

<p>평일에 열리는 파티는 저녁에만 두세개가 열리지만 토요일에는 하루종일 많은 파티들이 열린다. 어떤 파티는 아침 8시에 시작하여 자정(24시)에 끝나기도 한다. 아람이는 최대한 많은 파티에 참가하고 싶다.</p>

<p>각각의 파티는 시작시간과 끝시간이 정해져있다. 파티는 정각에 시작하여 정각에 끝난다. 예를 들어 10시에 파티가 시작한 파티가 오후2시(14시)에 끝날 수도 있고 가장 일찍 시작하는 파티는 아침 8시에 시작하고 이웃들의 항의가 있을 수 있기 때문에 아무리 늦게 끝나도 24시에는 끝나게 된다. 파티에 있을 때는 최소한 30분은 있어야 예의에 어긋나지 않는다. 아람이는 예의를 지키는 사람이다. 아람이는 축지법을 쓰기 때문에 파티간 이동시간은 신경쓰지 않아도 된다. 더 이상 참가할 파티가 없으면 아람이는 집에 돌아간다.</p>

<p>아람이가 갈 수 있는 최대 파티 수는 몇 개인지 찾는 프로그램을 작성하시오.</p>

## 입력 

 <p>여러 개의 테스트케이스가 주어진다 각 테스트케이스는 첫 번째 줄에 정수 p가 주어진다. (p ≤ 100) 이 p는 파티의 그 날에 열리는 파티의 수이다. p가 0이면 입력의 끝을 의미한다. 이어지는 p개의 줄에는 s와 e가 주어진다. (8 ≤ s < e ≤ 24) s는 파티의 시작시간을 의미하고 e는 파티가 끝나는 시간을 의미한다. 시작시간과 끝시간이 같은 파티가 주어질 수도 있다.</p>

## 출력 

 <p>다음의 출력 형식에 맞추어 출력하시오.</p>

<pre>On day d Emma can attend as many as n parties.</pre>

<p>n은 최대 갈 수 있는 파티의 수이고 d는 몇 번째 테스트 케이스인지를 가리킨다. 테스트케이스는 1부터 시작한다.</p>

