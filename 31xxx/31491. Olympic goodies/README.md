# [Gold I] Olympic goodies

[문제 링크](https://www.acmicpc.net/problem/31491) 

## 문제 설명

<p>Freshly arrived on the market, retailer YAOGS (Yet Another Olympic Goodies Seller) sells very expensive Olympics-themed items. To make themselves better known to the public, they halfheartedly decide to give away some of these items via a contest: the first person to answer correctly the question “How many circles are there in the Olympic Games logo?” can thus gain up to P very expensive but equally valued items.</p>

<p>To spice things up (and spend less), YAOGS however opts for an additional challenge, as follows. The $P$ available items are positioned along some, but possibly not all of the alleys of YAOGS’s headquarters; each alley can thus contain $0$, $1$, or more items. For reasons unknown, these alleys form a connected, undirected, acyclic graph (i.e., a tree) with $N$ nodes, numbered from $0$ to $N - 1$.</p>

<p>The winner knows $N$ but has no idea about either the tree structure or the items’ placement. Once goodies are placed, her task is to choose a start node $m$ and an end node $n$. She can then collect all the items on the (unique) path from $m$ to $n$ in the tree.</p>

<p>YAOGS decides to cleverly place the goodies so that they minimise the maximum number of items that can possibly be collected. Assuming they properly carry out this task, what is the maximum number of items the winner can collect?</p>

## 입력 

 <p>Each line contains two space-separated integers. The fist line contains the numbers $N$ and $P$. Then follow $N - 1$ lines; the $k$<sup>th</sup> such line contains two integers $a_k$ and $b_k$, meaning that there is an edge between the nodes $a_k$ and $b_k$ of the tree.</p>

## 출력 

 <p>The output should contain a single line, consisting of a single integer: the maximum number of items that can be collected by the winner.</p>

