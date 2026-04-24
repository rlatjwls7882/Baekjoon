# [Diamond II] Potatoes and fertilizers

[문제 링크](https://www.acmicpc.net/problem/27345) 

## 문제 설명

<p>Farmer Gumbauskas is growing potatoes. He planted potatoes in one long furrow and placed bags with fertilisers next to the furrow.</p>

<p>Assume that the furrow consists of $N$ segments of the same length. The segments are numbered from $1$ to $N$ from left to right. In segment $i$ there are $a_i$ fertilisers and were planted $b_i$ potatoes. One fertiliser unit is required to fertilise one planted potato. There is enough fertiliser for all the potatoes, i.e. $a_1 + \cdots + a_N ≥ b_1 + \cdots + b_N$.</p>

<p>However, it costs to transfer fertiliser from one segment to another. To transfer one unit of fertiliser from segment $i$ to segment $j$ costs $|i - j|$.</p>

<p>Find the cheapest way to fertilise all the potatoes.</p>

## 입력 

 <p>The length of the furrow $N$ is given in the first line.</p>

<p>Each of the remaining $N$ lines contain two integers $a_i$ and $b_i$ – the amount of fertiliser unit and the amount of potatoes planted in segment $i$. The segments are given in the increasing order of $i$.</p>

## 출력 

 <p>Output the smallest possible cost of fertilising all the planted potatoes.</p>

