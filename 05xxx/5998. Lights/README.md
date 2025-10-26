# [Platinum V] Lights

[문제 링크](https://www.acmicpc.net/problem/5998) 

## 문제 설명

<p>Bessie and the cows were playing games in the barn, but the power was reset and the lights were all turned off. Help the cows get all the lights back on so they can resume their games.</p>

<p>The N (1 <= N <= 35) lights conveniently numbered 1..N and their switches are arranged in a complex network with M (1 <= M <= 595) clever connection between pairs of lights (see below).</p>

<p>Each light has a switch that, when toggled, causes that light -- and all of the lights that are connected to it -- to change their states (from on to off, or off to on).</p>

<p>Find the minimum number of switches that need to be toggled in order to turn all the lights back on.</p>

<p>It's guaranteed that there is at least one way to toggle the switches so all lights are back on.</p>

## 입력 

 <ul>
	<li>Line 1: Two space-separated integers: N and M.</li>
	<li>Lines 2..M+1: Each line contains two space-separated integers representing two lights that are connected. No pair will be repeated.</li>
</ul>

<p> </p>

## 출력 

 <p>Line 1: A single integer representing the minimum number of switches that need to be flipped in order to turn on all the lights.</p>

<p> </p>

