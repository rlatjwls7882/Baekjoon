# [Platinum II] Supporting everyone

[문제 링크](https://www.acmicpc.net/problem/31483) 

## 문제 설명

<p>Alice is attending a sport event with many national teams and one thing is important to her: supporting every country.</p>

<p>There are $N$ countries represented and she has two ways to support a country: either have the flag drawn on her or have a pin with the name of the country. Alice has a list containing, for each country, the colours needed to make its flag. A total of $M$ colours that may appear across all flags and, in Alice’s list, each colour is conveniently represented as an integer between $1$ and $M$.</p>

<p>Each crayon and pin cost $1$, but her budget is tight. . . Can you help her find the minimum she can spend to support everyone?</p>

## 입력 

 <p>The first line contains the two space-separated numbers $N$ and $M$. Then follow $2N$ lines, grouped in pairs; the $(2i - 1)$<sup>th</sup> and $2i$<sup>th</sup> lines represent the $i$<sup>th</sup> country. More precisely, the $(2i - 1)$<sup>th</sup> line contains a single integer $k_i$: the number of colours in the flag of the $i$<sup>th</sup> country. Then, the $2i$<sup>th</sup> line contains $k_i$ space-separated numbers $c_{i,1}, c_{i,2}, \dots , c_{i,k_i}$; these are the colours in the flag of the $i$<sup>th</sup> country.</p>

## 출력 

 <p>The output should contain a single line, consisting of a single number: the minimum amount Alice can spend on crayons and pins to represent every country.</p>

