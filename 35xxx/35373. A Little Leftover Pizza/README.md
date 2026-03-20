# [Bronze III] A Little Leftover Pizza

[문제 링크](https://www.acmicpc.net/problem/35373) 

## 문제 설명

<p>The CS department has just had a big party and ordered too much pizza. Now it is time to put away the leftovers.  They ordered a number of small, medium, and large pizzas, and there are still slices remaining in some or all of the pizza boxes.  A small pizza comes in 6 slices, a medium pizza in 8 slices, and a large pizza in 12 slices.  To save space, you can combine the leftover slices from the same size pizzas into a box of the right size, but you can't put a slice into a box for a different sized pizza, and you can't put more slices into a box than it originally held. What is the smallest number of boxes you will need to hold all the leftovers?</p>

## 입력 

 <p>The first line of input contains one positive integer $n$ ($n < 1000$), the number of pizzas that were ordered.  Each of the following $n$ lines contains two items $s_i$ and $l_i$ (separated by a space) representing the leftovers for a given pizza.  $s_i$ is a string <code>S</code>, <code>M</code>, or <code>L</code> representing the size of pizza $i$, and $l_i$ is an integer representing the number of leftover slices for pizza $i$. You can assume that each $l_i$ is between zero and the original number of slices of that size pizza, inclusive.</p>

## 출력 

 <p>Output a single number, the fewest possible total boxes that can hold the leftover pizza according to the constraints given above.</p>

