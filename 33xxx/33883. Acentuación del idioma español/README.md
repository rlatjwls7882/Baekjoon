# [Bronze III] Acentuación del idioma español

[문제 링크](https://www.acmicpc.net/problem/33883) 

## 문제 설명

<p>스페인어에는 단어의 발음을 명확히 하기 위해 강세가 사용된다. 강세는 단어마다 정확히 하나가 존재하며, 단어에 존재하는 모음(<span style="color:#e74c3c;"><code>a</code></span>, <span style="color:#e74c3c;"><code>e</code></span>, <span style="color:#e74c3c;"><code>i</code></span>, <span style="color:#e74c3c;"><code>o</code></span>, <span style="color:#e74c3c;"><code>u</code></span>)에만 붙을 수 있다.</p>

<p>만약 단어에 악센트 표시가 붙은 모음(<span style="color:#e74c3c;"><code>á</code></span>, <span style="color:#e74c3c;"><code>é</code></span>, <span style="color:#e74c3c;"><code>í</code></span>, <span style="color:#e74c3c;"><code>ó</code></span>, <span style="color:#e74c3c;"><code>ú</code></span>)이 존재한다면, 악센트 표시가 있는 모음에 강세를 준다. 이를 스페인어의 <strong>불규칙적 강세</strong>라고 한다. 단어에 악센트 표시가 붙은 모음이 단 하나도 존재하지 않는다면, 다음 <strong>규칙적 강세</strong> 규칙에 따라 강세의 위치가 정해진다:</p>

<ul>
	<li><span style="color:#e74c3c"><code>n</code></span>, <span style="color:#e74c3c;"><code>s</code></span> 이외의 자음으로 끝나는 단어는 마지막 모음에 강세를 준다.</li>
	<li>모음으로 끝나는 단어나 <span style="color:#e74c3c"><code>n</code></span> 또는 <span style="color:#e74c3c;"><code>s</code></span>로 끝나는 단어는 뒤에서 두 번째 모음에 강세를 준다.</li>
</ul>

<p>여기서 자음은 모음을 제외한 모든 알파벳을 의미한다.</p>

<p>영어 알파벳 소문자로만 이루어진 문자열 $S$가 주어진다. 문자열 $S$를 규칙적 강세 규칙에 따라 발음하고자 할 때, 어느 문자에 강세를 주어야 하는지 구하여라.</p>

## 입력 

 <p>첫 번째 줄에 영어 알파벳 소문자로만 이루어진 문자열 $S$가 주어진다. $(1\leq|S|\leq 100)$</p>

<p>문자열 $S$의 문자에는 악센트 표시가 없음이 보장된다.</p>

## 출력 

 <p>강세가 붙는 문자가 왼쪽부터 몇 번째에 위치하는지 출력한다. 위치는 $1$부터 시작한다.</p>

<p>단, 강세의 위치를 정할 수 없는 경우는 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>

