# [Diamond IV] Image Analysis

[문제 링크](https://www.acmicpc.net/problem/34681) 

## 문제 설명

<p>A research laboratory is working on a project involving the automatic analysis of digital images.</p>

<p>The image under study is extremely large and is modeled as an $n \times n$ integer grid. The lower-left corner of the grid is $(1, 1)$ and the upper-right corner is $(n, n)$. Among all the (positive) integer grid points, only $p$ points are marked as active, each associated with a color ID. These active points are of particular interest to the researchers because they represent features extracted from the image—such as highlighted regions, detected objects, or important signals. It is guaranteed that all $x$-coordinates of the active points are distinct, and all $y$-coordinates of the active points are distinct.</p>

<p>To better understand the distribution of these features, the researcher analyzes the image using a rectangular <em>query frame</em> of fixed size $W \times H$, where $W$ is the width and $H$ is the height. The query frame must be entirely contained within the $n \times n$ grid and must align exactly with the grid. The researcher observes all the active points within the query frame and records their color IDs.</p>

<p>The task is not simply to count colors in the query frame, but to measure how <strong>balanced</strong> they are. In particular, the researcher is interested in the number of distinct color IDs that appear with frequencies in some <em>frequency</em> range $[A, B]$, i.e., lying inclusively between two thresholds $A$ and $B$. A color that appears too rarely or too frequently in the frame may not be considered significant, while a color that occurs within a moderate frequency range is more important. Thus, we want to count the colors of the active points in the query frame whose frequencies are in the given frequency range.</p>

<p>Figure 1 illustrates an example on a $11 \times 11$ integer grid. In Figure 1 (a), ten active points are marked with four colors: gold ($1$), blue ($2$), red ($3$), and gray ($4$). In Figure 1 (b), a query frame of size $W = 5$ and $H = 6$ is placed with the lower-left corner at $(3, 3)$.</p>

<p>This query frame contains the active points of the colors gold, blue, red, and gray. For a frequency range $[A, B] = [2, 4]$, we calculate the frequency of each color only inside the query frame and select the ones whose frequencies lie in $[2, 4]$. In this example, the colors with frequencies in $[2, 4]$ are gold and blue because gold and blue appear twice, but the red and gray appear only once. Thus, the answer for this query frame is $2$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e0822fe3-ff7f-4df3-ba5c-e52c7626a7a0/-/preview/" style="width: 477px; height: 234px;"></p>

<p style="text-align: center;">Figure 1. (a) Active points in $11 \times 11$ grid with four colors. (b) A query frame with $W = 5, H = 6$ with lower-left corner at $(3, 3)$.</p>

<p>Given active points and their colors, you are asked to process $q$ such queries. Each query specifies a query frame and a frequency range. For each query, you must output how many distinct color IDs inside the query frame have their frequencies lying in the frequency range.</p>

## 입력 

 <p>Your program is to read from standard input. The input starts with a line containing three integers $n$, $p$, and $q$ ($2 ≤ n ≤ 2 \times 10^5$; $1 ≤ p ≤ 2 \times 10^5$; $1 ≤ q ≤ 2 \times 10^5$), where $n$ is the size of the image, $p$ is the number of active points, and $q$ is the number of queries.</p>

<p>The second line contains two integers $W$ and $H$ ($1 ≤ W, H ≤ n − 1$), the width and height of the query frame, respectively.</p>

<p>Each of the next $p$ lines contains three integers $x$, $y$, $c$ ($1 ≤ x, y ≤ n$; $1 ≤ c ≤ 10^9$), describing an active point with color ID $c$ located at the integer grid point $(x, y)$. All $x$-coordinates are distinct, and all $y$-coordinates are distinct.</p>

<p>Each of the following $q$ lines contains four integers $L$, $D$, $A$, $B$ ($1 ≤ L ≤ n − W$; $1 ≤ D ≤ n − H$; $1 ≤ A ≤B ≤ p$). This represents a rectangle $[L, L + W] \times [D,D + H]$, which is a query frame, and the frequency range $[A, B]$.</p>

## 출력 

 <p>Your program is to write to standard output. Print $q$ lines. The $i$-th line should contain the number of distinct color IDs of the active points in the $i$-th query frame whose frequencies lie in $[A, B]$.</p>

