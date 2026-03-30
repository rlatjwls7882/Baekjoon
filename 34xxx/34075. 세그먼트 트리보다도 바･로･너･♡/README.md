# [Silver III] 세그먼트 트리보다도 바･로･너･♡

[문제 링크](https://www.acmicpc.net/problem/34075) 

## 문제 설명

<blockquote>
<p><strong><em>초코민트보다도 바･로･너･♡</em></strong></p>

<p>    — 쿠로사와 루비, <a href="https://namu.wiki/w/%E6%84%9B%E2%99%A1%E3%82%B9%E3%82%AF%E3%83%AA%EF%BD%9E%E3%83%A0%EF%BC%81"><em>AiScReam</em></a></p>
</blockquote>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/73509dd4-087c-461a-af36-571088a821b0/-/preview/" style="width:500px;max-width:100%"></p>

<p>채강은 솔브드 학교의 스쿨 아이돌 그룹 <strong>PRODUCE</strong> $\mathbf{{10}^1}$의 열렬한 팬이다. 채강은 여기에 너무 과몰입한 나머지, 멤버들이 선호하는 모든 취향을 따르기로 결심했다. 가장 먼저 할 것은 좋아하는 알고리즘을 따라하는 것이다.</p>

<p>솔브드 학교에서 배울 수 있는 알고리즘의 종류는 총 $N$가지로, $i$번째 알고리즘의 <strong>난이도</strong>는 정수 $D_i$로 나타낼 수 있다. 모든 알고리즘의 이름은 서로 다르다.</p>

<p><strong>PRODUCE</strong> $\mathbf{{10}^1}$에는 총 $M$명의 멤버들이 있다. $i$번째 멤버의 <strong>티어</strong> $T_i$는 그 멤버의 알고리즘 실력을 나타내는 정수이다. 모든 멤버들의 이름은 서로 다르다.</p>

<p>각 멤버는 알고리즘의 난이도가 자신의 티어에 가까울수록 더 좋아한다. 즉, 어떤 알고리즘의 난이도가 $d$라면, $i$번째 멤버는 $\left| d - T_i \right|$가 작은 알고리즘일수록 더 좋아한다. 만약 $\left| d - T_i \right|$의 값이 같다면, 이름이 사전 순으로 먼저 오는 알고리즘을 더 좋아한다. 사전 순의 정의는 노트를 참고하라.</p>

<p>채강은 각 멤버에게 좋아하는 알고리즘을 다음과 같은 쿼리의 형태로 물어보려고 한다.</p>

<ol>
	<li>$\color{#e74c3c}{\text{name}\,}$<code style="color:#e74c3c;">- chan!</code>: <strong>PRODUCE</strong> $\mathbf{{10}^1}$ 소속 멤버의 이름인 $\color{#e74c3c}{\text{name}}$을 불러 이번에 대답할 멤버를 $\color{#e74c3c}{\text{name}}$으로 설정한다. 그 멤버는 <code style="color:#e74c3c;">hai!</code>를 대답한다.</li>
	<li><code style="color:#e74c3c;">nani ga suki?</code>: 가장 최근에 대답한 멤버가 가장 좋아하는 알고리즘의 이름을 $\color{#e74c3c}{\text{algo}_1}$, 두 번째로 좋아하는 알고리즘의 이름을 $\color{#e74c3c}{\text{algo}_2}$라고 하자. 그 멤버는 $\color{#e74c3c}{\text{algo}_2\,}$<code style="color:#e74c3c;">yori mo</code>$\color{#e74c3c}{\,\text{algo}_1}$을 대답한다.</li>
</ol>

<p>위 쿼리를 수행하는 프로그램을 작성해 보자.</p>

## 입력 

 <p>첫 번째 줄에 알고리즘의 개수 $N$이 주어진다. ($2\leq N\leq 229$)</p>

<p>다음 $N$개의 줄에 걸쳐, 각 알고리즘의 이름과 난이도가 공백으로 구분되어 주어진다. 알고리즘의 이름은 알파벳 소문자와 언더스코어(<code style="color:#e74c3c;">_</code>)로만 이루어져 있다. 알고리즘의 이름의 길이는 $1$ 이상 $50$ 이하이며, 난이도는 $1$ 이상 $30$ 이하의 정수이다.</p>

<p>그 다음 줄에 멤버의 수 $M$이 주어진다. ($1\leq M\leq 10$)</p>

<p>다음 $M$개의 줄에 걸쳐, 각 멤버의 이름과 티어가 공백으로 구분되어 주어진다. 멤버의 이름은 알파벳 소문자로만 이루어져 있다. 멤버 이름의 길이는 $1$ 이상 $20$ 이하이며, 티어는 $0$ 이상 $31$ 이하의 정수이다.</p>

<p>그 다음 줄에 쿼리의 수 $Q$가 주어진다. ($1\leq Q\leq 101$)</p>

<p>다음 $Q$개의 줄에 걸쳐, 쿼리가 한 줄에 하나씩 주어진다. 첫 번째 쿼리는 항상 $1$번 쿼리이다.</p>

## 출력 

 <p>각 쿼리에 대해 멤버가 대답한 내용을 한 줄에 하나씩 출력한다.</p>

