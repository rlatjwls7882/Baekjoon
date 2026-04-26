# [Diamond IV] Candies

[문제 링크](https://www.acmicpc.net/problem/17689) 

## 문제 설명

<p>There are N candies in a row on the table. Each candy has a value called deliciousness. The deliciousness of the candy which is located i-th from the left is A<sub>i</sub> (1 ≤ i ≤ N).</p>

<p>JOI-chan decided to eat some of these N candies. JOI-chan wants to maximize the sum of deliciousness of candies which she is going to eat.</p>

<p>However, JOI-chan thinks that just choosing candies greedily is not interesting, so she makes a rule that she cannot choose two consecutive candies simultaneously.</p>

<p>JOI-chan has not decided how many candies she eats, so JOI-chan wants to know, for each j (1 ≤ j ≤ ⌈N/2⌉), the maximum sum of deliciousness of candies when she eats j candies. Here ⌈x⌉ is the smallest integer larger than or equal to x.</p>

<p>Given the number of candies and the deliciousness of candies, write a program which calculates, for each j (1 ≤ j ≤ ⌈N/2⌉), the maximum sum of deliciousness of candies when she eats j candies.</p>

## 입력 

 <p>Read the following data from the standard input.</p>

<ul>
	<li>The first line of input contains an integer N. This means there are N candies on the table.</li>
	<li>The i-th line (1 ≤ i ≤ N) of the following N lines contains an integer A<sub>i</sub>. This means the deliciousness of the candy which is located i-th from the left is A<sub>i</sub>.</li>
</ul>

## 출력 

 <p>Write ⌈N/2⌉ lines to the standard output. The j-th line (1 ≤ j ≤ ⌈N/2⌉) of output contains the maximum sum of deliciousness of candies when she eats j candies.</p>

