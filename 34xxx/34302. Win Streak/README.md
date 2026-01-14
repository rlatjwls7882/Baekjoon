# [Bronze III] Win Streak

[문제 링크](https://www.acmicpc.net/problem/34302) 

## 문제 설명

<p>The Colorado School of Mines football team is just off of another great season which saw them reach the Division II finals for the second year in a row.</p>

<p>Unfortunately, the team lost the finals, but the Orediggers still had a great season, going on the longest winning streak in school history with fourteen games across the regular season and the playofffs until the final game. (A winning streak is a sequence of chronologically consecutive games where a team scores more points than their opponent.)</p>

<p>Orediggers head coach Pete Sterbick has tasked you with analyzing the games of the other teams in the Rocky Mountain Athletic Conference (RMAC) to determine how long their longest winning streaks were.</p>

<p>Given the scores for all of the games that one particular team has played, Coach Sterbick wants to know the length of the longest winning streak for that team.</p>

## 입력 

 <p>The first line of input will be a single integer $1 \leq N \leq 10^4$, the number of games the team you are analyzing has played.</p>

<p>The next $N$ lines will each contain two integers $0 \leq S, T \leq 222$, representing the score of the team you are analyzing, and the score of the opposing team, respectively. The scores are given in chronological order.</p>

## 출력 

 <p>Output a single integer, the length of the longest sequence of consecutive games where the team you are analyzing scored more points than their opponent.</p>

