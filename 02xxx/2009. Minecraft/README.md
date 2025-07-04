# [Silver II] Minecraft

[문제 링크](https://www.acmicpc.net/problem/2009) 

## 문제 설명

<p>2009년은 전 세계 게이머들이 사랑하는 게임인 Minecraft가 출시된 해입니다. 그동안 Minecraft에서 쌓은 추억을 회상하며 흐즈로는 다음 문제를 떠올렸습니다.</p>

<p>$n\times n\times n$의 3차원 격자 $M$을 생각합시다. 그 중 $i$번째 층, $j$번째 행, $k$번째 열의 칸은 $M_{i,j,k}$로 표기하며, 각 칸에는 블록이 최대 한 개 존재합니다. 해당하는 칸에 블록이 한 개 있다면 $M_{i,j,k}=1$, 없다면 $M_{i,j,k}=0$으로 표기합니다. 축에 나란한 3개의 평면에 격자의 상태를 사영한 $n\times n$의 2차원 격자를 각각 $H$, $R$, $C$라고 합시다. 각각의 격자를 엄밀히 정의하면 다음과 같습니다.</p>

<ul>
	<li>$j$번째 행 $k$번째 열에 블록이 적어도 하나 존재한다면, $H_{j,k}=1$입니다. 그렇지 않다면 $H_{j,k}=0$입니다.</li>
	<li>$i$번째 층 $k$번째 열에 블록이 적어도 하나 존재한다면, $R_{i,k}=1$입니다. 그렇지 않다면 $R_{i,k}=0$입니다.</li>
	<li>$i$번째 층 $j$번째 행에 블록이 적어도 하나 존재한다면, $C_{i,j}=1$입니다. 그렇지 않다면 $C_{i,j}=0$입니다.</li>
</ul>

<p>여러분에게 세 격자 $H'$, $R'$, $C'$가 주어집니다. 여러분은 3차원 격자를 사영한 결과가 $H=H'$, $R=R'$, $C=C'$가 되는 3차원 격자 $M'$이 존재하는지 확인하는 프로그램을 만들어야 합니다.</p>

## 입력 

 <p>첫 번째 줄에 격자의 한 변의 크기를 나타내는 정수 $n$이 주어집니다. ($1\le n\le 100$)</p>

<p>두 번째 줄부터 $n$개의 줄에 걸쳐 각 줄에 <span style="color:#e74c3c;"><code>0</code></span>과 <span style="color:#e74c3c;"><code>1</code></span>로 이루어진 길이 $n$의 문자열이 주어집니다. 그 중 $j$번째 줄의 $k$번째 문자는 $H'_{j,k}$의 값입니다.</p>

<p>$n+2$번째 줄부터 $n$개의 줄에 걸쳐 각 줄에 <span style="color:#e74c3c;"><code>0</code></span>과 <span style="color:#e74c3c;"><code>1</code></span>로 이루어진 길이 $n$의 문자열이 주어집니다. 그 중 $i$번째 줄의 $k$번째 문자는 $R'_{i,k}$의 값입니다.</p>

<p>$2n+2$번째 줄부터 $n$개의 줄에 걸쳐 각 줄에 <span style="color:#e74c3c;"><code>0</code></span>과 <span style="color:#e74c3c;"><code>1</code></span>로 이루어진 길이 $n$의 문자열이 주어집니다. 그 중 $i$번째 줄의 $j$번째 문자는 $C'_{i,j}$의 값입니다.</p>

## 출력 

 <p>조건을 만족하는 격자 $M'$가 존재한다면 한 줄에 <span style="color:#e74c3c;"><code>YES</code></span>를 출력합니다. 그 다음 줄부터 출력해야 할 내용은 다음과 같습니다.</p>

<p>$n \times n$의 격자를 총 $n$번 출력합니다. 각각의 격자를 출력할 때는 $n$개의 줄에 걸쳐 각 줄에 <code><span style="color:#e74c3c;">0</span></code>과 <code><span style="color:#e74c3c;">1</span></code>로 이루어진 길이 $n$의 문자열을 출력합니다. $i$번째 격자의 $j$번째 줄 $k$번째 문자는 출력할 격자의 한 칸 $M'_{i,j,k}$에 대응됩니다. 가능한 격자 $M'$가 여러 개 존재한다면 그 중 하나만 출력합니다.</p>

<p>조건을 만족하는 격자 $M'$가 존재하지 않는다면 한 줄에 <code><span style="color:#e74c3c;">NO</span></code>를 출력합니다.</p>

