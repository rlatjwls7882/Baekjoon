# [Gold V] High Score

[문제 링크](https://www.acmicpc.net/problem/15606) 

### 문제 설명

<p>Mårten and Simon enjoy playing the popular board game Seven Wonders, and have just finished a match. It is now time to tally the scores.</p>

<p>One of the ways to score in Seven Wonders is through the use of Science. During the game, the players may collect a number of Science tokens of three different types: Cog, Tablet, and Compass. If a player has a Cogs, b Tablets and c Compasses, that player gets a<sup>2</sup> + b<sup>2</sup> + c<sup>2</sup> + 7 · min(a, b, c) points.</p>

<p>However, the scoring is complicated by the concept of Wildcard Science tokens. For each Wildcard Science token a player has, she may count that as one of the three ordinary types of Science tokens. For instance, the first player in Sample Input 1 has 2 Cogs, 1 Tablet, 2 Compasses, and 1 Wildcard Science, so could thus choose to have the distributions (3, 1, 2),(2, 2, 2) or (2, 1, 3) of Cogs, Tablets and Compasses, respectively. The possible scores for this player are then 3<sup>2</sup> + 1<sup>2</sup> + 2<sup>2</sup> + 7 · 1 = 21, 2<sup>2</sup> + 2<sup>2</sup> + 2<sup>2</sup> + 7 · 2 = 26 and 2<sup>2</sup> + 1<sup>2</sup> + 3<sup>2</sup> + 7 · 1 = 21 depending on how the Wildcard Science is assigned. Thus, the maximum score for this player is 26.</p>

<p>Given the number of tokens each player in the game has, compute the maximum possible score that each of them can achieve if they assign their Wildcard Science tokens optimally.</p>

### 입력 

 <p>The input consists of:</p>

<ul>
	<li>One line with an integer n (3 ≤ n ≤ 7), the number of players in the game.</li>
	<li>n lines, each with four integers a, b, c, d (0 ≤ a, b, c, d ≤ 10<sup>9</sup>), giving the number of Cog, Tablet, Compass, and Wildcard Science tokens of a player.</li>
</ul>

### 출력 

 <p>For each player, in the same order they are given in the input, output the maximum score the player may get.</p>

