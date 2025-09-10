# [Gold V] Theme Park (Small)

[문제 링크](https://www.acmicpc.net/problem/12593) 

## 문제 설명

<p>Roller coasters are so much fun! It seems like everybody who visits the theme park wants to ride the roller coaster. Some people go alone; other people go in groups, and don't want to board the roller coaster unless they can all go together. And <em>everyone</em> who rides the roller coaster wants to ride again. A ride costs 1 Euro per person; your job is to figure out how much money the roller coaster will make today.</p>

<p>The roller coaster can hold <strong>k</strong> people at once. People queue for it in groups. Groups board the roller coaster, one at a time, until there are no more groups left or there is no room for the next group; then the roller coaster goes, whether it's full or not. Once the ride is over, all of its passengers re-queue in the same order. The roller coaster will run <strong>R</strong> times in a day.</p>

<p>For example, suppose <strong>R</strong>=4, <strong>k</strong>=6, and there are four groups of people with sizes: 1, 4, 2, 1. The first time the roller coaster goes, the first two groups [1, 4] will ride, leaving an empty seat (the group of 2 won't fit, and the group of 1 can't go ahead of them). Then they'll go to the back of the queue, which now looks like 2, 1, 1, 4. The second time, the coaster will hold 4 people: [2, 1, 1]. Now the queue looks like 4, 2, 1, 1. The third time, it will hold 6 people: [4, 2]. Now the queue looks like [1, 1, 4, 2]. Finally, it will hold 6 people: [1, 1, 4]. The roller coaster has made a total of 21 Euros!</p>

## 입력 

 <p>The first line of the input gives the number of test cases, <strong>T</strong>.  <strong>T</strong> test cases follow, with each test case consisting of two lines. The first line contains three space-separated integers: <strong>R</strong>, <strong>k</strong> and <strong>N</strong>. The second line contains <strong>N</strong> space-separated integers <strong>g<sub>i</sub></strong>, each of which is the size of a group that wants to ride.  <strong>g<sub>0</sub></strong> is the size of the first group, <strong>g<sub>1</sub></strong> is the size of the second group, etc.</p>

<h3>Limits</h3>

<ul>
	<li>1 ≤ <strong>T</strong> ≤ 50.</li>
	<li><strong>g<sub>i</sub></strong> ≤ <strong>k</strong>.</li>
	<li>1 ≤ <strong>R</strong> ≤ 1000.</li>
	<li>1 ≤ <strong>k</strong> ≤ 100.</li>
	<li>1 ≤ <strong>N</strong> ≤ 10.</li>
	<li>1 ≤ <strong>g<sub>i</sub></strong> ≤ 10.</li>
</ul>

## 출력 

 <p>For each test case, output one line containing "Case #x: y", where x is the case number (starting from 1) and y is the number of Euros made by the roller coaster.</p>

