# [Silver II] Intensive Training

[문제 링크](https://www.acmicpc.net/problem/33111) 

## 문제 설명

<p>To prepare for the upcoming ICPC Regional Contest, you decided to train intensively for the next $N$ days (numbered from $1$ to $N$). During the intensive training, you want to solve problems from the infamous training platform INCOJ. In INCOJ, each problem has a difficulty rating represented by a non-negative integer. For each rating, there are $10^{100}$ problems that you can pick to solve.</p>

<p>You want to plan a schedule for your intensive training. For day $i$, you plan to solve exactly $k_i$ problems each with difficulty rating $r_i$, such that $k_i$ and $r_i$ are <strong>non-negative</strong> integers. In a single day, it is possible that you solve $0$ problems with non-zero rating, it means you are not in the mood to solve any problems on that day. Also it is possible to solve multiple problems with difficulty $0$, the problem is too easy for you.</p>

<p>The following is the constraint that you made.</p>

<ul>
	<li>To focus on quality over quantity, for each day, the number of problems should not be more than the previous day, and the difficulty rating should not be less than the previous day. Formally, $k_{i-1} ≥ k_i$ and $r_{i-1} ≤ r_i$ for $2 ≤ i ≤ N$.</li>
	<li>To avoid burning out, the total number of problems that you solve must be exactly $K$, and the sum of difficulty ratings across all days must be exactly $R$. Formally, $k_1 + k_2 + \cdots + k_N = K$ and $r_1 + r_2 + \cdots + r_N = R$.</li>
</ul>

<p>You define the productivity for a day as the product of the number of problems that you solve in that day and their difficulty rating. You want to maximize the total productivity across all $N$ days.</p>

## 입력 

 <p>This problem is a multi-case problem. The first line consists of an integer $T$ ($1 ≤ T ≤ 100$) which represents the number of test cases.</p>

<p>Each test case consists of three integers $N$ $R$ $K$ ($1 ≤ N, R, K ≤ 10^9$) in a single line.</p>

## 출력 

 <p>For each test case, output a single integer in a single line representing the maximum total productivity.</p>

