# [Bronze III] 1교시: 가정

[문제 링크](https://www.acmicpc.net/problem/33631) 

## 문제 설명

<p style="text-align: center"><img alt="" src="https://upload.acmicpc.net/4e08bd23-1e66-40f4-9de3-8c5edcb10032/-/preview/" style="max-width:100%;width:450px"></p>

<p>쑤미는 가정 시간에 쿠키를 만들려고 합니다. 쑤미에게는 밀가루, 초콜릿, 달걀, 버터가 있고, 이 네 가지 재료들로 쿠키를 만들 수 있습니다. 재료들이 계속해서 추가되는 와중에도 쑤미는 쿠키를 계속 만들고 있느라 정신이 없습니다. 이러한 상황 속에서 쑤미는 재료가 얼마나 남았는지 궁금해졌습니다.</p>

<p>입력으로 처음에 쑤미가 가지고 있는 재료의 양과 쿠키를 하나 만드는 데 필요한 재료들의 양이 주어질 때, 쑤미는 아래의 다섯 가지 쿼리를 실행하는 프로그램을 작성하고 싶습니다.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>1</code></span> $\color{#e74c3c}i$: 쿠키를 $i$개 만들 수 있다면, 쿠키를 $i$개 만든 다음 현재까지 만든 쿠키의 개수를 출력합니다. 그럴 수 없다면 쿠키를 만들지 않고 <span style="color:#e74c3c;"><code>Hello, siumii</code></span>를 출력합니다. $(1 \le i \le 20)$</li>
	<li><span style="color:#e74c3c;"><code>2</code></span> $\color{#e74c3c}i$: 밀가루를 $i$ 만큼 추가하고, 현재 가지고 있는 밀가루의 양을 출력합니다. $(1 \le i \le 100)$</li>
	<li><span style="color:#e74c3c;"><code>3</code></span> $\color{#e74c3c}i$: 초콜릿을 $i$ 만큼 추가하고, 현재 가지고 있는 초콜릿의 양을 출력합니다. $(1 \le i \le 100)$</li>
	<li><span style="color:#e74c3c;"><code>4</code></span> $\color{#e74c3c}i$: 달걀을 $i$ 만큼 추가하고, 현재 가지고 있는 달걀의 양을 출력합니다. $(1 \le i \le 100)$</li>
	<li><span style="color:#e74c3c;"><code>5</code></span> $\color{#e74c3c}i$: 버터를 $i$ 만큼 추가하고, 현재 가지고 있는 버터의 양을 출력합니다. $(1 \le i \le 100)$</li>
</ul>

<p>코딩을 잘 못하는 쑤미를 위해 여러분이 대신 코드를 짜주세요!</p>

## 입력 

 <p>첫 번째 줄에 쑤미가 처음에 가지고 있는 밀가루, 초콜릿, 달걀, 버터의 양을 나타내는 네 개의 정수 $F_s,$ $C_s,$ $E_s,$ $B_s$이 공백을 간격으로 주어집니다. $(1\le F_s, C_s, E_s, B_s \le 100)$</p>

<p>두 번째 줄에 쿠키를 하나 만드는 데 필요한 밀가루, 초콜릿, 달걀, 버터의 양을 나타내는 네 개의 정수 $F_n,$ $C_n,$ $E_n,$ $B_n$이 공백을 간격으로 주어집니다. $(1\le F_n, C_n, E_n, B_n \le 10)$</p>

<p>세 번째 줄에 쿼리의 개수 $Q$가 주어집니다. $(1 \leq Q \leq 30)$</p>

<p>이하 $Q$개의 줄에 쿼리가 한 줄에 하나씩 주어집니다.</p>

## 출력 

 <p>쿼리를 수행한 결과를 한 줄에 하나씩 순서대로 출력해 주세요.</p>

