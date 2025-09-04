# [Gold III] Colored Squares

[문제 링크](https://www.acmicpc.net/problem/20714) 

## 문제 설명

<p>Graphic design is Aditya's new passion. He has launched his new company, Turmeric, and his first client comes to him to design a new logo. The old logo consists of $n$ colored squares in a row. The $i$-th square is painted in a color represented by a number $s_i$ such that $1 \leq s_i \leq c$, where $c$ is the total number of colors in the logo. Now, the client is a very picky person. He will not allow Aditya to change any of the square's colors but he will give Aditya the artistic freedom to delete up to $k$ squares in the logo. Aditya thinks that the aesthetic score of a logo is equal to the maximum number of consecutive squares with the same color. Help Aditya figure out how to remove <strong>at most</strong> $k$ squares such that the aesthetic score of the new logo is maximized. Aditya may choose to not remove any squares.</p>

## 입력 

 <p>The first line of input is $3$ integers separated by spaces $n$, $c$, and $k$ such that $1 \leq n \leq 2 \cdot 10^5$ , $1 \leq c \leq 10^5$, and $1 \leq k < n$ </p>

<p>The next line is $n$ integers $s_1, s_2 \ldots s_n$ separated by spaces representing the color of each square in the pattern, such that $1 \leq s_i \leq c$.</p>

## 출력 

 <p>Output a single integer, the maximum possible aesthetic score of the new logo.</p>

