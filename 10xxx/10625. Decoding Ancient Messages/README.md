# [Diamond III] Decoding Ancient Messages

[문제 링크](https://www.acmicpc.net/problem/10625) 

## 문제 설명

<p>Professor Y's work is to dig up ancient artifacts. Recently, he found a lot of strange stone plates, each of which has \(N^2\) characters arranged in an \(N \times N\) matrix. Further research revealed that each plate represents a message of length \(N\). Also, the procedure to decode the message from a plate was turned out to be the following:</p>

<ol>
	<li>
	<p>Select \(N\) characters from the plate one by one so that any two characters are neither in the same row nor in the same column.</p>
	</li>
	<li>
	<p>Create a string by concatenating the selected characters.</p>
	</li>
	<li>
	<p>Among all possible strings obtained by the above steps, find the lexicographically smallest one. It is the message represented by this plate.</p>
	</li>
</ol>

<p>NOTE: The order of the characters is defined as the same as the order of their ASCII values (that is, \(\mathtt{A} \lt \mathtt{B} \lt \cdots \lt \mathtt{Z} \lt \mathtt{a} \lt \mathtt{b} \lt \cdots \lt \mathtt{z}\)).</p>

<p>After struggling with the plates, Professor Y gave up decoding messages by hand. You, a great programmer and Y's old friend, was asked for a help. Your task is to write a program to decode the messages hidden in the plates.</p>

## 입력 

 <p>The input is formated as follows:</p>

<pre>N
c<sub>11</sub>c<sub>12</sub>...c<sub>1N</sub>
c<sub>21</sub>c<sub>22</sub>...c<sub>2N</sub>
:
:
c<sub>N1</sub>c<sub>N2</sub>...c<sub>NN</sub>
</pre>

<p>The first line contains an integer \(N\) (\(1 \le N \le 50\)). Each of the subsequent \(N\) lines contains a string of \(N\) characters. Each character in the string is an uppercase or lowercase English letter (<code>A</code>-<code>Z</code>, <code>a</code>-<code>z</code>).</p>

## 출력 

 <p>Print the message represented by the plate in a line.</p>

