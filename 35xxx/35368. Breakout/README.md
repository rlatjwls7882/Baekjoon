# [Bronze III] Breakout

[문제 링크](https://www.acmicpc.net/problem/35368) 

## 문제 설명

<p>Uh oh! After you gave a low rating to one of Merlin’s riddles, he has taken revenge by locking you inside his magical dungeon! This dungeon can be modeled as a circle with $n$ rooms arranged along its circumference. The rooms are labeled from $1$ to $n$ in clockwise order.</p>

<p>You start at room $1$ and know that there exists an exit in one of the rooms. To get to the exit room, you can walk either clockwise or counterclockwise to a neighboring room. However, Merlin is smart. To impede your escape, Merlin has placed wooden crates in several hallways connecting two adjacent rooms. To pass through a hallway, you must break any wooden crates blocking it.</p>

<p>You want to make it out to the exit room as quickly as possible. What is the minimum number of crates you must break through to escape?</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0ffd6c10-123d-474a-8885-556a7c8ef95b/-/preview/" style="width: 200px; height: 200px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: Illustration of the sample case.</p>

## 입력 

 <p>The first line of input contains three integers $n$, $x$, and $m$ ($2 \le n \le 1\, 000$, $1 \le x \le n$, $0 \le m \le 1\, 000$), meaning that there are $n$ rooms with room $x$ being the exit room, and there are $m$ crates.</p>

<p>Each of the next $m$ lines contains a single integer $r$ ($1 \le r \le n$), indicating that there is a crate in the hallway clockwise between room $r$ and the next room along the circumference. If $r = n$, it means that the crate is in the hallway between room $n$ and room $1$. These integers may contain duplicates, meaning that multiple crates are placed in the same hallway.</p>

## 출력 

 <p>Output a single integer, the minimum number of crates you must destroy to breakout.</p>

