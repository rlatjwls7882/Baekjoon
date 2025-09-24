# [Gold II] snupc 문자열 (Easy)

[문제 링크](https://www.acmicpc.net/problem/34348) 

## 문제 설명

<p>알파벳 <code><span style="color:#e74c3c;">s</span></code>,<code><span style="color:#e74c3c;">n</span></code>,<code><span style="color:#e74c3c;">u</span></code>,<code><span style="color:#e74c3c;">p</span></code>,<code><span style="color:#e74c3c;">c</span></code>로만 이루어진 문자열 $S$가 주어진다.</p>

<p>$f(1)=$ <code><span style="color:#e74c3c;">snupc</span></code>, $f(2)=$ <code><span style="color:#e74c3c;">ssnnuuppcc</span></code>와 같이 $f(k)$를 <code><span style="color:#e74c3c;">s</span></code>,<code><span style="color:#e74c3c;">n</span></code>,<code><span style="color:#e74c3c;">u</span></code>,<code><span style="color:#e74c3c;">p</span></code>,<code><span style="color:#e74c3c;">c</span></code> 각 $k$개가 순서대로 연속하여 이어진 문자열로 정의하자. $f(0)$은 빈 문자열을 의미한다.</p>

<p>$Q$개의 쿼리가 주어질 때, 다음을 처리하는 프로그램을 작성하라.</p>

<ul>
	<li>$l$ $r$: $S$의 $l$번째 문자부터 $r$번째 문자까지를 이은 새로운 문자열에 대해, $f(k)$가 부분 수열(Subsequence)로 등장하도록 하는 $k$의 최댓값을 출력한다.</li>
</ul>

<p>문자열의 부분 수열이란, 원래 문자열에서 $0$개 이상의 문자를 제거하여 얻을 수 있는 문자열을 말한다. 단, 남은 문자의 순서는 바꿀 수 없으며, 연속할 필요는 없다. 예를 들어 <code><span style="color:#e74c3c;">abcde</span></code>의 부분 수열은 <code><span style="color:#e74c3c;">ace</span></code>,<code><span style="color:#e74c3c;">bd</span></code>,<code><span style="color:#e74c3c;">a</span></code>,<code><span style="color:#e74c3c;">abcde</span></code>, 빈 문자열 등이 해당한다.</p>

## 입력 

 <p>첫째 줄에 문자열 $S$가 주어진다. $(1 \le |S| \le 100\,000)$</p>

<p>둘째 줄에 쿼리의 개수 $Q$가 주어진다. $(1 \le Q \le 5\,000)$</p>

<p>셋째 줄부터 $Q$개의 줄에 걸쳐, 쿼리에 대한 정보 $l$, $r$이 공백으로 구분되어 주어진다. $(1 \le l \le r \le |S|)$</p>

<p>입력으로 주어지는 모든 수는 정수이다.</p>

## 출력 

 <p>각 쿼리에 대한 결과를 한 줄에 하나씩 출력한다.</p>

