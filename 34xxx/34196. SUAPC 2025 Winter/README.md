# [Bronze I] SUAPC 2025 Winter

[문제 링크](https://www.acmicpc.net/problem/34196) 

## 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1f83cc10-7f2a-4836-9fca-67af78e29b5c/-/preview/" style="width: 1000px; height: 621px;"></p>

<p style="text-align: center;">[그림] SUAPC 2025 Winter 스코어보드 (<a href="/contest/spotboard/1449">링크</a>)</p>

<p>SUAPC는 신촌지역 5개 대학(서강, 숙명, 연세, 이화, 홍익)의 학부생 및 대학원 1년 차를 대상으로 하는 프로그래밍 대회다. 대회 문제는 서울 리저널의 문제 출제 경향을 따르며 제한 시간 동안 얼마나 많은 문제를 정확하게 풀 수 있는지를 평가하여 순위를 결정한다. 위의 사진은 SUAPC 2025 Winter의 스코어보드다.</p>

<p>문제를 많이 푼 팀이 고순위로 결정되며, 동일 수의 문제를 푼 팀이 다수 있는 경우 푼 문제들의 페널티($=$ (첫 정답을 제출한 시간) $+$ (첫 정답을 받기 전까지 오답을 제출한 횟수) $\times$ $20$)의 합이 작은 순으로 순위가 결정된다. 위 사진의 스코어보드 상에서 각 셀에 적힌 수는 오답을 제출한 횟수, 가장 오른쪽에 적힌 수가 각 팀이 푼 문제들의 페널티의 합을 의미한다.</p>

<p>위의 스코어보드 사진을 참고하여, 아래의 쿼리를 수행하는 프로그램을 작성하여라.</p>

<ul>
	<li>$R$ $C$: $R$등 팀의 $C$번 문제 해결 여부와 $C$번에 오답을 제출한 횟수를 공백으로 구분하여 한 줄로 출력한다.</li>
</ul>

## 입력 

 <p>첫째 줄에 쿼리의 개수 $Q$가 주어진다. ($1 \le Q \le 130$)</p>

<p>둘째 줄부터 $Q$개의 줄에 걸쳐 각 쿼리에 대한 입력 정수 $R$과 대문자 알파벳 $C$가 공백으로 구분되어 한 줄에 하나씩 주어진다. ($1 \le R \le 5;\ C \in \{$<code>A, B, ..., M</code>$\} = $<code>RegExp</code>$($<code>[</code><code>A−M</code><code>]</code>$)$)</p>

## 출력 

 <p>각 쿼리에 대해 $R$등 팀이 $C$번 문제를 해결한 경우에는 <span style="color:#e74c3c;"><code>Yes</code></span>, 그렇지 않은 경우에는 <code><span style="color:#e74c3c;">No</span></code>를 출력하고, 이어서 공백으로 구분하여 해당 문제에 오답을 제출한 횟수를 한 줄로 출력한다.</p>

