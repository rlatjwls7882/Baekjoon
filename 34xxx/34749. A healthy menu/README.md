# [Bronze III] A healthy menu

[문제 링크](https://www.acmicpc.net/problem/34749) 

## 문제 설명

<p>At the Institute of Creative Programming Competitions (ICPC), all students love fruits! Knowing this, management decided to conduct a large survey about food preferences to help in preparing the annual menu. To make the survey more professional, they hired the company <strong>SBC Research Solutions™</strong>, an acronym for “Saladas Bem Científicas”, although some say the name is a tribute to a well-known computer science society...</p>

<p>SBC received the following mission: the school has $M$ classes and offers $N$ different types of fruit. In each class, for each fruit, the number of students who like that fruit was reported.</p>

<p>However, since SBC did not have access to individual student data, nor do they know how many students are in each class, they now need your help! Based only on the survey results (how many students like each fruit in each class), determine the smallest possible number of students the school can have, knowing that the following constraints are satisfied:</p>

<ul>
<li>each class has at least one student;</li>
<li>each student belongs to a single class;</li>
<li>each student likes at least one fruit;</li>
<li>the same student can like several fruits.</li>
</ul>

## 입력 

 <p>The first line of input contains two integers $N$ and $M$ ($1 ≤ N, M ≤ 1000$), the number of fruits and the number of classes, respectively. Each of the following $N$ lines contains $M$ integers $G_{i,j}$, indicating how many students in class $j$ like fruit $i$ ($0 ≤ G_{i,j} ≤ 10^6$ for $1 ≤ i ≤ N$ and $1 ≤ j ≤ M$).</p>

## 출력 

 <p>Your program should print a single line, containing a single integer, the smallest possible number of students in the school, considering the given constraints.</p>

