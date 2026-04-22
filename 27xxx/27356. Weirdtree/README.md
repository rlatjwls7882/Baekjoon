# [Diamond I] Weirdtree

[문제 링크](https://www.acmicpc.net/problem/27356) 

## 문제 설명

<p>Azusa, the witch of the highlands, has discovered a garden full of weird trees! Therefore, together with her friend, Laika, she decided to spend some time there taking care of the garden.</p>

<p>The garden can be viewed as a sequence of $N$ trees, where the trees are indexed from $1$ to $N$. Each tree has a certain non-negative integer height. Azusa will then spend her time according to a schedule containing $Q$ entries, which can be of several types:</p>

<ol>
	<li>A tree cutting phase, characterised by three integers $l$, $r$, and $k$. In this phase, Azusa will spend the next $k$ days cutting trees. Each day she finds the tallest tree whose index is between $l$ and $r$ and decreases its height by $1$. In case there are several trees of this maximal height, she chooses the leftmost one. If the tallest tree has height $0$, then nothing happens on that day.</li>
	<li>A magic phase, characterised by two integers $i$ and $x$. In this phase, Azusa changes the tree with index $i$ so that it has height $x$.</li>
	<li>A tree inspection phase, characterised by two integers $l$ and $r$. In this phase, Azusa will find the sum of the heights of the trees with indices between $l$ and $r$.</li>
</ol>

<p>(Note that “between” is meant inclusively; e.g. $1$, $2$, $3$, $4$, $5$ are “between” $1$ and $5$.)</p>

<p>Azusa is curious what the results of the tree inspection phases will be, and wants to know them without having to go through the entire schedule. Can you help her?</p>

## 입력 

 Empty

## 출력 

 Empty

