# [Bronze III] 루미의 진정한™ 보라색 찾기

[문제 링크](https://www.acmicpc.net/problem/33663) 

## 문제 설명

<blockquote>이게 대체 왜 보라색인데?!!</blockquote>

<p>루미는 보라색을 미친 듯이 좋아하지만 <strong><span style="background: linear-gradient(to left top, #3d0857, #e576ff);color: transparent;-webkit-background-clip: text">진정한™ 보라색</span></strong>이 아니면 인정하지 않는다. 루미는 <strong><span style="background: linear-gradient(to left top, #3d0857, #e576ff);color: transparent;-webkit-background-clip: text">진정한™ 보라색</span></strong>을 HSV 색상 공간을 사용해 판별한다. 판정할 색상의 $H$ 값이 $h_{lo}$ 이상 $h_{hi}$ 이하, $S$ 값이 $s_{lo}$ 이상 $s_{hi}$ 이하, $V$ 값이 $v_{lo}$ 이상 $v_{hi}$ 이하일 때 <strong><span style="background: linear-gradient(to left top, #3d0857, #e576ff);color: transparent;-webkit-background-clip: text">진정한™ 보라색</span></strong>이라고 한다.</p>

<p>HSV는 Hue(색조), Saturation(채도), Value(명도)로 이루어진 색상 공간이다. HSV 색상 공간은 RGB 색상 공간을 원통 모양으로 변환한 것으로 생각할 수 있다. $R,G,B$ 값이 모두 다른 경우에는 RGB 색상 공간에서 HSV 색상 공간으로 아래의 식을 이용해서 변환할 수 있다.</p>

<p>\[V=M\] \[S={255\times\frac{V-m}{V}}\] \[H=\begin{cases}{\frac{60\times(G-B)}{V-m}}&{(V=R)}\\{120+\frac{60\times(B-R)}{V-m}}&{(V=G)}\\{240+\frac{60\times(R-G)}{V-m}}&{(V=B)}\\\end{cases}\] 이때, $M$은 $R,G,B$ 중 최댓값, $m$은 최솟값이다.</p>

<p>만약 $H$가 $0$ 미만일 경우 $360$을 더해서 $0$ 이상 $360$ 미만이 되도록 한다. 위 식으로 구한 $H$의 값은 항상 $-360$ 초과 $360$ 미만이다.</p>

<p>루미를 잘 아는 엘리는 생일 케이크의 시트 색상을 <strong><span style="background: linear-gradient(to left top, #3d0857, #e576ff);color: transparent;-webkit-background-clip: text">진정한™ 보라색</span></strong>으로 만들려 한다. 하지만 엘리의 휴대폰으로는 케이크의 색을 RGB 색상 공간의 색으로만 확인할 수 있어 케이크가 <strong><span style="background: linear-gradient(to left top, #3d0857, #e576ff);color: transparent;-webkit-background-clip: text">진정한™ 보라색</span></strong>인지 확인할 수 없었다. 엘리는 RGB 색상 공간에서 HSV 색상 공간으로 변환하는 계산을 잘 못해 코딩을 잘하는 당신에게 도움을 요청하고자 한다.</p>

## 입력 

 <p>첫 번째 줄에 $h_{lo}, h_{hi}$가 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄에 $s_{lo}, s_{hi}$가 공백으로 구분되어 주어진다.</p>

<p>세 번째 줄에 $v_{lo}, v_{hi}$가 공백으로 구분되어 주어진다.</p>

<p>네 번째 줄에 엘리가 만든 케이크의 색상의 RGB 값 $R, G, B$ 가 공백으로 구분되어 주어진다.</p>

## 출력 

 <p>엘리가 만든 케이크의 색상이 루미가 생각하는 <strong><span style="background: linear-gradient(to left top, #3d0857, #e576ff);color: transparent;-webkit-background-clip: text">진정한™ 보라색</span></strong>이 맞으면 <span style="color:#e74c3c;"><code>Lumi will like it.</code></span>, 아니면 <span style="color:#e74c3c;"><code>Lumi will not like it.</code></span>을 출력하라.</p>

