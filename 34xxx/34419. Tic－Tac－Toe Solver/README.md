# [Bronze II] Tic-Tac-Toe Solver

[문제 링크](https://www.acmicpc.net/problem/34419) 

## 문제 설명

<p>After years of planning, you're finally ready to host the Tic-Tac-Toe world championships. Everything had been going great until you made a terrible discovery: the judges, who determine which player has won the game, have been taking bribes! There's not enough time to train new ones, so you opt for a backup plan: you'll create a piece of code that analyzes the board and tells the players if anyone has won.</p>

<p>A Tic-Tac-Toe board looks like the following. Every square can be empty, filled with an <code>X</code>, or filled with a <code>O</code> (capital letter 'o').</p>

<p> Player <code>X</code> has won if they have three <code>X</code>'s in a row. Player <code>O</code> wins if they can do the same with the <code>O</code>'s. A row can be horizontal, vertical, or diagonal.</p>

<p>Can you write the new judging code and salvage the competition?</p>

## 입력 

 <p>The input consists of three lines each with $3$ characters. Each line represents a row on the board. Each character in a line represents a column. This means you have $3$ rows and $3$ columns just like a normal Tic-Tac-Toe board.</p>

<p>Each square in the board contains either an <code>X</code>, <code>O</code> (that's a capital letter, not a number), or E. <code>X</code> and <code>O</code> represent markings made by the players while E represents an empty square.</p>

## 출력 

 <p>If player <code>X</code> has won, you should print out the character <code>X</code>. If player <code>O</code> has won, you should print out the character <code>O</code>. If neither player has won, you should print out the character N.</p>

