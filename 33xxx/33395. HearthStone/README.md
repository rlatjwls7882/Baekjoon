# [Diamond III] HearthStone

[문제 링크](https://www.acmicpc.net/problem/33395) 

## 문제 설명

<p>Alice loves playing HearthStone! She loves the hero class of Warlock, who can cast the spell named Defile.</p>

<p>When cast, Defile deals $1$ unit of damage to the health of all minions. If any minion dies, Defile will be cast again automatically. Importantly, if two or more minions die simultaneously, it still causes a single Defile cast. That, in turn, may kill other minions, causing Defile to be cast again, and so on.</p>

<p>The health of each minion is a nonnegative integer. A minion dies when their health becomes zero. If a minion dies, it will disappear. It will not die twice.</p>

<p>Now there are $n$ minions. Before casting Defile, Alice can make zero or more steps. In each step, Alice changes a single minion's health by one. That is to say, if the health of a minion is $x$, Alice can change it to $x-1$ or $x+1$.</p>

<p>Alice wants to know the minimum number of steps such that, after these steps, she can cast a single Defile to kill all the minions.</p>

## 입력 

 <p>The first line contains a single integer $n$ ($1 \leq n \leq 10^6$).</p>

<p>The next line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($1 \leq a_i \leq 10^6$), the health of the $n$ minions.</p>

## 출력 

 <p>Print one integer: the minimum number of steps before Alice can cast a single Defile to kill all the minions.</p>

