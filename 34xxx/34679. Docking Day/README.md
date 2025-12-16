# [Platinum V] Docking Day

[문제 링크](https://www.acmicpc.net/problem/34679) 

## 문제 설명

<p>A space station has docking ports labeled by distinct positive integers $1, 2, 3, \dots$ arranged in a straight line. Port $1$ is the leftmost, and the line extends infinitely to the right. Three labeled ships—Red ($R$), Green ($G$), and Blue ($B$)—are currently at different ports. Due to maintenance, traffic control must re-dock the three ships to newly assigned target ports. To keep clear sight lines and safe spacing during re-docking, the moving ship must pass over exactly one other ship—no more, no less. Specifically, traffic control wants to re-dock while satisfying these constraints:</p>

<ol>
<li>Each ship must end at its own target port.</li>
<li>At any time, no two ships may occupy the same port.</li>
<li>In one move, choose one ship and place it on an empty port so that exactly one of the other two ships has a port strictly between the old and new ports.</li>
</ol>

<p>For example, suppose $R$, $G$, and $B$ are currently at ports $3$, $4$, $8$ and their target ports are $3$, $2$, $10$, respectively. In three moves - (1) move $G$ from $4$ to $9$ (passing $B$), (2) move $B$ from $8$ to $10$ (passing $G$), and (3) move $G$ from $9$ to $2$ (passing $R$) - all three ships reach their targets. See the figures below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/181422c3-e6d5-4fe5-aa7f-5226ab7fd4e0/-/preview/" style="width: 402px; height: 237px;"></p>

<p>Given the current ports and target ports of the three ships, write a program to compute the minimum number of moves required to re-dock them to the target ports.</p>

## 입력 

 <p>Your program is to read from standard input. The input starts with a line containing three distinct integers, $r_1$, $g_1$ and $b_1$ ($1 ≤ r_1, g_1, b_1 ≤ 10^6$), which denote the positions of the current ports of $R$, $G$, and $B$, respectively. The following line contains three distinct integers, $r_2$, $g_2$ and $b_2$ ($1 ≤ r_2, g_2, b_2 ≤ 10^6$), which denote the positions of the target ports of $R$, $G$, and $B$, respectively.</p>

## 출력 

 <p>Your program is to write to standard output. Print exactly one line. The line should contain the minimum number of moves required to re-dock them to the target ports.</p>

