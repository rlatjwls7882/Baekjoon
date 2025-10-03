# [Silver II] Letter Balloons

[문제 링크](https://www.acmicpc.net/problem/32811) 

## 문제 설명

<p>You are organizing a programming contest, and have decided that the first team to solve each problem will get a balloon in the shape of the problem's letter. For example, suppose there are twenty-three problems in the contest, labeled A through W. The team members for Wossa Motta University are hoping to be first to solve problems M, U, and W so that they can fly their university's initials above their programming station. In fact, a lot of teams have the same idea: try to be first-solvers of problems that spell out their school's abbreviation. It might be possible for both Wossa Motta U. and the Spittinyer Institution to achieve this goal, but neither will be able to do so if Muddinyer Institute manages to solve problems M and I before they do (we are assuming there will never be a tie for the first solution to any problem). On the other hand, Muddinyer I. can't achieve it if either Wossa Motta U. or Spittinyer I. solves M or I first. Schools like Toe Tac Tech are out of luck no matter what, since a team can get at most a single letter balloon for any problem. And Xerxes College is also out of luck because there is no problem X in this example.</p>

<p>You've been wondering---what is the maximum number of teams that can proudly display their school's initials with "first-solver" balloons at the end of the contest?</p>

## 입력 

 <p>The first line of input contains two integers $p$ $t$, where $p$ ($1 \leq p \leq 26$) is the number of problems in the contest, and $t$ ($1 \leq t \leq 20$) is the number of teams. Problems are labeled with the first $p$ letters of the alphabet. Each of the following $t$ lines contains a nonempty string of at most $80$ uppercase letters describing a school's initials. There is only one team from each school, but several schools may have the same initials.</p>

## 출력 

 <p>Output a single integer consisting of the maximum number of teams that can be first solvers of all the problems that form the initials of their school name.</p>

