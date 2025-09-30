# [Silver V] Oooh I See

[문제 링크](https://www.acmicpc.net/problem/32813) 

## 문제 설명

<p>Captain O'Capten has hidden some treasure and created a map to mark where it is buried. Rather than using 'X' to mark the spot, he has decided to obfuscate the location by using a grid of uppercase <code>O</code> (the letter <code>O</code>) characters and <code>0</code> (the number <code>0</code>) characters. The treasure's position is given by the location of a <code>0</code> character surrounded on all sides by $8$ <code>O</code> characters. That is, a <code>0</code> character with an <code>O</code> immediately above, below, to the left, to the right, diagonally above to the left, diagonally above to the right, diagonally below to the left, and diagonally below to the right.</p>

<p>Captain O'Capten wants to recover the location of his treasure but he is finding his map hard to read (huh, go figure). Help Captain O'Capten find the location of his treasure, or exclaim <code>Oh no!</code> if such a location is not marked on the map or there is more than one such location.</p>

## 입력 

 <p>The first line contains two integers $r$ and $c$ ($1\leq r,c \leq 50$), where $r$ indicates the number of rows and $c$ indicates the number of columns of characters in the map. Rows are numbered $1$ to $r$, top to bottom, and columns are numbered $1$ to $c$, left to right. This is followed by $r$ lines, each with $c$ characters, where each character is either <code>O</code> or <code>0</code>.</p>

## 출력 

 <p>If there is no <code>0</code> character surrounded on all sides by $8$ <code>O</code> characters, then output one line consisting of the exclamation, <code>Oh no!</code>. If there is more than one <code>0</code> character surrounded on all sides by $8$ <code>O</code> characters, then output one line consisting of the exclamation, <code>Oh no! N locations</code>, with the number of locations instead of <code>N</code>. If there is exactly one <code>0</code> character surrounded on all sides by $8$ <code>O</code> characters, then output one line containing two integers. The first integer is the index of the row of the <code>0</code> character and the second integer is the index of the column of the <code>0</code> character. </p>

