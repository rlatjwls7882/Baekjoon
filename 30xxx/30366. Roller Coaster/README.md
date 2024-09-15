# [Bronze IV] Roller Coaster - 30366 

[문제 링크](https://www.acmicpc.net/problem/30366) 

### 성능 요약

메모리: 37224 KB, 시간: 540 ms

### 분류

사칙연산, 구현, 수학, 시뮬레이션

### 제출 일자

2023년 10월 15일 19:23:42

### 문제 설명

<p>In Japan Amusement Group (JAG), members discuss how to have better amusement to attract many people. These days, they are interested in reducing waiting time stress.</p>

<p>As a member of JAG, you found out the hypothesis that knowing waiting time can reduce such kind of stress. Therefore, you decided to write a program which presumes the waiting time of a roller coaster.</p>

<p>$N$ groups stand in line for the roller coaster, and the groups are numbered from $1$ to $N$. The group $i$ has $a_i$ people. People in line ride the roller coaster in ascending order of group number.</p>

<p>The first roller coaster departs at time and departs every minute thereafter. The roller coaster can hold up to $M$ people.</p>

<p>For each group, the whole group member must ride the roller coaster at the same time. Additionally, there is no need to get exactly $M$ people on the roller coaster at one time. Each group wants to ride the roller coaster as soon as possible, so they ride it if they can.</p>

<p>You should output $N$ lines. In the $i$-th line, you should output the time the group $i$ can ride the roller coaster.</p>

### 입력 

 <blockquote>
<p>$N$ $M$</p>

<p>$a_1$ $a_2$ $\dots$ $a_N$</p>
</blockquote>

<p>The first line consists of an integer $N$ between $1$ and $100\,000$, and an integer $M$ between $1$ and $10^9$, inclusive. $N$ represents the number of groups, and $M$ represents the capacity of the roller coaster.</p>

<p>The second line consists of $N$ integers between $1$ and $M$, inclusive. For each $i$ ($1 \le i \le N$), $a_i$ represents the number of people in the group $i$.</p>

### 출력 

 <p>Output $N$ lines. In the $i$-th line, you should output the answer for the group $i$.</p>

