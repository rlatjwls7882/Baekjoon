# [Diamond I] Monster Hunter

[문제 링크](https://www.acmicpc.net/problem/18596) 

## 문제 설명

<p>Little Q is fighting against scary monsters in the game “Monster Hunter”. The battlefield consists of n intersections, labeled by 1, 2, . . . , n, connected by n − 1 bidirectional roads like a tree. Little Q is now at intersection 1 and has X health points (HP).</p>

<p>There is a monster at each intersection except intersection 1. When Little Q moves to the k-th intersection for the first time, he must fight the monster at that intersection. During the fight, he will lose a<sub>i</sub> HP. And when he finally beats the monster, he will be awarded b<sub>i</sub> HP. Note that when HP becomes negative (< 0), the game will end, so never let this happen. If Little Q visits the same intersection more than once, the fight happens only on the first visit, as monsters do not have an extra life.</p>

<p>When all monsters are cleared, Little Q will win the game. Please write a program to compute the minimum initial HP that can lead to victory.</p>

## 입력 

 <p>The first line of the input contains an integer T (1 ≤ T ≤ 2000), denoting the number of test cases.</p>

<p>In each test case, there is one integer n (2 ≤ n ≤ 100 000) on the first line, denoting the number of intersections.</p>

<p>Each of the next n − 1 lines contains two integers a<sub>i</sub> and b<sub>i</sub> (0 ≤ a<sub>i</sub>, b<sub>i</sub> ≤ 10<sup>9</sup>) describing monsters at intersections 2, 3, . . . , n.</p>

<p>Each of the next n − 1 lines contains two integers u and v (1 ≤ u, v ≤ n, u ≠ v) denoting a bidirectional road between intersection u and intersection v. It is guaranteed that the roads form a tree.</p>

<p>It is guaranteed that the sum of all n is at most 10<sup>6</sup>.</p>

## 출력 

 <p>For each test case, print a single line containing an integer, denoting the minimum initial HP required to win the game.</p>

