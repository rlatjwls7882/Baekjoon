# [Bronze II] The Weight Of Words - 24798 

[문제 링크](https://www.acmicpc.net/problem/24798) 

### 성능 요약

메모리: 14172 KB, 시간: 124 ms

### 분류

해 구성하기, 수학

### 제출 일자

2024년 2월 14일 08:18:12

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/16b54178-6c71-496a-afde-81ca24734427/-/preview/" style="width: 200px; height: 100px; float: right;">Justin likes to play a game called "Weight of Words." In this game, a player must find words of a given length and a given weight. The weight of a word is the sum of the weights of its letters. Letters are English lowercase characters from 'a' to 'z' and have weights from <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="2"><mjx-c class="mjx-c2026"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="2"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c36"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>…</mo><mn>26</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1 \ldots 26$</span></mjx-container>.</p>

<p>You are asked to write an AI that can play this game!</p>

### 입력 

 <p>The input consists of a single line with two integers <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D459 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>l</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$l$</span></mjx-container> (<mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c3C"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D459 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c34"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn><mo><</mo><mi>l</mi><mo>≤</mo><mn>40</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0 < l \le 40$</span></mjx-container>) and <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D464 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>w</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$w$</span></mjx-container> (<mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c3C"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D464 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn><mo><</mo><mi>w</mi><mo>≤</mo><mn>1000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0 < w \le 1000$</span></mjx-container>).</p>

### 출력 

 <p>Output a string of length <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D459 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>l</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$l$</span></mjx-container> with weight <mjx-container class="MathJax" jax="CHTML" style="font-size: 108.2%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D464 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>w</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$w$</span></mjx-container> consisting of lowercase English letters if it exists, otherwise output <code>impossible</code>. If more than one string exists, you may output any of them.</p>

