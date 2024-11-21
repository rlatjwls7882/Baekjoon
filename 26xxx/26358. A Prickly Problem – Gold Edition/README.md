# [Platinum IV] A Prickly Problem – Gold Edition

[문제 링크](https://www.acmicpc.net/problem/26358) 

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b5d0aab6-1e50-4606-a8da-5ef2b1ef8f74/-/preview/" style="width: 197px; height: 299px;"></p>

<p>A tree is a connected graph in which any two vertices have exactly one path between them.</p>

<p>A cactus (sometimes called a cactus tree) is a connected graph in which any two simple cycles have at most one vertex in common. Equivalently, every edge in such a graph belongs to at most one simple cycle. The graph pictured above is an example of a cactus graph.<sup>1</sup></p>

<p>A spanning tree can be created from a connected graph by removing a set of edges such that if there are V vertices in the graph, then there are V – 1 edges remaining and every pair of vertices has exactly one path between them. Depending on which edges you choose to remove you will end up with different spanning trees. The cactus graph pictured above contains 36,864 spanning trees.</p>

<p>In this problem, your task is to count the number of spanning trees that a given cactus has. Since this result may be quite large, you should report your result modulo 1,007.</p>

<hr>
<p><sup>1</sup>Picture of graph and definition of a cactus graph taken from www.wikipedia.org</p>

### 입력 

 <p>Input will begin with an integer T denoting the number of test cases. Each test case will begin with two positive integers V ≤ 100 and E ≤ (3*V)/2 denoting the number of vertices and the number of edges, respectively. This will be followed by E lines, each containing an edge in the graph. Each edge is represented by its two vertices and each vertex listed will be between 1 and V (assume that there is at most one edge in the input between any two vertices). It is guaranteed that the graph described in the input will be a cactus.</p>

### 출력 

 <p>For each test case, output a single line "Case #x: y" where x is the case number starting with 1 and y is the number of spanning trees modulo 1,007. Leave a blank line after the output for each test case. Follow the format illustrated in Sample Output.</p>

