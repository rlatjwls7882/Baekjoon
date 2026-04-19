# [Diamond IV] Kings

[문제 링크](https://www.acmicpc.net/problem/17575) 

## 문제 설명

<p>A heated game of “chess-tidying” starts with a messy board containing several king pieces strewn across the cells. The player’s job is to put all of the pieces into a line along the primary diagonal of the board, which runs along black squares.</p>

<p>In each move, unlike in normal chess, one king may be moved one place either horizontally or vertically (but not both) to another unoccupied cell.</p>

<p>Given an instance of the game, find how many moves you will need in order to finish it.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/01744252-9707-4138-b9f9-785db7ab905a/-/preview/" style="width: 303px; height: 307px;"></p>

<p style="text-align: center;">Figure K.1: Illustration of Sample Input 2. In this case, the minimum number of moves necessary to put all of the kings along the black diagonal is 28 as pictured.</p>

## 입력 

 <ul>
	<li>One line with the number of rows and columns, n (1 ≤ n ≤ 500).</li>
	<li>Each of the following n lines contains the two-dimensional integer coordinates c and r (1 ≤ c, r ≤ n), the position of one of the kings.</li>
</ul>

<p>Each of the kings starts at a unique position.</p>

## 출력 

 <p>Output the minimum number of moves necessary to cover the main diagonal (r = c) with kings.</p>

