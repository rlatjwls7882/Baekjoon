# [Bronze I] 신묘마루의 요술망치

[문제 링크](https://www.acmicpc.net/problem/33924) 

## 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5a19a2ff-5854-4639-8227-3a533990eaa0/-/preview/" style="height: 354px; width: 500px;"></p>

<p style="text-align: center;"><em><strong>”IUPC 2025에 참가하신 여러분, 환영합니다! 대회 시작 전에 저희가 준비한 맛있는 햄버거를⋯ 어라?”</strong></em></p>

<p>마음씨 좋은 IUPC 운영진들은 참가자들을 위해 <strong>맛있는 햄버거</strong>를 잔뜩 준비했다.</p>

<p>하지만 신묘마루는 참가자들이 <strong>맛있는 햄버거</strong>를 그냥 가져가는 것이 마음에 들지 않았던 모양이다. 극악무도한 신묘마루는 <strong>맛있는 햄버거</strong>를 $8$개의 밥그릇 중 하나에 숨겨버렸다. 심지어 요술망치를 사용해서 밥그릇을 뒤죽박죽 섞어버렸다!</p>

<p>⋯이렇게 운영진들이 준비한 <strong>맛있는 햄버거</strong>는 사악한 신묘마루의 손에 들어가고 말았다. 게다가 운영진들이 밥그릇에 손도 대지 못하게 지키고 있기 때문에, 참가자들이 직접 숨겨져 있는 <strong>맛있는 햄버거</strong>를 찾아갈 수밖에 없게 되었다. 다행인 점은 신묘마루가 <strong>맛있는 햄버거</strong>를 처음에 어느 밥그릇에 넣었는지부터 시작해서 요술망치로 밥그릇을 섞는 과정까지 운영진들이 모두 찍어두었다는 것이다!</p>

<p>이 영상을 받아서 분석해 본 당신은 $8$개의 밥그릇은 처음에 $4$행 $2$열 형태로 배치되어 있으며, 신묘마루가 요술망치로 밥그릇을 섞는 기술이 아래의 $4$가지로 정해져 있음을 알게 되었다. 신묘마루가 사용하는 기술의 이름은 죄다 길고 복잡해서 쓰기 어려우므로, 편의상 이 기술들을 기술 <span style="color:#e74c3c;"><code>A</code></span> ∼ 기술 <span style="color:#e74c3c;"><code>D</code></span>라고 부르자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5a15dc3d-84c1-45c6-802e-b8d506a3e31c/-/preview/" style="height: 328px; width: 500px;"></p>

<p style="text-align: center;"><strong>기술 <span style="color:#e74c3c;"><code>A</code></span></strong>: $1$행과 $2$행에 있는 밥그릇 $4$개, $3$행과 $4$행에 있는 밥그릇 $4$개의 위치를 그림과 같이 바꾼다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/33b6dccd-d6e5-447f-8a67-8d23c04adc70/-/preview/" style="height: 328px; width: 500px;"></p>

<p style="text-align: center;"><strong>기술 <span style="color:#e74c3c;"><code>B</code></span></strong>: $1$행과 $2$행에 있는 밥그릇 $4$개, $3$행과 $4$행에 있는 $4$개의 밥그릇에서 그림과 같이 각각 $X$자 형태의 교환이 이루어진다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d5ad4ab0-7f44-4c8b-8dbd-e0aaeccc1232/-/preview/" style="height: 328px; width: 500px;"></p>

<p style="text-align: center;"><strong>기술 <span style="color:#e74c3c;"><code>C</code></span></strong>: $1$행과 $4$행에 있는 밥그릇 $4$개, $2$행과 $3$행에 있는 $4$개의 밥그릇에서 그림과 같이 각각 $X$자 형태의 교환이 이루어진다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5c6c1756-6840-4f52-b493-de947bda4862/-/preview/" style="height: 328px; width: 500px;"></p>

<p style="text-align: center;"><strong>기술 <code><span style="color:#e74c3c;">D</span></code></strong>: $8$개의 밥그릇이 시계 방향으로 $1$칸씩 회전한다.</p>

<p>빈 밥그릇을 고르면 신묘마루가 요술망치(물리)로 당신을 괴롭힐 것이다. <strong>맛있는 햄버거</strong>가 숨겨져 있는 밥그릇을 정확하게 찾을 수 있게 코드를 작성해보자!</p>

## 입력 

 <p>첫 번째 줄에는 <strong>맛있는 햄버거</strong>를 처음 숨긴 밥그릇의 위치 $N$행 $M$열의 위치 정보가 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄에는 신묘마루가 기술을 사용한 횟수 $K$가 주어진다.</p>

<p>세 번째 줄에는 길이 $K$의 문자열 $S$가 주어진다. 문자열의 $i$번째 문자는 신묘마루가 $i$번째로 사용한 기술을 의미한다.</p>

## 출력 

 <p><strong>맛있는 햄버거</strong>가 들어있는 밥그릇의 위치의 행과 열을 공백으로 구분하여 출력한다.</p>

