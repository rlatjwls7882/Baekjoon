# [Diamond III] Password

[문제 링크](https://www.acmicpc.net/problem/22261) 

## 문제 설명

<p>The elusive Phantom Thief Lupin the Fourth (usually addressed as just Lupin) has taken on the daunting task of breaking into the vault of the largest, most majestic, most technologically advanced castle in the world: The Castle of Gagliostro. Equipped with state of the art technology, it goes without saying that the castle has top-class security which fully utilises the capabilities of man and machine. Nevertheless, Lupin was unfazed even when faced when such a challenge. He stealthily evaded the guards and security cameras positioned around the castle, fought through numerous traps, and solved many puzzles before finally arriving at the vault, where he hacked the security cameras to show a feed that is not at all suspicious and drugged the security guards to render all of them unconscious.</p>

<p>The final obstacle standing in his way is an electronic password system which will open the vault once the correct password is entered. Initially, N non-negative integers between 0 and K inclusive are shown on the screen, the i<sup>th</sup> of which is equal to A<sub>i</sub>. The password also consists of N numbers, each of which is also a non-negative integer between 0 and K inclusive. Through his sheer, blinding brilliance in both mind and body, Lupin determined that the i<sup>th</sup> number in the password is P<sub>i</sub> for each 1 ≤ i ≤ N. Upon figuring out the password, Lupin was elated and all ready to complete his mission. To his dismay, however, the way the password is input is rather peculiar, and very time consuming, involving operations which alter the numbers shown on the screen slowly but surely.</p>

<p>Suppose the i<sup>th</sup> number currently shown on the screen is C<sub>i</sub> (1 ≤ i ≤ N). Lupin can open the vault when C<sub>i</sub> = P<sub>i</sub> for all 1 ≤ i ≤ n. Otherwise, Lupin is allowed operations of the following form: choose two integers i, j with 1 ≤ i ≤ j ≤ N, and for all integers l with i ≤ l ≤ j, C<sub>l</sub> changes to C<sub>l</sub> + 1 (mod K + 1). In other words, change C<sub>l</sub> to the remainder of C<sub>l</sub> + 1 when it is divided by K + 1. Specifically, 0 changes to 1, 1 changes to 2, . . . , K − 1 changes to K and K changes to 0.</p>

<p>As if the terrible password input system wasn’t bad enough, Lupin has also received information that his archnemesis Inspector Zenigada is rushing over to catch him once and for all. In order to break into the vault and escape as quickly as possible, Lupin wants to use the minimum number of operations needed to change the initial numbers to become the password and open the vault; your task is to determine the minimum number of operations Lupin needs.</p>

## 입력 

 <p>Your program must read from standard input.</p>

<p>The first line of the input contains two integers, N and K.</p>

<p>The next line contains N integers A<sub>1</sub>, A<sub>2</sub>, . . . , A<sub>N</sub>, where A<sub>i</sub> is the i<sup>th</sup> number shown on the screen initially.</p>

<p>The third and final line contains N integers P<sub>1</sub>, P<sub>2</sub>, . . . , P<sub>N</sub>, where P<sub>j</sub> is the j<sup>th</sup> number in the password.</p>

## 출력 

 <p>Your program must print to standard output.</p>

<p>The output should contain a single integer on a single line, the minimum number of operations Lupin needs to change the numbers on the screen to become the password.</p>

