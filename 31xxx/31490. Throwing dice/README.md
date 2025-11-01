# [Silver II] Throwing dice

[문제 링크](https://www.acmicpc.net/problem/31490) 

## 문제 설명

<p>Alice and Bob are discussing penalty shoot-outs and their randomness: “We might as well be throwing dice to determine the winner!”, Alice said. And so they started simulating penalty shoot-outs by each throwing dice, summing the points indicated on their dice, and comparing these sums. The player with the largest sum wins; in case both sums are equal, there is a tie.</p>

<p>But even in such situations, some player might have an edge over their opponent, depending on which dice they throw. Thus, just by looking at the dice they are about to throw, Alice and Bob want to determine who has the better edge.</p>

<p>Alice has $M$ fair dice, with $A_1, A_2, \dots , A_M$ sides. For all integers $k$ and $\ell$ such that $1 \le k \le M$ and $1 \le \ell \le A_k$, the $k$<sup>th</sup> die of Alice has a probability $1/A_k$ of showing its face numbered $\ell$. Then, Alice’s score is the sum of the numbers displayed by her $M$ dice. Similarly, Bob has $N$ fair dice, with $B_1, B_2, \dots , B_N$ sides.</p>

<p>Given these dice, Alice has a probability $\mathbb{P}_A$ of having a strictly larger score than Bob, and Bob has a probability $\mathbb{P}_B$ of having a strictly larger score than Alice. Which probability is the largest one?</p>

## 입력 

 <p>The input consists of three lines, each one containing space-separated integers. The first line contains the numbers $M$ and $N$. The second line contains the numbers $A_1, A_2, \dots , A_M$. The third line contains the numbers $B_1, B_2, \dots , B_N$.</p>

## 출력 

 <p>The output should contain a single line, consisting of a single uppercase word: <code>ALICE</code> if $\mathbb{P}_A > \mathbb{P}_B$, <code>TIED</code> if $\mathbb{P}_A = \mathbb{P}_B$, and <code>BOB</code> if $\mathbb{P}_A < \mathbb{P}_B$.</p>

