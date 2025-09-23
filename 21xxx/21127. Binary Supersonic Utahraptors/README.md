# [Silver II] Binary Supersonic Utahraptors

[문제 링크](https://www.acmicpc.net/problem/21127) 

## 문제 설명

<p>Alexey and Boris are playing a game called <em>Binary Supersonic Utahraptors</em> (BSU). </p>

<p>Initially, Alexey has $n$ utahraptors, and Boris has $m$ utahraptors. Each utahraptor is either yellow or red.</p>

<p>Then, the players take $k$ turns described by integers $s_1, s_2, \ldots, s_k$. The $i$-th turn is performed as follows. First, Alexey chooses $s_i$ utahraptors that belong to him and gives them to Boris. Then, Boris chooses $s_i$ utahraptors that belong to him (the utahraptors that Alexey has just given to him may also be chosen) and gives them to Alexey.</p>

<p>When the $k$ moves are done, the score of the game is calculated. The score is equal to $|a_y - b_r|$, where $a_y$ is the number of yellow utahraptors Alexey has, and $b_r$ is the number of red utahraptors Boris has. Alexey's goal is to minimize the score, and Boris wants to maximize it.</p>

<p>Write a program that calculates the score of the game if both players use their optimal strategies.</p>

## 입력 

 <p>The first line contains three integers $n$, $m$, $k$, the number of utahraptors obtained by Alexey, the number of utahraptors obtained by Boris, and the number of turns in the game ($1 \le n, m, k \le 3 \cdot 10^5$).</p>

<p>The second line contains $n$ integers $a_i$, denoting Alexey's utahraptors ($0 \le a_i \le 1$). If $a_i = 0$, then the $i$-th utahraptor is yellow, otherwise the $i$-th utahraptor is red.</p>

<p>The third line contains $m$ integers $b_i$, denoting Boris's utahraptors in the same manner as described above ($0 \le b_i \le 1$).</p>

<p>The fourth line contains $k$ integers $s_i$, describing the numbers of utahraptors that players give to each other on the $i$-th turn ($1 \le s_i \le \min\{n, m\}$).</p>

## 출력 

 <p>Print the score of the game if both players play optimally.</p>

