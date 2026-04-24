# [Diamond III] Bookface

[문제 링크](https://www.acmicpc.net/problem/18720) 

## 문제 설명

<p>Taking on an ambitious project? Check. Working tirelessly, day and night, to deliver it before the deadline? Check. Committing your code every day in small chunks? Check. And after all that work, you, the most ambitious software developer at Bookface to date, thought that there was nothing standing between you and your promotion. You couldn’t have been more wrong.</p>

<p>Before sending your promotion package to the management, you decided to ask your coworker Little Franiu to take a look. And one quick look was enough to see the problem. ”At Bookface, you have to move fast” – said Franiu – ”move fast and change things. You can’t be predictable and ship similarly-sized commits every day like that!”.</p>

<p>You looked at the number of lines you added on each of the n days of the project, and realized Franiu had a point. If we denote this count for the i-th day by c<sub>i</sub>, then all the c<sub>i</sub> values turned out to be relatively close to each other. Fortunately, your friend also had an idea how to fix this – you can simply rewrite your commit history to make it look better!</p>

<p>Together with Franiu, you chose a value of d, and decided that you want |c<sub>i</sub> −c<sub>j</sub>| ≥ d to hold for any 1 ≤ i < j ≤ n. To that end, you can select a single day, and either add or remove one line of code in the commit made on that day. You can perform arbitrarily many such operations, and each takes you 1 second. How much time do you need to accomplish your goal? Of course, the number of lines of code in a commit has to always stay non-negative.</p>

## 입력 

 <p>The first line of input contains the number of test cases z (1 ≤ z ≤ 100 000). The descriptions of the test cases follow.</p>

<p>The first line of each test case contains the number of days of the project n (1 ≤ n ≤ 200 000) and the chosen constant d (1 ≤ d ≤ 10<sup>6</sup>). The second line contains n numbers ci (0 ≤ ci ≤ 3 · 1011) – the number of lines of code added on the i-th day.</p>

<p>The total number of days in all test cases does not exceed 10<sup>6</sup>.</p>

## 출력 

 <p>For each test case, output a single line containing a single integer – the number of seconds needed to accomplish your goal.</p>

