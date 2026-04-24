# [Diamond IV] Archeologists

[문제 링크](https://www.acmicpc.net/problem/21905) 

## 문제 설명

<p>Your treasure hunter team has just discovered a giant archeological site, full of precious metals and valuable antiquities. The site is composed of $n$ digging spots on a line.</p>

<p>The initial plans suggest that each of the $n$ digging spots has a net profit associated with it. The $i$-th spot’s associated profit is $p_i$. More specifically, this means that your team would gain $p_i$ dollars for each meter dug in the $i$-th spot. Note that $p_i$ may also be negative, which means that the running cost of the excavating machinery surpasses the actual gain from digging in the $i$-th spot.</p>

<p>Naturally, you would want to dig as much as possible in the most profitable spots. However, in order not to cause landslides, you are not allowed to have slopes that are too steep. More precisely, for any two adjacent spots, the difference between the digging depth at these spots cannot differ by more than $1$ meter. In particular, spots $1$ and $n$ can be dug only at most $1$ meter deep.</p>

<p>What is the largest net profit that you can obtain, under these conditions?</p>

<p>For instance, a valid digging plan that turns out to be optimal in the case of the first example input is illustrated below. The net profit of such plan is $8$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c8dd8519-8823-4110-ba05-dbbd37669d5b/-/preview/" style="width: 359px; height: 252px;"></p>

## 입력 

 <p>The first line of the input will contain a positive integer $n$ ($1 \le n \le 250\,000$).</p>

<p>The second line of the input will contain $n$ integers $p_i$ ($-10^6 \le p_i \le 10^6$), separated by spaces.</p>

## 출력 

 <p>Output exactly one integer, the largest profit that you can obtain.</p>

