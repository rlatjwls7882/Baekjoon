# [Silver V] Programming-trampoline-athlon!

[문제 링크](https://www.acmicpc.net/problem/31487) 

## 문제 설명

<p>Programming competitions are fun and exciting. Programming should be an Olympic sport! At least, this is what we believe. However, when we suggested this to some of our friends, they did not seem to share our excitement. So, we decided to suggest a combined sport that will be more interesting to watch. Programming-trampoline-athlon! (we are still working on the name.)</p>

<p>The idea is as follows. This is a team sport, where each team comprises of $3$ members. The team has at its disposal $1$ hour, $1$ computer, and $1$ trampoline. At all times, there must be at most one team member using the computer and at least one team member jumping the trampoline. At the beginning of the competition, the team is given 6 programming problems, and $6$ trampoline elements (exercises). The team decides how to partition the trampoline elements between its members, such that each team member has to perform $2$ of the given elements on the trampoline. The programming tasks are solved cooperatively by the team members, but no one member can spend more than $25$ minutes on the computer in total. The scoring is comprised of two parts, which are added together:</p>

<ul>
	<li>The programming score ranges between $0$ and $60$. The team receives $10$ points for every correctly solved problem.</li>
	<li>The trampoline score ranges between $0$ and $40$. Each of the $6$ trampoline elements receives a score from the judges that ranges between $0$ and $10$. The final trampoline execution score is determined by dropping the highest and lowest of the $6$ scores, and then adding up the remaining $4$ scores.</li>
</ul>

<p>Before we pitch this new sport to the International Olympic Committee, we want everything to be ready in order to show them just how serious we are. Thus, each team should receive a medal when no more than two other teams obtained a strictly higher score. However, in order to cope with a recent shortage of medals, the jury was instructed to make sure that there would be no more than $1\, 000$ teams deserving a medal. We ask you to write a program that determines the medallists, given the performance of the different teams.</p>

## 입력 

 <p>The first line contains the number $N$ of competing teams. Then follow $N$ lines. Each of these lines describes a team and contains space-separated values $C$, $P$, $E_1$, $E_2$, $E_3$, $E_4$, $E_5$, $E_6$; $C$ is a five-letter code used to identify the team, $P$ is an integer specifying the number of problems the team solved, and $E_i$ is an integer specifying the execution score of trampoline element number i.</p>

## 출력 

 <p>The output should contain $M$ lines, where $M$ is the number of medallists. Each line should represent a medallist team, by containing two space-separated values $C$ and $S$, where $C$ is the team code and $S$ is the total score of the team. Medallist teams should be listed by decreasing total score and, in case of ties, by input order.</p>

