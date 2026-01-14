# [Bronze I] 꼬마 미타

[문제 링크](https://www.acmicpc.net/problem/34923) 

## 문제 설명

<p>브론즈는 꼬마 미타와 함께 방탈출 게임을 하고 있다.</p>

<p>이 방에 있는 수많은 벽시계가 같은 시각을 가리킨 채로 멈춰 있다. 브론즈는 그중 다른 시각을 가리키는 자명종 시계를 발견했다.</p>

<p>자명종 시계를 다른 시계들과 같은 시각을 가리키도록 맞추면 이곳에서 탈출할 수 있다.</p>

<p>남은 시간이 많지 않기 때문에 시계의 분침을 최소한으로 돌려서 시계를 맞추려고 한다. 시계의 시침은 분침을 돌려서만 움직일 수 있다. 분침을 적어도 얼마나 돌려야 할지 구해보자.</p>

## 입력 

 <p>첫째 줄에 자명종 시계가 가리키는 시각이 <span style="color:#e74c3c;"><code>hh:mm</code></span>의 형식으로 주어진다. $(01 \leq \mathrm{hh} \leq 12;$ $00 \leq \mathrm{mm} \leq 59)$</p>

<p>둘째 줄에 벽시계들이 가리키는 시각이 <span style="color:#e74c3c;"><code>hh:mm</code></span>의 형식으로 주어진다. $(01 \leq \mathrm{hh} \leq 12;$ $00 \leq \mathrm{mm} \leq 59)$</p>

<p><strong>시침이 가리키는 수의 범위에 유의하라.</strong> 방 안에 있는 모든 시계는 오전과 오후를 구분하지 않는다.</p>

<p>입력으로 주어지는 <span style="color:#e74c3c;"><code>hh:mm</code></span>은 모두 정확히 <span style="color:#e74c3c;"><code>hh</code></span>시 <span style="color:#e74c3c;"><code>mm</code></span>분을 의미한다.</p>

## 출력 

 <p>자명종 시계를 벽시계가 가리키는 시각으로 맞추기 위해 돌려야 하는 분침의 최소 회전 각도(${}^{\circ}$)를 출력한다.</p>

