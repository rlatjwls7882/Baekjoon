# [Diamond V] Seating

[문제 링크](https://www.acmicpc.net/problem/5853) 

## 문제 설명

<p>To earn some extra money, the cows have opened a restaurant in their barn specializing in milkshakes.  The restaurant has N seats (1 <= N <= 500,000) in a row. Initially, they are all empty.</p><p>Throughout the day, there are M different events that happen in sequence at the restaurant (1 <= M <= 300,000).  The two types of events that can happen are:</p><p>1. A party of size p arrives (1 <= p <= N). Bessie wants to seat the party in a contiguous block of p empty seats. If this is possible, she does so in the lowest position possible in the list of seats.  If it is impossible, the party is turned away.</p><p>2. A range [a,b] is given (1 <= a <= b <= N), and everybody in that range of seats leaves.</p><p>Please help Bessie count the total number of parties that are turned away over the course of the day.</p>

## 입력 

 <ul><li>Line 1: Two space-separated integers, N and M.</li><li>Lines 2..M+1: Each line describes a single event.  It is either a line of the form "A p" (meaning a party of size p arrives) or "L a b" (meaning that all cows in the range [a, b] leave).</li></ul>

## 출력 

 <ul><li>Line 1: The number of parties that are turned away.</li></ul>

