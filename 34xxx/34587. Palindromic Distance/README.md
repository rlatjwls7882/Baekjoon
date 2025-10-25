# [Gold III] Palindromic Distance

[문제 링크](https://www.acmicpc.net/problem/34587) 

## 문제 설명

<p>The edit distance between two strings $u$ and $v$ is the minimum number of edit operations that turns $u$ into $v$. There are three edit operations that can be applied to a string: Insert a character, delete a character, and substitute some character by a different one.</p>

<p>For example, we can turn <code>hello</code> into <code>world</code> with four substitutions, so the edit distance is at most $4$. You can turn <code>wally</code> into <code>walter</code> with two substitutions and one insertion, so the edit distance is at most $3$. Computing the edit distance between two strings is a well-known problem with many applications.</p>

<p>The task at hand is to compute the edit distance of a string to <strong>one of the closest</strong> palindromes. A palindrome is a string that is the same when read backwards, for example madam.</p>

<p>The edit distance of <code>hello</code> to the closest palindrome is only $2$: We can turn <code>hello</code> into <code>ollo</code>, or <code>hllh</code>, or <code>elle</code> with two edit operations.</p>

<p>Write a program that can find the distance of a word to a closest palindrome.</p>

## 입력 

 <p>Each test contains multiple test cases. The first line contains the number of test cases $t$. The description of the test cases follows.</p>

<p>The only line of each test case contains a word $w$ consisting only of lowercase letters.</p>

## 출력 

 <p>For each test case, output the edit distance of the input word $w$ to its closest palindrome.</p>

