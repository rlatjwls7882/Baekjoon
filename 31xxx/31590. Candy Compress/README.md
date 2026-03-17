# [Platinum I] Candy Compress

[문제 링크](https://www.acmicpc.net/problem/31590) 

## 문제 설명

<p>You are developing a mobile game called <em>Candy Compress</em>. In this game, there are several colored candies lined up from left to right. There are $26$ possible colors. At any point in time, the player can choose to add a candy at any position or to remove a subset of neighboring candies to get points depending on the colors of the removed candies.</p>

<p>To develop the game, you need to implement the following data structure. Initially, the data structure loads a $1$-indexed string of $n$ characters, which represents the colors of the initial candies. The string consists of only uppercase Latin characters (<code>A</code>–<code>Z</code>). After loading the string, there are $q$ operations that you need to support. Each operation is either one of the following:</p>

<ul>
	<li><strong>Operation 1</strong>: Insert the uppercase Latin character $c$ to the string so that the character is in the $i$-th position in the new string. In particular, $i = 1$ means inserting character $c$ at the beginning of the string. It is guaranteed that $1 ≤ i ≤ m + 1$, where $m$ is the length of the string just before this operation.</li>
	<li><strong>Operation 2</strong>: Remove the characters of the string from the $l$-th to the $r$-th position, inclusive. It is guaranteed that $1 ≤ l ≤ r ≤ m$, where $m$ is the length of the string just before this operation.</li>
</ul>

<p>For each Operation 2, your data structure needs to determine the characters that are removed, so that the game can calculate the number of points to be given to the player. In other words, you need to determine the content of the string from the $l$-th position to the $r$-th position just before the operation.</p>

## 입력 

 <p>The first line of input contains two integers $n$ and $q$ ($1 ≤ n ≤ 300\, 000$; $1 ≤ q ≤ 300\, 000$). The second line contains a string consisting of $n$ uppercase Latin characters representing the initial string to be loaded by the data structure. Each of the next $q$ lines represents an operation with either one of the following formats:</p>

<ol>
	<li><code>1</code> $c$ $i$ represents an Operation 1. It is guaranteed that $c$ is an uppercase Latin character and $1 ≤ i ≤ m + 1$, where $m$ is the length of the string just before this operation.</li>
	<li><code>2</code> $l$ $r$ represents an Operation 2. It is guaranteed that $1 ≤ l ≤ r ≤ m$ where $m$ is the length of the string just before this operation.</li>
</ol>

<p>The operations are given in the order they are to be performed. It is guaranteed that there is at least one Operation 2.</p>

## 출력 

 <p>For each Operation 2 in order, output one line containing the characters that are removed by the operation.</p>

