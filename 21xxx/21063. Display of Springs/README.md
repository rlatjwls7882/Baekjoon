# [Diamond V] Display of Springs

[문제 링크](https://www.acmicpc.net/problem/21063) 

## 문제 설명

<p>Elater is a great magician. His most famous show is "Elater's Super Spectacular Display of Springs". The show consists in the following:</p>

<p>There are $n$ elastic springs in a line attached to the ceiling. Spring $i$ is attached at height $h_i$ and has a <em>stiffness constant</em> $k_i$. If we attach a weight of mass $w$ to the lower end of the $i$-th spring, the weight will descend to a height $H$ given by the formula:</p>

<p>$$H = h_i - \frac{w}{k_i}\text{.}$$</p>

<p>Elater will take questions from people in the audience. When asked about a positive integer $w$, Elater will be able to pick the spring which, if a weight of mass $w$ is attached to its lower end, will descend to a height lower (closer to the floor) than all the other springs (in case of a tie, he will be able to pick one of the springs with the lowest descend height). To accomplish such an amazing feat, Elater has the help of his dear assistant, Hooke.</p>

<p>Before the show, Hooke has some time to do measurements on the springs. He can not directly measure the values of $h_i$ and $k_i$, but he can choose two springs $a$ and $b$ and a mass $w$, try attaching a weight of mass $w$ to the two springs, and see which of them goes closer to the floor with that weight. Before the show, he has time to do up to $20\,000$ such measurements. Also, after each question, Elater can distract the audience for a while, so that Hooke can do up to $20$ more measurements before inconspicuously whispering the answer to Elater.</p>

<p>Can you help Hooke make the show successful? Assume that the springs are attached high enough, and the masses are small enough, so that the weights never reach the floor during any possible measurement. Also note that the weights are removed after each measurement.</p>

## 입력 

 Empty

## 출력 

 Empty

