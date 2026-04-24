# [Diamond III] Farm of Monsters

[문제 링크](https://www.acmicpc.net/problem/18463) 

## 문제 설명

<p>There are n monsters, and the i-th monster initially has h<sub>i</sub> health points.</p>

<p>Let’s call a monster alive if his HP is strictly greater than zero.</p>

<p>You have an attack power of a, and your opponent has an attack power of b.</p>

<p>As long as one monster is still alive, you and your opponent take turns fighting monsters (beginning with you).</p>

<p>You are very smart, so on your turn, you can attack any monster that is alive or do nothing. If you choose to attack some monster i, the monster’s health, h<sub>i</sub>, will decrease by exactly a.</p>

<p>After your attack, if the monster is dead (not alive), you gain one victory point.</p>

<p>Your opponent, on the other hand, is not so smart. During his turn, he finds the monster with the smallest index that is alive and attacks it (i.e. he finds the smallest i such that h<sub>i</sub> > 0 and decreases h<sub>i</sub> exactly by b).</p>

<p>What is the greatest number of victory points that you can obtain?</p>

## 입력 

 <p>The first line contains three integers n, a, b (1 ≤ n ≤ 300 000, 1 ≤ a, b ≤ 10<sup>9</sup>): the number of monsters and the attack powers of you and your opponent, respectively.</p>

<p>The second line contains n integers h<sub>1</sub>, h<sub>2</sub>, . . . , h<sub>n</sub> (1 ≤ h<sub>i</sub> ≤ 10<sup>9</sup>): the health points of the monsters.</p>

## 출력 

 <p>Print one integer: the largest number of victory points that you can obtain.</p>

