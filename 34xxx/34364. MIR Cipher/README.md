# [Bronze III] MIR Cipher

[문제 링크](https://www.acmicpc.net/problem/34364) 

## 문제 설명

<p>Mines Internet Radio (MIR) has recently been intercepting some weird transmissions, and they believe it is some type of encoded message. They have figured out how the messages can be decoded, but are having a hard time doing it by hand with the quantity they have received, so they've tasked you with creating a program to decode the messages.</p>

<p>They've identified the following procedure for decoding the the message they received. </p>

<p>The first letter of the message is shifted by $1$ letter, with shifts wrapping around to the beginning of the alphabet. This means that an <code>A</code> would become a <code>B</code>, a <code>B</code> would become a <code>C</code>, etc. with a <code>Z</code> wrapping around to become an <code>A</code>. Each subsequent letter in the message is shifted by twice the amount of the previous letter, with shifts wrapping around the alphabet as with the first letter. This means the second letter in the message is shifted by $2$ letters, so an <code>A</code> becomes a <code>C</code>, a <code>B</code> becomes a <code>D</code>, etc. all the way down to <code>Y</code> which would become an <code>A</code> and <code>Z</code> which would become <code>B</code>. The third letter of the message is shifted by $4$ letters in a similar manner, and so on for the rest of the letters in the message.</p>

<p>Note that the shift amount could be more than the number of letters in the alphabet in which case you need to wrap around the alphabet multiple times.</p>

## 입력 

 <p>You will be given one line of input consisting of two parts separated by a space:</p>

<ul>
	<li>An integer $1 \leq N \leq 60$ representing the number of letters in the message to follow.</li>
	<li>A string of length $N$ consisting of only uppercase letters in the English alphabet (A-Z).</li>
</ul>

## 출력 

 <p>Output one line with the decoded string in all upper-case letters.</p>

