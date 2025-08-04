# [Gold IV] The Tower of Babylon

[문제 링크](https://www.acmicpc.net/problem/6599) 

## 문제 설명

<p>Perhaps you have heard of the legend of the Tower of Babylon. Nowadays many details of this tale have been forgotten. So now, in line with the educational nature of this contest, we will tell you the whole story:</p>

<p>The babylonians had <em>n</em> types of blocks, and an unlimited supply of blocks of each type. Each type-<em>i</em> block was a rectangular solid with linear dimensions (<em>x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub></em>). A block could be reoriented so that any two of its three dimensions determined the dimensions of the base and the other dimension was the height.</p>

<p>They wanted to construct the tallest tower possible by stacking blocks. The problem was that, in building a tower, one block could only be placed on top of another block as long as the two base dimensions of the upper block were both strictly smaller than the corresponding base dimensions of the lower block. This meant, for example, that blocks oriented to have equal-sized bases couldn't be stacked.</p>

<p>Your job is to write a program that determines the height of the tallest tower the babylonians can build with a given set of blocks.</p>

## 입력 

 <p>The input file will contain one or more test cases. The first line of each test case contains an integer <em>n</em>, <span style="line-height:1.6em">representing the number of different blocks in the following data set. The maximum value for </span><em style="line-height:1.6em">n</em><span style="line-height:1.6em"> is 30.</span></p>

<p>Each of the next <em>n</em> lines contains three integers representing the values <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em> and <em>z<sub>i</sub></em>.</p>

<p>Input is terminated by a value of zero (0) for <em>n</em>.</p>

## 출력 

 <p>For each test case, print one line containing the case number (they are numbered sequentially starting from 1) and the height of the tallest possible tower in the format "Case <em>case</em>: maximum height = <em>height</em>"</p>

