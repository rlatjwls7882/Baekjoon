# [Bronze III] Snakey String

[문제 링크](https://www.acmicpc.net/problem/35367) 

## 문제 설명

<p>A <em>snakey string</em> is a fancy rendering of an otherwise normal string of text. When a string is made snakey, it is placed on a 2D grid such that the following conditions are met:</p>

<ul>
<li>The first character of the string is on the first column of the grid, the second on the second column, …, and the last on the last column.</li>
<li>Each character in the string occupies either the row directly above or directly below the row of the previous character.</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f7a4c3b0-6a44-4d40-a850-50f5a1e8b56c/-/preview/" style="width: 250px; height: 126px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: The snakey string in the sample case.</p>

<p>Given a snakey string, can you recover the original string?</p>

## 입력 

 <p>The first line of input contains two integers $r$ and $c$ ($2 \le r, c \le 100$), the number of rows and columns of the grid.</p>

<p>The next $r$ lines each contain $c$ characters that form the 2D grid containing the snakey string. Empty cells are encoded with a period, while uppercase letters (<code>A-Z</code>) represent characters in the original string. Every column in the grid contains exactly one uppercase letter. It is possible that some rows do not contain any uppercase letters.</p>

## 출력 

 <p>Output a single string, the original string that was used to build this snakey string.</p>

