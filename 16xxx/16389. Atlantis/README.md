# [Diamond V] Atlantis

[문제 링크](https://www.acmicpc.net/problem/16389) 

## 문제 설명

<p>You may have heard of the lost city of Atlantis. As legend goes, Atlantis was a city of great wealth and power. Then the Gods became displeased with Atlantis and sank it into the ocean. What you may not have heard is the story of Demetrios, the only person in Atlantis with a ship at the time the city was pushed underwater.</p>

<p>Demetrios was an incredibly selfish man and thought of only one thing when he noticed the water level in the city rising: collecting the wealth of accessible gold in Atlantis and transporting it into his ship before the treasure was lost forever. Luckily for Demetrios, when the water level began rising, the many guards keeping safe the gold stores abandoned their posts to seek safety.</p>

<p>Demetrios knows the location of every gold store in Atlantis and how long it will take him to get to a particular store and back to his ship. He also knows the altitude at which each gold store resides, which determines when the store will be swallowed by the rising sea. The trouble is that he’s not sure he’ll have time to make it to every store before they become submerged. He now wonders the maximum number of stores he can visit prior to their respective submersion, if he picks his schedule optimally.</p>

<p><strong>During the 2017 NCNA Regional, the following clarification was posted: “Important: The gold store must remain above water during the ENTIRE trip to and from the store.”</strong></p>

## 입력 

 <p>The first line of input will contain the integer n, (1 ≤ n ≤ 200 000), the number of gold stores in Atlantis. The next n lines will contain two integers on each line, t<sub>i</sub> and h<sub>i</sub> , (1 ≤ t<sub>i</sub>, h<sub>i</sub> ≤ 10<sup>9</sup>), the round-trip time in seconds it will take Demetrios to visit store i and return to his ship with the gold, and the feet above sea level of store i, respectively.</p>

## 출력 

 <p>Output the maximum number of gold stores Demetrios can visit such that each is visited prior to it becoming submerged. Assume sea level rises by one foot every second, starts at height 0, and begins rising immediately.</p>

