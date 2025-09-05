# [Platinum V] Acyclic Decomposition

[문제 링크](https://www.acmicpc.net/problem/8314) 

## 문제 설명

<p>Byteman is studying directed graphs. He especially likes graphs which do not contain cycles, since this is a class of graphs in which many problems can be solved easily and effectively. Now he is trying to find a method of representing any directed graph as a sum of acyclic graphs.</p>

<p>For a given directed graph he is trying to find a way to divide the set of its edges into a minimal number of subsets in such a way that the graphs constructed using the respective subsets of edges do not contain cycles. Could you write a program which solves Byteman's problem?</p>

## 입력 

 <p>The first line of the standard input contains two integers n and m (1 ≤ n, m ≤ 100,000), denoting the number of vertices and the number of edges in the graph, respectively. The vertices are numbered from 1 to n. Each of the following m lines contains a description of one edge of the graph as a pair of integers a<sub>i</sub>, b<sub>i</sub> (1 ≤ a<sub>i</sub>, b<sub>i</sub> ≤ n, a<sub>i</sub> ≠ b<sub>i</sub>). Such a pair denotes a directed edge of the graph from the vertex a<sub>i</sub> to the vertex b<sub>i</sub>. You may assume that the graph does not contain multiple edges.</p>

## 출력 

 <p>The first line of the standard output should contain a single integer k - the minimal number of acyclic graphs in any decomposition of the graph. Each of the following k lines should contain a description of one element of the decomposition, starting with an integer l<sub>i</sub> denoting the number of edges in the ith element. It should be followed by an increasing sequence of l<sub>i</sub> numbers of edges belonging to the ith element of the decomposition. The edges are numbered from 1 to m in the order in which they appear in the input. Each edge should be present in exactly one element of the decomposition.</p>

<p>If there are multiple correct solutions, your program should output any one of them.</p>

