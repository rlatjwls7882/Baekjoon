# [Platinum IV] Broken trophy

[문제 링크](https://www.acmicpc.net/problem/31493) 

## 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/50b1c1f5-67d1-4216-bfbe-087c76ea031f/-/preview/" style="width: 276px; height: 120px;"></p>

<p>Coming back home after triumphally winning your long-coveted trophy, you discover that it was shattered to pieces in your trunk. It just remains to repair it.</p>

<p>Your trophy had the shape of a rectangle of size $3 \times N$, for some integer $N \ge 1$, thereby consisting of $3$ lines and $N$ columns, containing a total of $3N$ unit squares. It was broken into $K$ pieces, the $k$<sup>th</sup> piece being a rectangle of size $A_k \times B_k$ for some integers $A_k$ and $B_k$ such that $1 \le A_k \le B_k \le 3$. Such pieces may have been rotated, or even flipped, in the havoc that is your trunk.</p>

<p>As the first step towards repairing your trophy, you should reassemble them in the form of a rectangle of size $3 \times N$. More precisely, you have drawn, on a sheet of paper, a $3 \times N$ rectangle on which you will place your $K$ pieces, and you need to know, for all integers $i \le 3$ and $j \le N$, which piece will cover the unit square on the $i$<sup>th</sup> line and $j$<sup>th</sup> column of your rectangle.</p>

## 입력 

 <p>The input consists of three lines, each one containing space-separated integers. The first line contains the numbers $K$ and $N$. The second line contains the numbers $A_1, A_2, \dots , A_K$. The third line contains the numbers $B_1, B_2, \dots, B_K$.</p>

## 출력 

 <p>The output should contain three lines, each one consisting of $N$ space-separated integers. If you plan to cover the unit square on the $i$<sup>th</sup> line and $j$<sup>th</sup> column with the $k$<sup>th</sup> piece, the $j$<sup>th</sup> number on the $i$<sup>th</sup> output line should be the integer $k$.</p>

<p>In case there are several ways to reassemble your pieces in the form of a rectangle of size $3 \times N$, every output representing one of these ways is considered correct.</p>

