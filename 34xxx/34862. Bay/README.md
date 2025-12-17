# [Platinum V] Bay

[문제 링크](https://www.acmicpc.net/problem/34862) 

## 문제 설명

<p>We have a grid (lattice) graph $G(n, n)$, where $n$ is the number of vertices along both the $x$-axis and the $y$-axis, that is, the number of rows and columns. The vertices of the graph $G(n, n)$ are numbered consecutively from $1$ to $n^2$ in row-major ordering; starting from the top-left vertex, we traverse row by row from top to bottom, and within each row from left to right. Figure 1 shows two examples, $G(5, 5)$ and $G(7, 7)$ with vertex numbers.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1d3ce205-7495-4a83-b4a9-29738c967479/-/preview/" style="width: 429px; height: 205px;"></p>

<p style="text-align: center;"><strong>Figure 1</strong>. Left: Grid graph $G(5,5)$. Right: $G(7,7)$.</p>

<p>We are given a spanning tree $T$ of $G(n, n)$. The left in Figure 2 shows a spanning tree $T$ of $G(7, 7)$. If we add an edge of $G(n, n)$ that does not belong to $T$ (called <em>non-tree edge</em>), then exactly one simple cycle is created. We define the region enclosed by this cycle as a <em>bay</em>. There is a one-to-one correspondence between non-tree edges and bays, that is, each non-tree edge corresponds to exactly one bay. The area of a bay is defined by number of $1 \times 1$ unit cells enclosed by the cycle. The right in Figure 2 shows two bays(colored blue and orange) created by adding two non-tree edges $(u, v)$ and $(p, q)$, respectively. Note that the areas of two bays created by $(u, v)$ and $(p, q)$ are $4$ and $12$, respectively.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/73800e74-56f0-43af-a754-eaf22f6fde28/-/preview/" style="width: 481px; height: 224px;"></p>

<p style="text-align: center;"><strong>Figure 2</strong>. A spanning tree $T$ of a grid $G(7, 7)$ and two bays created by $(u, v)$ and $(p, q)$.</p>

<p>Given a spanning tree $T$ of a grid graph $G(n, n)$ and a positive integer $S$, write a program that finds all non-tree edges that creates bays of area $S$ and outputs the first non-tree edge among them in lexicographical order.</p>

## 입력 

 <p>Your program is to read from standard input. The input starts with a line containing two integers $n$ and $S$ where $5 ≤ n ≤ 300$ for $G(n, n)$ and $1 ≤ S ≤ (n − 1)^2$. Each of the following $n^2 − 1$ lines contains two distinct integers $u$ and $v$ representing an edge $(u, v)$ of a spanning tree $T$, where $1 ≤ u < v ≤ n^2$.</p>

## 출력 

 <p>Your program is to write to standard output. The first line should contain the number of non-tree edges that create the bays of area $S$. The second line should contain two distinct integers $u$ and $v$ ($u < v$) representing the first non-tree edge $(u, v)$ in lexicographical order among those that create the bays of area $S$. The lexicographical order of two edges $(a, b)$ and $(c, d)$ is defined such that $(a, b)$ comes before $(c, d)$ if and only if $a < c$ or, if $a = c$ then $b < d$. If there is no non-tree edge that creates the bay of area $S$, then print “<code>0</code>” in the first line and two zeros “<code>0 0</code>” in the second line.</p>

<p>Figure 3 shows two spanning trees of a grid graph with $n = 5$, which are the sample inputs and outputs.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/042edc4f-4f77-4a6d-b23e-a2e15b8d96c6/-/preview/" style="width: 363px; height: 145px;"></p>

<p style="text-align: center;"><strong>Figure 3</strong>. Two spanning trees of $G(5, 5)$ for Sample Input 1 and 2.</p>

