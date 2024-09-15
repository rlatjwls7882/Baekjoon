# [Gold V] 팰린드롬 이름 - 29768 

[문제 링크](https://www.acmicpc.net/problem/29768) 

### 성능 요약

메모리: 2020 KB, 시간: 4 ms

### 분류

애드 혹, 해 구성하기, 문자열

### 제출 일자

2024년 8월 1일 21:57:55

### 문제 설명

<p>팰린드롬의 마법사 엣지는 오늘도 팰린드롬을 찾고 있었다. 그러던 도중 팰린드롬을 좋아하는 사람들이 모이는 축제를 만들고 싶어졌다. 축제의 이름의 길이는 <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>이고 이름은 서로 다른 영어 알파벳 소문자 <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D43E TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>K</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$K$</span></mjx-container>가지로 이루어져 있어야 한다. 마법사 엣지는 축제 이름의 조건을 만족하면서 서로 다른 부분 문자열 중 팰린드롬의 개수가 가장 많은 문자열을 축제의 이름으로 정한다. 문제에 사용된 단어의 의미는 예제 아래에 위치한 노트를 참고하자.</p>

<p>마법사 엣지를 위해 축제의 이름을 하나 만들어주자. 축제의 이름으로 정할 수 있는 이름이 여러 개라면, 사전순으로 가장 앞선 이름을 만든다.</p>

### 입력 

 <p>첫째 줄에 이름의 길이 <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$N$</span></mjx-container>과 알파벳 소문자의 개수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D43E TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>K</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$K$</span></mjx-container>가 공백으로 구분되어 입력된다. <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mstyle><mjx-mspace style="width: 0.167em;"></mjx-mspace></mjx-mstyle><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="2"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D43E TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c36"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="2"><mjx-c class="mjx-c1D43E TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mo stretchy="false">(</mo><mn>1</mn><mo>≤</mo><mi>N</mi><mo>≤</mo><mn>100</mn><mstyle scriptlevel="0"><mspace width="0.167em"></mspace></mstyle><mn>000</mn><mo>,</mo><mn>1</mn><mo>≤</mo><mi>K</mi><mo>≤</mo><mn>26</mn><mo>,</mo><mi>K</mi><mo>≤</mo><mi>N</mi><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$(1≤N≤100\,000, 1≤K≤26, K≤N)$</span> </mjx-container></p>

### 출력 

 <p>첫째 줄에 마법사 엣지가 정할 축제의 이름을 출력한다.</p>

