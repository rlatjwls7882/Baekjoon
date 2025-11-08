# [Silver III] Knitting Pattern

[문제 링크](https://www.acmicpc.net/problem/32559) 

## 문제 설명

<p>Jörmunrekur had found himself with some extra time on his hands, so he decided to try to find a new hobby. After discussing this with some of his relatives, his grandparents lent him a book with knitting guides and knitting patterns.</p>

<p>He wants to start with something big, so he decides to make a sweater. He has also picked out a pattern from the book that he will repeat around the circumference of the sweater. He wants the pattern to be centered and then repeat out towards the back in either direction, but never wants to have less than the full pattern on the sweater. He will not place any patterns that leaves the placements of patterns asymmetric. Now he has to know how much empty space he should leave at the back of the sweater to achieve this.</p>

<p>The empty space that is not covered by the patterns must be a contiguous (possibly empty) section at the back of the sweater.</p>

## 입력 

 <p>The input contains two positive integers $N$, the length of the sweater, and $P$, the length of the pattern. They satisfy $1 \leq P \leq N \leq 10^{18}$ and they have the same parity, as otherwise the pattern could never be perfectly centered.</p>

## 출력 

 <p>Print a single integer, the amount of empty space left on the back of the sweater.</p>

