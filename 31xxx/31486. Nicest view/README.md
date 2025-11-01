# [Gold III] Nicest view

[문제 링크](https://www.acmicpc.net/problem/31486) 

## 문제 설명

<p>Paris is so crowded with tourists during the Olympic games! You want to escape the city and go on a hike on a linear trail path. Every kilometre on that trail, including at start and end, is a milestone, on which is written the stone’s altitude. The slope between two consecutive stones is constant, and no two stones have the same altitude.</p>

<p>Planning to come back with your friends, you try to identify the point of the hike at which you had the nicest view. The beauty of a point of view is defined as the distance (measured in kilometres) between your position and the previous position, on your hike, that was at the same altitude. If such a previous position fails to exist, it means that you can see the city and its smog, and the beauty of that view is zero.</p>

<p>You have listed the altitudes of the milestones. What is the maximal beauty on your hike?</p>

## 입력 

 <p>The input consists of two lines. The first line contains a single integer $N$, which is the number of milestones on the trail path. The second line contains $N$ space-separated integers $H_1, H_2, \dots , H_N$; each integer $H_k$ is the altitude (measured in metres) of the $k$<sup>th</sup> milestone on the path.</p>

## 출력 

 <p>The output should contain a single line, consisting of a single number $S$: the best beauty score on your hike. This number is written either as an integer or as an irreducible fraction $N/D$ for which $D \ge 2$; we recall that a fraction $N/D$ is irreducible when the greatest common divisor of $N$ and $D$ is $1$.</p>

