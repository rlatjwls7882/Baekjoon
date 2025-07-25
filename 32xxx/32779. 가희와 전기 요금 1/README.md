# [Bronze I] 가희와 전기 요금 1

[문제 링크](https://www.acmicpc.net/problem/32779) 

## 문제 설명

<p>$W$ (와트)는 1초 동안 생산되거나 소비되는 전력의 능률을 의미합니다. $Wh$ (와트시)는 1시간 동안 생산되거나 소비되는 전력의 양을 의미합니다. $1kW$는 $1W$의 $1\,000$배 입니다. $1W$의 일률로 $1$시간 동안 일했다면, $1Wh$ 만큼의 일을 한 것이 되며, $1kW$의 일률로 $1$시간 동안 일했다면, $1kWh$ 만큼의 일을 한 것이 됩니다. 전기 요금은 아래와 같이 계산합니다.</p>

<ul>
	<li>요율은 $105.6$원/$kWh$ 입니다.</li>
	<li>사용한 전력량에 대한 전기 요금은 소수점 절사를 합니다.</li>
</ul>

<p>전기 요금은 사용한 전력량에 대해서만 계산되며, 그 외 요소들은 무시합니다. 질문이 $Q$개 주어집니다. 각 질문에 대한 답을 출력해 주세요.</p>

## 입력 

 <p>첫 번째 줄에 질문의 수 $Q$가 주어집니다.</p>

<p>다음 $Q$개의 줄에 $a$와 $m$이 공백으로 구분되어 주어집니다. 해당 질문은 아래를 의미합니다.</p>

<ul>
	<li>가희가 소비 전력이 $aW$인 컴퓨터를 이번 달에 총 $m$분 사용하였을 때, 컴퓨터가 사용한 전력량에 대한 전기 요금은 얼마인가요?</li>
</ul>

## 출력 

 <p>$Q$개의 줄에, 질문의 정답을 출력해 주세요.</p>

