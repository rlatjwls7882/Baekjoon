# [Diamond II] Farm Village

[문제 링크](https://www.acmicpc.net/problem/15527) 

## 문제 설명

<p>There is a village along a road. This village has <em>N</em> houses numbered 1 to <em>N</em> in order along the road. Each house has a field that can make up to two units of the crop and needs just one unit of the crop. The total cost to distribute one unit of the crop to each house is the summation of carrying costs and growing costs.</p>

<ul>
	<li>The carrying cost: The cost to carry one unit of the crop between the <em>i</em>-th house and the (<em>i</em>+1)-th house is <em>d<sub>i</sub></em>. It takes the same cost in either direction to carry.</li>
	<li>The growing cost: The cost to grow one unit of the crop in the <em>i</em>-th house's field is <em>g<sub>i</sub></em>.</li>
</ul>

<p>Your task is to calculate the minimum total cost to supply one unit of the crop to each house.</p>

## 입력 

 <p>The input consists of a single test case formatted as follows.</p>

<pre>N
d<sub>1</sub> … d<sub>N−1</sub>
g<sub>1</sub> … g<sub>N</sub></pre>

<p>The first line consists of an integer <em>N</em> (2 ≤ <em>N</em> ≤ 200,000), which is the number of the houses. The second line consists of <em>N</em> − 1 integers separated by spaces. The <em>i</em>-th integer <em>d<sub>i</sub></em> (1 ≤ <em>d<sub>i</sub></em> ≤ 10<sup>9</sup>, 1 ≤ <em>i</em> ≤ <em>N</em> − 1) represents the carrying cost between the <em>i</em>-th and the (<em>i</em>+1)-th houses. The third line consists of <em>N</em> integers separated by spaces. The <em>i</em>-th integer <em>g<sub>i</sub></em> (1 ≤ <em>g<sub>i</sub></em> ≤ 10<sup>9</sup>, 1 ≤ <em>i</em> ≤ <em>N</em>) represents the growing cost of the <em>i</em>-th house's field.</p>

## 출력 

 <p>Print the minimum cost to supply one unit of the crop to each house.</p>

