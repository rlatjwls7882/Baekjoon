# [Gold II] 초보자로 살아남기

[문제 링크](https://www.acmicpc.net/problem/34005) 

## 문제 설명

<p style="text-align: center;"><img alt="pichulia 의 레벨 87짜리 초보자 캐릭터의 모습" src="https://upload.acmicpc.net/cce082fa-e65c-4ff6-86a4-a1b05b5b785b/-/preview/"></p>

<p>pichulia 는 메이플스토리2 에서 초보자로 레벨 87까지 찍은 유저이다. 초보자로 모든 던전의 보스를 잡는다는 목표를 세웠던 pichulia 였지만, 어느 순간부터는 보스를 잡지 못하게 되었다. 상위 레벨의 던전에는 보통 10분 안에 보스를 잡아야 하는 제약사항이 있는데, 초보자의 데미지 수치로는 절대 잡을 수 없는 보스가 존재할 수 있던 것이다. 게임의 이러한 구조적인 불합리함을 느낀 pichulia 는 이 상황을 고발하기로 했다.</p>

<p>초보자가 쓸 수 있는 공격 스킬은 아래와 같이 총 4가지이다.</p>

<table class="table table-bordered table-center-50 td-center th-center">
	<thead>
		<tr>
			<th scope="col">스킬</th>
			<th scope="col">데미지</th>
			<th scope="col">SP</th>
			<th scope="col">후 딜레이(초)</th>
			<th scope="col">쿨타임 (초)</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><strong>기본 공격</strong></td>
			<td>100</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<td><strong>해머링</strong></td>
			<td>$A$</td>
			<td>-7</td>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<td><strong>스트라이크</strong></td>
			<td>$B$</td>
			<td>10</td>
			<td>2</td>
			<td>3</td>
		</tr>
		<tr>
			<td><strong>박치기</strong></td>
			<td>$C$</td>
			<td>10</td>
			<td>2</td>
			<td>8</td>
		</tr>
	</tbody>
</table>

<p>각 항목에 대한 설명은 다음과 같다.</p>

<ul>
	<li>데미지: <strong>스킬 시전 즉시</strong> 데미지 수치만큼 몬스터의 체력을 감소시킨다.</li>
	<li>SP: 해당 스킬을 쓰는 데 필요한 자원. 양수이면 소모를, 음수이면 회복한다. 현재 SP가 소모량 미만일 경우 스킬을 쓸 수 없다.</li>
	<li>후 딜레이: 스킬 시전 후 경직되는 시간. 이 시간 동안 어떤 스킬도 쓸 수 없다. 스킬을 사용한 시점부터 시간이 계산된다.</li>
	<li>쿨타임: 같은 스킬을 쓰기 위해 필요한 대기 시간. 이 시간 동안 같은 스킬을 다시 쓸 수 없다. 스킬을 사용한 시점부터 시간이 계산된다.</li>
</ul>

<p>예를 들어, <strong>기본 공격</strong> 과 <strong>해머링</strong> 은 후 딜레이와 쿨타임이 같으므로 1초마다 한 번씩 계속해서 사용할 수 있다. <strong>스트라이크</strong> 를 쓰면 1초 뒤에는 아무런 작업을 하지 못하고, 2초가 지난 뒤부터 <strong>스트라이크</strong> 를 제외한 다른 스킬을 쓸 수 있다. 3초 뒤부터는 <strong>스트라이크</strong> 를 쓸 수 있다.</p>

<p>SP는 1초에 1씩 회복되며. 최대 100 을 넘어가지 않는다. 또한 SP가 회복된 뒤에 스킬이 시전된다. 초기 SP는 100 이며, 1초부터 스킬을 사용할 수 있다.</p>

<p>각 스킬의 데미지가 주어졌을 때, 초기 체력이 $P$ 인 몬스터의 체력을 0 이하로 만들어 쓰러트리기 위한 시간의 최솟값을 구해보자.</p>

## 입력 

 <p>첫 번째 줄에는 테스트 케이스의 개수 $T$ 가 입력으로 주어진다. ($1 \le T \le 5$)</p>

<p>이후 $T$ 줄에 걸쳐 네 개의 정수 $A$ $B$ $C$ $P$ 가 공백으로 구분되어 주어진다. ($50 \lt A \lt 100;$ $200 \lt B \lt 400;$ $400 \lt C \lt 800;$ $400 \lt P \lt 10^6$)</p>

## 출력 

 <p>테스트케이스마다 한 줄에 하나씩 $T$ 줄에 걸쳐 몬스터를 쓰러트리기 위한 시간의 최솟값을 출력한다. 만약 $600$초가 지나도 몬스터에게 $P$ 이상의 데미지를 주지 못하는 경우 <span style="color:#e74c3c;"><code>-1</code></span> 을 출력한다.</p>

