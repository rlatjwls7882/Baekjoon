# [Silver III] 괄호 조작하기

[문제 링크](https://www.acmicpc.net/problem/34994) 

## 문제 설명

<p>토카 왕국에는 괄호 문자열들이 사는 도시가 있다. 토카 왕국은 올바른 괄호 문자열만을 시민으로 인정하기에 매년 괄호 문자열이 올바른 괄호 문자열인지 검사한다. 검사 결과 올바른 괄호 문자열이 아니라면 토카 왕국에서 쫓겨나게 된다.</p>

<p>다음과 같은 규칙을 만족하는 문자열을 올바른 괄호 문자열이라고 한다.</p>

<ul>
<li><span style="color:#e74c3c;"><code>()</code></span>, <span style="color:#e74c3c;"><code>[]</code></span>, <span style="color:#e74c3c;"><code>{}</code></span>은 모두 올바른 괄호 문자열이다.</li>
<li>만약 $X$, $Y$가 모두 올바른 괄호 문자열이라면 $XY$도 올바른 괄호 문자열이다.</li>
<li>만약 $X$가 올바른 괄호 문자열이라면 <span style="color:#e74c3c;"><code>(</code></span>$X$<span style="color:#e74c3c;"><code>)</code></span>, <span style="color:#e74c3c;"><code>[</code></span>$X$<span style="color:#e74c3c;"><code>]</code></span>, <span style="color:#e74c3c;"><code>{</code></span>$X$<span style="color:#e74c3c;"><code>}</code></span>도 올바른 괄호 문자열이다.</li>
</ul>

<p>괄호 문자열들은 토카 왕국에서 쫓겨나지 않기 위해 자신을 구성하는 괄호 중 최대 하나를 <span style="color:#e74c3c;"><code>(</code></span>, <span style="color:#e74c3c;"><code>)</code></span>, <span style="color:#e74c3c;"><code>[</code></span>, <span style="color:#e74c3c;"><code>]</code></span>, <span style="color:#e74c3c;"><code>{</code></span>, <span style="color:#e74c3c;"><code>}</code></span> 중 원하는 것으로 조작할 수 있다. 괄호 문자열들이 토카 왕국에서 쫓겨나지 않도록 도와주자!</p>

## 입력 

 <p>첫 번째 줄에 괄호 문자열의 수 $N$ $(1 \leq N \leq 1\,000)$이 주어진다.</p>

<p>이후 $N$줄에 걸쳐 <span style="color:#e74c3c;"><code>(</code></span>, <span style="color:#e74c3c;"><code>)</code></span>, <span style="color:#e74c3c;"><code>[</code></span>, <span style="color:#e74c3c;"><code>]</code></span>, <span style="color:#e74c3c;"><code>{</code></span>, <span style="color:#e74c3c;"><code>}</code></span>으로 이루어진 괄호 문자열 $S$ $(1 \leq |S| \leq 100)$가 한 줄에 하나씩 주어진다.</p>

## 출력 

 <p>각 괄호 문자열에 대해 괄호 문자열을 조작해 올바른 괄호 문자열이 될 수 없다면 첫 번째 줄에 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>

<p>올바른 괄호 문자열이 될 수 있다면 첫 번째 줄에 <span style="color:#e74c3c;"><code>YES</code></span> $x$ $(0 \leq x \leq 1)$를 공백으로 구분하여 출력한다. $x$는 조작할 횟수이다.</p>

<p>이후 $x$개 줄에 걸쳐 조작할 문자의 위치 $j$ $(1 \leq j \leq |S|)$와 변경할 문자를 공백으로 구분하여 출력한다. 답이 여러 가지라면 그 중 아무거나 하나를 출력한다.</p>

