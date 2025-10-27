# [Gold I] 중간

[문제 링크](https://www.acmicpc.net/problem/20929) 

## 문제 설명

<p>이 문제는 인터랙티브 문제다.</p>

<p>국렬이는 $1$ 이상 $10^9$ 이하의 $N$개의 자연수로 이루어진 두 배열 $A$, $B$를 가지고 있다. 당신은 $A$, $B$를 합쳤을 때 중간값을 구해야 한다. 중간값은 $2N$개 수들을 오름차순으로 정렬했을 때 $N$번째 수를 중간값이라고 한다.</p>

<p>국렬이는 인성이 나빠서 배열 $A$, $B$를 당신에게 제공하지 않을 것이다. 그래도 약간의 자비가 있기에 특정 배열의 $x$번째 수가 무엇인지 물어볼 기회를 줬다. 다만 40번까지 질문이 가능하며, 그 이상으로 질문할 경우 국렬이는 <span style="color:#c0392b;"><strong>틀렸습니다</strong></span>로 당신을 때릴 것이다. 답을 출력하는 것은 질문 횟수에 포함되지 않는다.</p>

<p>40번 이하로 질문해서 중간값을 구해보자.</p>

## 입력 

 <p>입력의 첫 줄에 배열의 길이 $N$이 주어진다. $N$은 $2^k$으로 표현할 수 있는 양의 정수만 주어진다. ($0 \le k \le 19$)</p>

## 출력 

 <p>다음 중 하나를 표준 출력 스트림(stdout)으로 한 줄에 출력하여, 배열의 원소를 질문 할 수 있다.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>? A x</code></span> : 배열 $A$의 $x$번째 수 ($1 \le x \le N$)</li>
	<li><span style="color:#e74c3c;"><code>? B x</code></span> : 배열 $B$의 $x$번째 수 ($1 \le x \le N$)</li>
</ul>

<p>어떤 배열에서 $x$번째 수는, 그 배열을 오름차순으로 정렬했을 때 $x$번째인 수를 의미한다</p>

<p>각 질문을 출력한 후에는 반드시 표준 출력 버퍼를 flush해 주어야 하고, 표준 입력 스트림(stdin)을 통해 질문에 대한 답을 입력받아야 한다. 질문에 대한 답을 입력받지 않으면 <span style="color:#4e5f70;"><strong>런타임에러</strong></span>를 받게 된다. 최대 질문 횟수는 40번으로, 그 이상으로 질문을 요청한 경우 <span style="color:#c0392b;"><strong>틀렸습니다!</strong></span>를 받는다.</p>

<p>만약 중간값을 알아낸 경우, 표준 출력 스트림으로 다음을 한 줄에 출력한다.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>! x</code></span> : 배열 A, B를 합쳤을 때의 중앙값은 $x$이다.</li>
</ul>

<p>그 후 반드시 표준 출력 버퍼를 flush해야 하고, 프로그램을 종료한다. 이것은 질문 횟수에 포함되지 않는다.</p>

<p>언어별로 표준 출력 버퍼를 flush하는 방법은 다음과 같다.</p>

<ul>
	<li>C: <code>fflush(stdout)</code></li>
	<li>C++: <code>std::cout << std::flush</code></li>
	<li>Java: <code>System.out.flush()</code></li>
	<li>Python: <code>sys.stdout.flush()</code></li>
</ul>

