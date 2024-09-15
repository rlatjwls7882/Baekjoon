# [Gold II] 실 전화기 - 23039 

[문제 링크](https://www.acmicpc.net/problem/23039) 

### 성능 요약

메모리: 2020 KB, 시간: 0 ms

### 분류

많은 조건 분기, 그래프 이론, 평면 그래프

### 제출 일자

2024년 8월 8일 10:40:52

### 문제 설명

<p>서울대학교 신공학관 옥상에는 커다란 정원이 있다. 이 정원에는 다섯 마리의 토끼가 각자 굴을 하나씩 파서 살고 있다. 이 다섯 개의 굴은 정오각형을 이루고 있으며, 시계 방향을 따라 순서대로 <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1$</span></mjx-container>번부터 <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c35"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>5</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$5$</span></mjx-container>번까지의 번호가 붙어 있다.</p>

<p>이 토끼들은 소리로 소통을 하는데, 다른 굴까지 전해질 정도로 큰 소리를 내지는 못한다. 토끼들은 넘치는 공대 감성과 문제 해결 의식으로 새로운 통신 수단을 만들기로 했고, 마침내 주변의 잡동사니를 모아서 <strong>실 전화기</strong>를 만들어 냈다. 실 전화기는 실이 팽팽해야 진동을 온전히 전달할 수 있기 때문에, 하나의 실 전화기는 두 개의 굴 사이를 일직선으로 연결한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/cd3e2830-ed23-4e0b-b257-e71388b0fc25/-/preview/" style="width: 351px; height: 340px;"></p>

<p style="text-align: center;">토끼굴들 사이에 5개의 실 전화기가 설치되어 있는 모습</p>

<p>실 전화기의 문제는 두 전화기의 실이 겹치면 진동이 제대로 전달되지 않아 통신이 이뤄지지 않는다는 것이다. 전화기들의 높이가 서로 다르면 문제가 없겠지만, 토끼들은 키가 작아서 전화기의 높이를 자유롭게 조절할 수 없다. 따라서 이를 해결하려면 몇몇 토끼가 다른 적절한 위치로 굴을 옮겨야만 한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d40ecd53-51fb-4b71-853d-2da6328b6646/-/preview/" style="width: 420px; height: 340px;"></p>

<p style="text-align: center;">2번 토끼굴이 왼쪽 아래로 옮겨가서 문제가 해결된 모습</p>

<p>정원은 토끼들에게는 끝없는 평원처럼 느껴질 정도로 커다랗다. 따라서 각 토끼굴은 하나의 아주 작은 점으로 여길 수 있으며, 토끼굴을 옮길 때 새로운 굴의 위치에는 아무런 제약도 없다. 단, 굴을 다른 토끼굴과 완전히 같은 위치로 옮기거나, 굴을 옮긴 뒤에 전화기의 실이 다른 토끼굴 위를 지나가게 되어서는 안 된다.</p>

<p>현재 실 전화기의 배치가 주어질 때, 최소 몇 마리의 토끼가 굴을 옮겨야 실 전화기들이 서로 겹치지 않게 되는지 알아보자.</p>

### 입력 

 <p>첫째 줄에 토끼굴들 사이에 설치되어 있는 실 전화기의 개수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>(<mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>10</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \leq N \leq 10$</span></mjx-container>)이 주어진다. 이후 <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>개의 줄에 걸쳐 각 전화기가 잇는 두 토끼굴의 번호가 공백으로 구분되어 주어진다.</p>

<p>각 전화기는 반드시 서로 다른 두 토끼굴을 연결하며, 어떤 두 토끼굴 사이에 여러 개의 실 전화기가 설치되어 있는 경우는 없다.</p>

### 출력 

 <p>첫째 줄에 모든 전화기의 실이 서로 겹치지 않도록 하기 위해 최소 몇 마리의 토끼가 굴을 옮겨야 하는지 출력한다. 만약 토끼들이 굴을 어떻게 옮기더라도 실이 겹치는 지점이 생긴다면 <code>-1</code>을 출력한다.</p>

