# [Bronze III] Mines Football

[문제 링크](https://www.acmicpc.net/problem/34366) 

## 문제 설명

<p>The Mines football team had an incredible $2022$ season! The team made it all the way to the NCAA Division II Championship game for the first time in school history.</p>

<p>Unfortunately, they lost to the defending champions Ferris State, but the Orediggers still had an amazing season going thirteen straight games without a loss, including four straight playoff games.</p>

<p>Orediggers Head Coach Brandon Moore has tasked you with finding some statistics about Mines Football's history so that he knows where to focus his efforts in the offseason. Given the scores from the previous $M$ months, Coach Moore wants to know the highest and lowest scores across all games as well as the most and least total points scored in a month across all games.</p>

## 입력 

 <p>The first line of input will contain an integer $1 \leq M \leq 1000$ representing the number of months of scores to follow.</p>

<p>The next $M$ lines will contain an integer $1 \leq S \leq 8$ representing the number of scores to follow, followed by $S$ space-separated integers in the range $[14, 1\ 000]$ representing Mines's score in each game that month. Note that the opposing team's score is not given. Each score is guaranteed to be at least $14$ points because Mines always scores lots of touchdowns.</p>

## 출력 

 <p>The output should be four lines, each with a single integer.</p>

<p>The first line of output should be the highest number of points that Mines scored in any game.</p>

<p>The second line of output should the lowest number of points that Mines scored in any game.</p>

<p>The third line of output should be the sum of the points scored in the month where Mines scored the highest total number of points.</p>

<p>The fourth line of output should be the sum of the points scored in the month where Mines scored the lowest total number of points.</p>

