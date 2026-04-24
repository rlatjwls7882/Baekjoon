# [Diamond III] Ascending Tree

[문제 링크](https://www.acmicpc.net/problem/19381) 

## 문제 설명

<p>You are given a rooted tree. Each vertex of the tree is labeled with an integer. If you pay one dollar, you can change (increment or decrement) the label of a vertex by one.</p>

<p>You want to change the labels such that, for each vertex, its label is <strong>strictly greater</strong> than any of the labels assigned to its children. Compute the minimum cost required to satisfy this condition.</p>

## 입력 

 <p>The first line contains two integers: $N$, the number of vertices in the tree, and $C_1$, the label assigned to the root. The vertices are numbered $1$ through $N$, and the root is vertex $1$ ($1 \le N \le 10^5$).</p>

<p>The next $N - 1$ line describe non-root vertices. The $i$-th line contains two integers: $P_i$, the number of the parent of the vertex $i$, and $C_i$, the label assigned to the vertex $i$ ($1 \le P_i < i$, $-10^9 \le c_i \le 10^9$).</p>

## 출력 

 <p>Print the minimum cost on a single line.</p>

