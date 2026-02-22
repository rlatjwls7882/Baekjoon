# [Bronze III] Jacobi Numbers

[문제 링크](https://www.acmicpc.net/problem/35213) 

## 문제 설명

<p>Today, a new paper has been published in the <em>Bulletin of Apocryphal Pioneers in Computation</em>. According to this paper, the forgotten German number theorist Wahnfried Imaginus Jacobi (1806--1853), while still a secondary student in Potsdam, investigated the decomposition of integers into sums of cubes. Among the examples noted in the surviving fragments of his notebooks are \[ 2025 = 1^3 + 2^3 + 3^3 + 4^3 + 5^3 + 6^3 + 7^3 + 8^3 + 9^3 \] and the more curious expression \[ 3 = 1^3 + 1^3 + 1^3 = 4^3 + 4^3 + (-5)^3\,,\] which shows that a solution need not be unique. Jacobi restricted his attention to small integers and probably did not know the decomposition \[ 3 = 569\,936\,821\,221\,962\,380\,720^3 + (-569\,936\,821\,113\,563\,493\,509)^3 + (-472\,715\,493\,453\,327\,032)^3 \,,\] which was discovered only recently.<sup>1</sup> However, Jacobi did manage to prove that a decomposition into cubes always exists for all positive integers up to $9241$, the $28$th cuban prime of the first kind. Although his work was never published, references to the method appear in a marginal annotation in an 1823 letter to his famous brother Carl Gustav Jacob.</p>

<p>Given a positive integer $n$, output a list of at most $10\,000$ integers between $-10\,000$ and $10\,000$ such that the sum of their cubes equals $n$.</p>

<hr>
<p><sup>1</sup>Booker, Andrew R.; Sutherland, Andrew V. (2021), "On a question of Mordell", <em>Proceedings of the National Academy of Sciences</em>, <strong>118</strong> (11)</p>

## 입력 

 <p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($1\leq n\leq 9241$), the number to decompose into cubes.</li>
</ul>

## 출력 

 <p>Output an integer $k$ ($1 \leq k \leq 10\,000$), the number of terms in your solution, followed by $k$ integers $a_1,\ldots, a_k$ ($-10\,000\leq a_i\leq10\,000$ for each $i$), such that $a_1^3 + \dots + a_k^3 = n$.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>

