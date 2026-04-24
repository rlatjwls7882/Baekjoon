# [Diamond I] Elevated Profits

[문제 링크](https://www.acmicpc.net/problem/30480) 

## 문제 설명

<p>Marina, a digital influencer who loves traveling the world, is embarking on a promotional tour for a women’s clothing brand called W<sup>2</sup>M (From Woman to Woman Marina). Marina’s journey takes her through $N$ cities in Latin America, each with its unique charm, and identified with a distinct integer from $1$ to $N$, called its popularity index.</p>

<p>To facilitate Marina’s travels, W<sup>2</sup>M has provided her with $N - 1$ transfers, connecting pairs of cities in a way that guarantees accessibility to all $N$ cities. Marina can traverse these connections as many times as she pleases.</p>

<p>Marina’s mission is to showcase the brand’s dresses in each of the $N$ cities, with a twist. Each time she visits a city for the first time, she must select a dress she hasn’t worn before and capture the city’s essence in a social media post. Every new picture she shares attracts followers, creating anticipation for the next one. The anticipation value for her first picture is $1$, and it increments by $1$ for each subsequent picture.</p>

<p>Marina can revisit any city as often as desired, but a new picture must only be posted on her initial visit to a city. Her goal is to maximize the profit of her tour, which is computed as the sum of the anticipation value of each picture multiplied by the popularity index of the city where the picture is taken. More precisely, let $p_i$ be the popularity index of the city where the $i$-th picture is taken. With this information, the profit can be calculated as</p>

<p>$$\sum_{i=1}^{N}{i \times p_i} = 1 \times _1 + 2 \times p_2 + \cdots + N \times p_N$$</p>

<p>Now, Marina seeks your assistance. Given that the tour has to start in city $p_1 = R$, your task is to help Marina determine the maximum profit she can achieve by strategically planning the order of her city visits.</p>

## 입력 

 <p>The first line contains two integers $N$ ($1 ≤ N ≤ 3 \times 10^5$) and $R$ ($1 ≤ R ≤ N$), indicating respectively the number of cities and the initial city of the tour.</p>

<p>Each of the next $N - 1$ lines contains two integers $U$ and $V$ ($1 ≤ U, V ≤ N$ and $U \ne V$), indicating that there is a transfer between cities $U$ and $V$. It is guaranteed that it is possible to reach every city by using the transfers.</p>

## 출력 

 <p>Output a single line with an integer indicating the maximum profit Marina can achieve on her promotional tour.</p>

