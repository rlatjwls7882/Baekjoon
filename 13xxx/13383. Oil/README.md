# [Gold V] Oil

[문제 링크](https://www.acmicpc.net/problem/13383) 

### 문제 설명

<p>Mr. Mike owns many houses. Every day wakes up in one of his houses and drives around between this house and the other houses he owns till he gets tired. Then he goes to bed in whatever house he is in when he decides to stop. Mr. Mike’s car leaks oil, so by visiting houses he leaves a trail of oil that could be used to track his journey. However, Mr. Mike also has servants who stay in his houses, and they also sometimes drive between his houses in their cars. By coincidence, their cars also leak oil, so at the end of the day there may be many oil trails between houses. Mr. Mike and his servants will never leave one house and return to the same house without first having visited a different house. The question is, given a map of the houses and the oil trails between them at the end of a particular day, can you say whether it is possible that Mr. Mike was the only person driving that day?</p>

<p> </p>

### 입력 

 <p>The first line of input is an integer between 500 and 1000 (inclusive). This tells you how many test cases there are. After this line the lines come in pairs (one for every test case). The first line for each test case also contains a single integer between 2 and 100 (inclusive). This is how many houses there are in this test case. The next line is also composed of integers. The first tells you how many triples the line contains. After this the line consists of triples of integers. A triple x y z tells you there are z oil trails between house x and house y (house numbering begins at 0, and there are at most 5 trails between each pair of houses). Trails have no direction so if the triple x y z occurs then the triple y x z is assumed to exist but will not appear on the input line. If the house x and house y do not appear in a triple then there are no oil trails between them.</p>

### 출력 

 <p>For each test case output the string “yes” if it is possible (based only on this information) that Mr. Mike created all the oil trails himself. Otherwise output “no”. Use one line for each test case.</p>

