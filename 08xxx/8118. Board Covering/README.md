# [Platinum III] Board Covering

[문제 링크](https://www.acmicpc.net/problem/8118) 

## 문제 설명

<p>We are given a board of n × n squares, where n is an odd integer meeting the inequality 3 ≤ n < 50, and a set of k = (n<sup>2</sup> - 3)/2 stones. Each stone has the shape of a rectangle covering exactly 2 squares of the board. The board squares are numbered consecutively by rows - the squares in the first row (from left to right) are numbered from 1 to n, the squares in the second row from n+1 to 2n, and so on until we reach the bottom right corner square whose number is n<sup>2</sup>.</p>

<p>We cut any three squares out of the board, and next we want to cover it with the stones. We require that every square not removed should be covered with exactly one stone (covering also one adjacent square) and that cut out squares remain uncovered.</p>

<p>Is it always possible?</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the standard input the dimension of the board n and numbers of three board squares that have been cut out,</li>
	<li>examines whether such a board can be covered with stones. If not, the program writes the answer <code>NIE</code> ("<i>no</i>") in the standard output.<br>
	If so, it writes in the standard output a sequence of k = (n<sup>2</sup> - 3)/2 pairs of integers indicating the positions of stones covering the given board.</li>
</ul>

<p>If there are many ways to cover the board with stones, your program should write only one (arbitrary) of them.</p>

## 입력 

 <p>In the only line of the standard input there are written four numbers separated by single spaces. The first number is the dimension of the board n, and the three other are the numbers of the cut out squares. The last number is followed by the end of the line.</p>

<p>The data in the standard input are written correctly, and your program need not verify that.</p>

## 출력 

 <p>The standard output should contain:</p>

<ul>
	<li>either one word <code>NIE</code></li>
	<li>or in each of k consecutive lines two numbers separated by a space, i.e. the numbers of two adjacent squares covered with one stone.</li>
</ul>

