# [Diamond III] NOGA

[문제 링크](https://www.acmicpc.net/problem/3150) 

## 문제 설명

<p>N grasshoppers are waiting in line to see a show. Waiting is boring, so they waste doing one of the following two moves: </p>

<ul>
	<li>The grasshopper in position A jumps over B grasshoppers to his left, or </li>
	<li>The grasshopper in position A jumps over B grasshoppers to his right. </li>
</ul>

<p>The grashoppers aren't all of the same height. When jumping, a grashopper must be careful not to hit another grasshopper with its leg. More precisely, it needs to jump as high as the height of the tallest grasshopper it is jumping over. </p>

<p>Given the sequence of jumps, output the height of each jump. </p>

## 입력 

 <p>The first line contains two integers N and J (2 ≤ N ≤ 100 000, 1 ≤ J ≤ 100 000), the number of grasshoppers in line and the number of jumps. </p>

<p>The second line contains N integers less than 100 000, the heights of grasshoppers in the initial ordering. The first grasshopper is initially in position 1, the second in position 2 etc. </p>

<p>Each of the following S lines describes one jump. Every line contains an integer A (1 ≤ A ≤ N), the position of the jumping grashopper, a the direction in which it jumps ('L' for left, 'D' for right), and an integer B (1 ≤ B ≤ N), the number of grasshoppers it jumps over. Each jump will be valid (the number B will be less than or equal to the number of grasshoppers on the corresponding side of the grasshopper in position A). </p>

<p>The jumps are given in the order in which the grasshoppers do them. </p>

## 출력 

 <p>Output J lines, containing the heights of the jumps, in order in which they are performed. </p>

