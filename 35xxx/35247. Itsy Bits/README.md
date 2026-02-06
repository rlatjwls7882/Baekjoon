# [Bronze III] Itsy Bits

[문제 링크](https://www.acmicpc.net/problem/35247) 

## 문제 설명

<p>On most modern computers, unsigned numbers are stored in memory-aligned chunks of data, made up of <em>bits</em>. Depending on the size, one storage unit may be called a <em>word</em>, a <em>byte</em>, or even a <em>nybble</em>.</p>

<p>Each kind of storage takes exactly $b = 2^x$ bits of data, for some non-negative integer $x$. The smallest unsigned number that can be stored in a $b$-bit word is $0$, and the largest is $2^b - 1$.</p>

<p>We are designing the storage for an embedded system where the maximum possible number in storage will be known upfront. Calculate the number of bits we should dedicate to it.</p>

## 입력 

 <ul>
<li>One line containing the largest number we need to store, $n$, ($1 \le n \le 10^{18}$).</li>
</ul>

## 출력 

 <p>Output the number of bits we need to allocate to store $n$, which should be a power of two, followed by either "<code> bit</code>" or "<code> bits</code>" as appropriate.</p>

