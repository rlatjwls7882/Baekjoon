# [Bronze III] CDOT Pathfinder

[문제 링크](https://www.acmicpc.net/problem/34426) 

## 문제 설명

<p>The Colorado Department of Transportation wants to create a program to find the fastest route to a destination, using roadways. They've hired you to create a program that decides the quickest path to take. CDOT already has a program that can get a list of routes in-between each city, the distance of each route, as well as calculate each route's average travel speed. Using this cartographic data from each possible route, your program must find the route at each leg that minimizes the trip time.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/46a5ca86-9b10-4057-bbc8-6b05b0173a5e/-/preview/" style="width: 106px; height: 200px;"></p>

<p style="text-align: center;">Structure of the input file.</p>

## 입력 

 <p>The first line of input will be the total number of legs required to reach the destination. There will always be at least one, but no more than $25$ legs.  The lines that follow are grouped into pairs. Each pair corresponds to a city.  The first line of the pair contains one number: the number of possible routes from the current city to the next one. The second line in the pair contains two numbers for every route. The first number for a route is the average speed given in miles per hour, and the second number is the distance of the route, given in miles. There will always be at least one route from one city to the next, but no more than $25$. All numbers given are guaranteed to be positive integers.  Speed will never exceed $100$mph, and distance will never exceed $500$ miles.  No two routes on the same leg will ever take the same amount of time.</p>

<p>Note the Sample Input $1$ below matches the figure provided. </p>

## 출력 

 <p>Your program's output should be a list of numbers representing which route should be taken at each leg to get the fastest possible trip (according to duration). Output your list as one number per line, with the top number representing the route to take at the first leg, the next number representing the route to take at the second leg, and so on. Routes should be indexed from one onwards, with one being the leftmost pair of values in the input of possible routes.</p>

