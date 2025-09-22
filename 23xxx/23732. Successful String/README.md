# [Gold IV] Successful String

[문제 링크](https://www.acmicpc.net/problem/23732) 

## 문제 설명

<p>Yunee is studying English vocabulary. Among many words that Yunee has learned, "success" is Yunee's favorite word and "failure" is Yunee's least favorite word.</p>

<p>Yunee noticed that two identical characters appear in a row in the word "success" but not in the word "failure." So Yunee decided to call a string "successful string" when it has a property of the word "success." Formally, a string $S$ is a successful string when there is a position $i$ such that $S_i = S_{i+1}$. Here $S_i$ denotes the $i$-th character of $S$.</p>

<p>Yunee wants to count how many successful strings there are among the substrings of a given string. Help Yunee write a program that counts the number of successful substrings. <strong>You have to consider two substrings distinct when their positions are different, even if the two strings are the same.</strong></p>

## 입력 

 <p>The first line contains an integer $N$ that represents the length of a string. $(1 \leq N \leq 10^6)$</p>

<p>The second line contains a string of length $N$ consisting of lowercase alphabets.</p>

## 출력 

 <p>Output the number of successful strings among the substrings of the given string.</p>

