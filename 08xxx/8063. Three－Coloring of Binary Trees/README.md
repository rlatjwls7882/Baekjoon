# [Gold III] Three-Coloring of Binary Trees

[문제 링크](https://www.acmicpc.net/problem/8063) 

### 문제 설명

<p>A tree consists of a node and some (zero, one or two) subtrees connected to it. These subtrees are called children.</p>

<p>A specification of the tree is a sequence of digits. If the number of children in the tree is:</p>

<ul>
	<li>zero, then the specification is a sequence with only one element 0;</li>
	<li>one, the specification begins with 1 followed by the specification of the child;</li>
	<li>two, the specification begins with 2 followed by the specification of the first child, and then by the specification of the second child.</li>
</ul>

<p>Each of the vertices in the tree must be painted either red or green or blue. However, we need to obey the following rules:</p>

<ul>
	<li>the vertex and its child cannot have the same color,</li>
	<li>if a vertex has two children, then they must have different colors.</li>
</ul>

<p>How many vertices may be painted green?</p>

<p>Write a program which:</p>

<ul>
	<li>reads the specification of the tree from the standard input,</li>
	<li>computes the maximal and the minimal number of vertices that may be painted green,</li>
	<li>writes the results to the standard output.</li>
</ul>

### 입력 

 <p>The first and only line of the standard input consists of one word (no longer then 10000 characters), which is a specification of a tree.</p>

### 출력 

 <p>Your program should write in the first and only line of the standard output exactly two integers separated by a single space, which respectively denote the maximal and the minimal number of vertices that may be painted green.</p>

