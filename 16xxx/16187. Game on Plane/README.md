# [Platinum III] Game on Plane

[문제 링크](https://www.acmicpc.net/problem/16187) 

## 문제 설명

<p>You are given $N$ points on a plane. These points are precisely the set of vertices of some regular $N$-gon. Koosaga, an extreme villain, is challenging you with a game using these points. You and Koosaga alternatively take turns, and in each turn, the player</p>

<ol>
	<li>chooses two of the given points, then</li>
	<li>draws the line segment connecting the two chosen points.</li>
</ol>

<p>Also, the newly drawn line segment must not intersect with any of the previously drawn line segments in the interior. It is possible for two segments to meet at their endpoints. If at any point of the game, there exists a convex polygon consisting of the drawn line segments, the game ends and the last player who made the move wins.</p>

<p>Given the integer $N$, Koosaga is letting you decide who will move first. Your task is decide whether you need to move first or the second so that you can win regardless of Koosaga's moves.</p>

## 입력 

 <p>The input consists of many test cases. The first line contains an integer $T$ ($1\leq T\leq 5,000$), the number of test cases. Each of the following $T$ test cases is consisted of one line containing the integer $N$ ($3\leq N\leq 5,000$).</p>

## 출력 

 <p>For each test case, print one line containing the string <code><samp>First</samp></code> if you need to move first or <code><samp>Second</samp></code> if you need to move second so that you can win regardless of Koosaga's moves.</p>

