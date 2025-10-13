# [Bronze II] 궁핍한 모그

[문제 링크](https://www.acmicpc.net/problem/34563) 

## 문제 설명

<p>모그는 가로로 $N$개의 선분, 세로로 $M$개의 선분을 배치해서 $(N-1) \times (M-1)$개의 격자 칸으로 이루어진 격자를 만들려고 한다. 이렇게 하려면 가로로 $N$개의 선분, 세로로 $M$개의 선분을 각각 서로 수직이 되게 배치해야 하는데, 모그는 선분들이 정확히 수직이 되게 배치할 자신이 없다.</p>

<div style="display:flex;flex-direction:column;align-items:center;"><img alt="아무렇게나 놓인 선분들" src="https://upload.acmicpc.net/d714a4bd-fb36-40eb-90ba-17774627ce0c/-/preview/" style="max-height:300px;max-width:100%">
<p><strong>[그림 1] 모그가 아무렇게나 배치한 선분들</strong></p>
</div>

<p>옆에서 안타깝게 보고 있던 머슥은 모그에게 커넥터가 있으니 걱정하지 말라고 했다. 커넥터는 가로 선분과 세로 선분 하나를 수직으로 고정해 주는 역할을 한다. 커넥터를 이용하면 모그가 배치한 선분들을 서로 수직하게 만들 수 있다. 하지만 커넥터는 비싼 부품이라 되도록 적게 사용하려고 한다.</p>

<div style="display:flex;flex-direction:column;align-items:center;"><img alt="커넥터로 고정된 선분들" src="https://upload.acmicpc.net/06dd80f4-1532-4c31-b319-1e8af95ebf84/-/preview/" style="max-height:300px;max-width:100%">
<p><strong>[그림 2] 커넥터로 고정된 선분들</strong></p>
</div>

<p>바쁜 모그를 대신해 모든 사각형이 직사각형임을 보장하기 위해 설치해야 할 커넥터의 최소 개수를 구해주자.</p>

## 입력 

 <p>첫째 줄에 테스트 케이스의 개수 $T$가 주어진다. ($1\le T\le 10\ 000$)</p>

<p>각 테스트 케이스의 첫째 줄에 양의 정수 $N, M$이 공백으로 구분되어 주어진다. ($2\le N, M \le 500\ 000$)</p>

<p>모든 테스트 케이스에서 $N\times M$의 합은 $10^6$ 이하이다.</p>

## 출력 

 <p>각 테스트 케이스의 첫째 줄에 문제의 답을 출력한다.</p>

