# [Diamond IV] Hamilton - The Musical

[문제 링크](https://www.acmicpc.net/problem/24990) 

## 문제 설명

<p>Nlogonia is well known for its robust road infrastructure. The country has $N$ cities numbered from $1$ to $N$, and for each pair of distinct cities $i$ and $j$, there is a two-way road between them with length $L_{i,j}$.</p>

<p>The citizens of Nlogonia are very excited because the musical Hamilton has arrived in the country for the first time. The organization of Hamilton wants to let every citizen have an opportunity to watch the musical, so they want to choose a path that visits each city exactly $P$ once. Such a path is a permutation $P_1, P_2, \dots , P_N$ of the $N$ cities, and its total length is $\sum_{i=1}^{N-1}{L_{P_i,P_{i+1}}}$.</p>

<p>The organization fears that if they let the actors choose the path, they will have to spend a lot of money on fuel. But they also fear that if they don’t let the actors choose anything, the actors will become demotivated and might have a bad performance on stage. So the organization allowed the actors to choose the cities in the even positions of the path, that is, the actors can choose the cities $P_2, P_4, \dots , P_{\lfloor N/2 \rfloor }$.</p>

<p>After much deliberations, the actors made their choice. Contrary to what one would expect from such a creative bunch, they agreed on a somewhat boring outcome and decided that even positions should be occupied by cities with the same identifier as their indices, that is, $P_i = i$ for even $i$.</p>

<p>Now the organization needs your help. Can you determine the minimum total length of a path satisfying the actors’ decision?</p>

## 입력 

 <p>The first line contains an integer $N$ ($2 ≤ N ≤ 500$) indicating the number of cities in Nlogonia. The next $N$ lines contain $N$ integers each, representing the lengths of the roads between cities. The $j$-th integer on the $i$-th of these lines is $L_{i,j}$ ($1 ≤ L_{i,j} = L_{j,i} ≤ 10^9$ for $i = 1, 2, \dots , N$, $j = 1, 2, \dots , N$ and $i \ne j$), denoting the length of the two-way road between cities $i$ and $j$. If $i = j$ then $L_{i,j} = 0$, since there is no actual road from a city to itself.</p>

## 출력 

 <p>Output a single line with an integer representing the minimum total length of a path that visits each city exactly once satisfying the actors’ decision.</p>

