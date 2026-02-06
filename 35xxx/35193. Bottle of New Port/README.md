# [Bronze II] Bottle of New Port

[문제 링크](https://www.acmicpc.net/problem/35193) 

## 문제 설명

<p>At the Bottles and Port Company, you produce and bottle only the finest of vintages. To satisfy the desires of your highly exclusive clientele, it is necessary to study what happens to your wines once a new bottle is opened. When that happens, liquids in the bottle immediately start evaporating. The alcohol in the bottle evaporates at a different rate than the other liquids in the bottle, meaning that over time, the delicate balance of the port wine will be disturbed.</p>

<p>Your goal is to compute how the alcohol percentage changes in the days after opening a fresh bottle. By placing the opened bottle in an advanced chemical apparatus, you are able to measure how fast each liquid in the bottle evaporates.</p>

## 입력 

 <p>The input consists of:</p>

<ul>
<li>One line with an integer $d$ ($0\leq d\leq 10^6$), the number of days your bottle of new port has remained open.</li>
<li>One line with two integers \(a\) and \(o\) (\(1\leq a, o\leq10^{12}\)), the initial volume of alcohol in the bottle and the initial total volume of other liquids in the bottle, both in \(\text{µL}\).</li>
<li>One line with two integers \(\Delta_{a}\) and \(\Delta_{o}\) (\(0\leq\Delta_{a}, \Delta_{o}\leq10^{12}\)), the evaporation rate of the alcohol and the evaporation rate of the other liquids in the bottle, both in \(\text{µL/day}\).</li>
</ul>

<p>It is guaranteed that the bottle is not empty after leaving it open for $d$ days (\(d \cdot \Delta_{a} < a\) or \(d \cdot \Delta_{o} < o\)).</p>

## 출력 

 <p>Output the alcohol percentage after leaving the bottle open for $d$ days.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>

