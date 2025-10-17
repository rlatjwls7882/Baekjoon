# [Platinum III] Hash Collision

[문제 링크](https://www.acmicpc.net/problem/32896) 

## 문제 설명

<p>For security reasons, TU Delft is going to place locks with numeric keypads on the doors of a large number of rooms. Each room will have its own pass code. The task of setting up the server on which all codes will be stored is given to Harry and Sharon.</p>

<p>Having paid attention in cybersecurity class, they know that the codes should be passed through a <em>hash function</em>, preferably multiple times, before storing.</p>

<p>Sharon came up with the nifty idea of letting the room number be the number of times the code is passed through the hash function. That way, even if two rooms happen to have the same pass code, they will not (necessarily) end up with the same hash value. However, they find that for some combinations of room number and code, the hash value happens to be the same as the original code, presenting a security risk.</p>

<p>Not to be outdone by Sharon, Harry came up with an idea of his own: to switch the roles, that is, let the code be the number of times the hash function is applied to the room number. In other words, if $c$ is the code and $r$ is the room number, the hash value will be $f^c(r) = \underbrace{f(\cdots f(}_{c \mathrm{times}}r)\cdots)$.</p>

<p>After some thought, Sharon claimed that, regardless of what the function $f$ is, it would always still be the case for some room numbers and codes that the hash value is the same as the code; that is, that $f^c(r) = c$. In fact, Sharon thinks it would not be too difficult to find two such numbers, even without knowing the full details of $f$.</p>

<p>This dismissive statement made Harry angry, who believed that Sharon was just jealous of his idea. After a big argument that led nowhere, Harry decided to make Sharon prove her claim: he has written a program that, upon sending it a query, will return the hash value $f^c(r)$ for the $c$ and $r$ given in the query, using a secret hash function $f$ he has chosen. The hash function accepts any $r$ in $\{1,\dots,n\}$, where $n$ is given, and returns a value in the same range. The value of $c$ should also be in the same range. The challenge for Sharon is to find $c$ and $r$ such that $f^c(r) = c$, using a limited number of queries.</p>

<p>You know that Sharon is right about her claim and decide to help her.</p>

<p>In the first sample case, the value of $n$ is 6, and the hidden function is given by $f(1) = 4$, $f(2) = 3$, $f(3) = 5$, $f(4) = 2$, $f(5) = 4$, and $f(6) = 6$. In the second sample, $n = 4$, and $f(1) = 2$, $f(2) = 4$, $f(3) = 2$, and $f(4) = 2$.</p>

## 입력 

 Empty

## 출력 

 Empty

