# [Platinum IV] Bookshelf

[문제 링크](https://www.acmicpc.net/problem/34863) 

## 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/1c13b64b-5320-4642-8fb6-5936830f061f/-/preview/" style="width: 246px; height: 193px; float: right;">A bookshelf of length $L$ holds $n$ books, $B_1, \cdots , B_n$, arranged from left to right. Each book $B_i$ has a width (thickness) of $w_i$. The heights of the bookshelf and the books are the same. Position $x$ on the shelf corresponds to a point located $x$ units far from the left end. If a book $B_i$ is placed at position $x$, it occupies the interval $[x, x + w_i)$ on the shelf. Then the intervals of the books on the shelf are pairwise disjoint. The left end of the shelf is at position $0$, the right end is at position $L$, and the shelf as a whole occupies the interval $[0, L)$.</p>

<p>Rearranging the books currently on the shelf, you may perform the following operation any number of times:</p>

<ul>
<li>Choose one book $B_i$i on the shelf and take it out, which creates a contiguous empty interval where it was.</li>
<li>Then insert $B_i$ into any existing empty interval on the shelf whose length is at least $w_i$.</li>
</ul>

<p>During this operation, all other books that remain on the shelf stay fixed—cannot slide, move, or be nudged in any way. This is because the books and the shelf have the same height and fit tightly together, so no book can move unless it is explicitly taken out. Also, you are not allowed to push or shift any other books to make room during the operation.</p>

<p>The owner has a favorite book $B_k$ among $n$ books on the shelf and wishes to place it at a specific position $p$.</p>

<p>Given the initial positions of the books on the shelf, the favorite book $B_k$, and its target position $p$, determine whether it is possible to place $B_k$ at position $p$ after performing any number of the above operations—possibly zero.</p>

## 입력 

 <p>Your program is to read from standard input. The input starts with a line containing two integers $n$ and $L$ ($1 ≤ n ≤ 100\,000$; $1 ≤ L ≤ 10^9$), where $n$ is the number of books and $L$ is the length of shelf. The second line contains $n$ distinct integers between $0$ and $L − 1$ (inclusive), representing the positions of books $B_1, \cdots , B_n$ initially arranged on the shelf in ascending order. The third line contains $n$ positive integers, where the $i$-th integer ($1 ≤ i ≤ n$) is the width $w_i$ of the $i$-th book $B_i$ in the initial arrangement. The next line contains two integers $k$ and $p$ ($1 ≤ k ≤ n$; $0 ≤ p ≤ L − 1$), where the $k$-th book $B_k$ in the initial arrangement is the favorite one and its target position is $p$.</p>

## 출력 

 <p>Your program is to write to standard output. Print exactly one line. Print “<code>YES</code>” if it is possible to place the favorite book at the target position, and print “<code>NO</code>” otherwise.</p>

