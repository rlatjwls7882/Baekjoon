# [Bronze II] 자세히 보아야 예쁘다

[문제 링크](https://www.acmicpc.net/problem/33572) 

## 문제 설명

<blockquote>
<p><em>자세히 보아야 예쁘다. 오래 보아야 사랑스럽다.</em></p>

<p><em>- 나태주</em></p>
</blockquote>

<p>위 글귀를 인상 깊게 보던 재원이는 한 가지 생각이 들었다. '가만... 디미고에서 사랑에 빠지면 나는 퇴학 처분을 받고 말 거야...!' 따라서 재원이는 한 친구를 너무 오랫동안 보지 않기로 했다.</p>

<p>재원이는 $1$번부터 $N$번까지의 번호를 가진 $N$명의 친구들과 디미고에서 $M$시간 동안 생활하게 된다. 재원이는 항상 한 명 이상의 친구를 보아야 하며 $1$시간마다 그가 보는 친구를 바꿀 수 있다. 만약 $i$번 친구를 $A_i$시간 이상 보게 된다면 사랑에 빠져 퇴학 처분을 받게 된다. 재원이가 사랑에 빠져 퇴학당하지 않도록 도와주자!</p>

## 입력 

 <p>첫 번째 줄에 두 정수 $N$, $M$이 공백으로 구분하여 주어진다.$(1 \leq N \leq 10^5; 1 \leq M \leq 10^{12})$</p>

<p>두 번째 줄에 정수 $A_1, A_2, \cdots, A_N$이 공백으로 구분하여 주어진다. $(1 \leq A_1, A_2, \cdots, A_N \leq 10^{12})$</p>

## 출력 

 <p>첫 번째 줄에 재원이가 퇴학 처분을 받지 않을 수 있다면 <span style="color:#e74c3c;"><code>DIMI</code></span>를, 아니면 <span style="color:#e74c3c;"><code>OUT</code></span>을 출력한다.</p>

