# [Gold V] 빌런 호석

[문제 링크](https://www.acmicpc.net/problem/22251) 

## 문제 설명

<p>치르보기 빌딩은 $1$층부터 $N$층까지 이용이 가능한 엘리베이터가 있다. 엘리베이터의 층수를 보여주는 디스플레이에는 $K$ 자리의 수가 보인다. 수는 $0$으로 시작할 수도 있다. $0$부터 $9$까지의 각 숫자가 디스플레이에 보이는 방식은 아래와 같다. 각 숫자는 7개의 표시등 중의 일부에 불이 들어오면서 표현된다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/fcb7dfaf-672b-48c4-bb25-7adf16fe106e/-/preview/" style="width: 659px; height: 100px;"></p>

<p>예를 들어 $K=4$인 경우에 $1680$층과 $501$층은 아래와 같이 보인다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7197c436-b131-43ac-b14c-3e3b5f8c27ed/-/preview/" style="width: 276px; height: 100px;">                  <img alt="" src="https://upload.acmicpc.net/ad62e659-8aef-4284-bd13-47df4a4ccbca/-/preview/" style="width: 276px; height: 100px;"></p>

<p>빌런 호석은 치르보기 빌딩의 엘리베이터 디스플레이의 LED 중에서 최소 $1$개, 최대 $P$개를 반전시킬 계획을 세우고 있다. 반전이란 켜진 부분은 끄고, 꺼진 부분은 켜는 것을 의미한다. 예를 들어 숫자 $1$을 $2$로 바꾸려면 총 5개의 LED를 반전시켜야 한다. 또한 반전 이후에 디스플레이에 올바른 수가 보여지면서 $1$ 이상 $N$ 이하가 되도록 바꿔서 사람들을 헷갈리게 할 예정이다. 치르보기를 사랑하는 모임의 회원인 당신은 호석 빌런의 행동을 미리 파악해서 혼쭐을 내주고자 한다. 현재 엘리베이터가 실제로는 $X$층에 멈춰있을 때, 호석이가 반전시킬 LED를 고를 수 있는 경우의 수를 계산해보자.</p>

## 입력 

 <p>$N, K, P, X$ 가 공백으로 구분되어 첫째 줄에 주어진다.</p>

## 출력 

 <p>호석 빌런이 엘리베이터 LED를 올바르게 반전시킬 수 있는 경우의 수를 계산해보자.</p>

