# [Platinum V] Team selection

[문제 링크](https://www.acmicpc.net/problem/31492) 

## 문제 설명

<p>Two team leaders get to assemble their teams by choosing team members among a set of players that are numbered from $1$ to $N$. The leaders take turns, each picking the $k$<sup>th</sup> player among the remaining ones, according to their ideas of which one of the remaining players would be the best addition to their teams.</p>

<p>Given the choices of the two leaders (the first team leader starts first), please compute the list of players in each team.</p>

## 입력 

 <p>The input consists of three lines. The first line contains the single integer $N$. The second line contains $N/2$ space-separated integers $a_1, a_2, \dots , a_{N/2}$ representing the choices of the first team leader: during the $(2k - 1)$<sup>th</sup> turn, the first leader chose the $a_k$<sup>th</sup> remaining player. The third line contains $N/2$ space-separated integers $b_1, b_2, \dots , b_{N/2}$ representing the choices of the second team leader: during the $2k$<sup>th</sup> turn, the second leader chose the $b_k$<sup>th</sup> remaining player.</p>

## 출력 

 <p>The output should contain two lines, each containing $N/2$ space-separated integers. The first line should contain the list $x_1, x_2, \dots , x_{N/2}$ of the players chosen to become members of the first team, in the order they were chosen: the player $x_k$ was chosen during the $(2k - 1)$<sup>th</sup> turn. The second line should contain the list $y_1, y_2, \dots , y_{N/2}$ of the players chosen to become members of the second team, in the order they were chosen: the player $y_k$ was chosen during the $2k$<sup>th</sup> turn.</p>

