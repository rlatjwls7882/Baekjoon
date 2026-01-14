# [Platinum III] Water Contamination

[문제 링크](https://www.acmicpc.net/problem/30270) 

## 문제 설명

<p>While the rain, mud, and their immediate effects (in particular, drownings) often cause the most initial damage, some of the long-term danger of hurricanes results from water contamination and diseases. The high levels of water can transport dangerous sewage or other contaminated substances from where they are typically kept away from people. Drinking contaminated water can be dangerous, of course. So it is important to keep contaminants contained, even when the water levels rise.</p>

<p>We will model this problem as follows. You will be given a list of places with contamination (such as sewage plants, garbage deposits, biohazard labs) and a list of places that must be protected (hospitals, city water processing plants), as well as connections between places; these connections are those that would be flooded and thus transport contaminants during/after the hurricane. Your goal is to find the smallest number of connections that need to be blocked (e.g., with large piles of sandbags) to protect all important places from all contaminants.</p>

## 입력 

 <p>The first line contains a number 1 ≤ K ≤ 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains two integers n, c, with 1 ≤ n ≤ 500 the number of locations, and 0 ≤ c ≤ 5000 the number of connections.</p>

<p>This is followed by a line with n integers 0 ≤ t<sub>i</sub> ≤ 2, giving the type of location i. 0 means that it is neither contaminated nor important, 1 means that it is contaminated (but not important), and 2 means that it is important, i.e., must be protected (but is not contaminated). Next come c lines, each giving two integers 1 ≤ s<sub>j</sub>, t<sub>j</sub> ≤ n. This means that there is a connection between s<sub>j</sub> and t<sub>j</sub> along which contaminants could be spread (in either direction).</p>

## 출력 

 <p>For each data set, first output “Data Set x:” on a line by itself, where x is its number. Then, output the number of connections which must be blocked so that no important locations become contaminated.</p>

<p>Each data set should be followed by a blank line.</p>

