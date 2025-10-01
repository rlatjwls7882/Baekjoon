# [Silver II] Anti-Fan Death

[문제 링크](https://www.acmicpc.net/problem/33526) 

## 문제 설명

<p>SUAPC 사무실에는 $3N \times 3N$ 크기의 격자로 이루어져 있는 거대한 창문이 있다. 2025년 새해를 맞아 ANZ는 이 창문을 자신의 닉네임을 이루는 알파벳 3개 <span style="color:#e74c3c;"><code>A</code></span>, <span style="color:#e74c3c;"><code>N</code></span>, <span style="color:#e74c3c;"><code>Z</code></span>를 사용하여 창문을 꾸미고자 한다. ANZ는 창문이 다채로워 보이길 바라기 때문에, 다음 조건을 만족하도록 꾸미려고 한다.</p>

<ul>
	<li>창문을 이루는 각 격자 칸에는 하나의 알파벳만을 사용할 수 있다.</li>
	<li>창문의 모든 행과 열에 알파벳 <span style="color:#e74c3c;"><code>A</code></span>, <span style="color:#e74c3c;"><code>N</code></span>, <span style="color:#e74c3c;"><code>Z</code></span>가 각각 정확히 $N$개씩 포함되어야 한다.</li>
</ul>

<p>하지만 ANZ는 직접 창문을 꾸미기가 너무나도 귀찮아진 나머지 plast에게 이 일을 대신 맡기고 낮잠을 자러 갔다.</p>

<p>일을 떠맡게 된 plast는 ANZ의 안티팬이 되기로 결심했다. 그래서 창문을 조건에 맞춰 꾸미되 오른쪽, 아래쪽, 오른쪽 아래 대각선으로 연속된 세 글자에서 닉네임 “<span style="color:#e74c3c;"><code>ANZ</code></span>”가 나타나지 않도록 꾸미기로 했다. 즉, $W_{i,j}$가 창문의 $i$행 $j$열에 쓰인 알파벳일 때 다음 세 칸에 적힌 알파벳을 연속으로 읽어도 “<span style="color:#e74c3c;"><code>ANZ</code></span>”가 나타나지 않아야 한다.</p>

<ul>
	<li>오른쪽: $W_{i, j}, W_{i, j+1}, W_{i, j+2}$ $(1 \le i \le 3N;$ $1 \le j \le 3N-2)$</li>
	<li>아래쪽: $W_{i, j}, W_{i+1, j}, W_{i+2, j}$ $(1 \le i \le 3N-2;$ $1 \le j \le 3N)$</li>
	<li>오른쪽 아래 대각선: $W_{i, j}, W_{i+1, j+1}, W_{i+2, j+2}$ $(1 \le i \le 3N-2$; $1 \le j \le 3N-2)$</li>
</ul>

<p>plast가 꾸민 창문이 어떤 모양인지 알아내 보자.</p>

## 입력 

 <p>첫 번째 줄에 각 행과 열에 포함되어야 하는 각 알파벳(<span style="color:#e74c3c;"><code>A</code></span>, <span style="color:#e74c3c;"><code>N</code></span>, <span style="color:#e74c3c;"><code>Z</code></span>)의 개수 $N$이 주어진다. $(1 \le N \le 100)$</p>

## 출력 

 <p>$3N$개의 줄에 걸쳐, plast가 꾸민 창문을 출력하시오. $i$번째 줄의 $j$번째 문자는 창문의 $i$행 $j$열에 사용한 알파벳이어야 한다.</p>

<p>만약 문제의 조건에 맞게 창문을 꾸미는 방법이 존재하지 않는다면, <span style="color:#e74c3c;"><code>-1</code></span>을 출력하시오.</p>

