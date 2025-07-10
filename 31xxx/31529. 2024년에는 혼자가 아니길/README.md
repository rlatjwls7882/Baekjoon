# [Silver V] 2024년에는 혼자가 아니길

[문제 링크](https://www.acmicpc.net/problem/31529) 

## 문제 설명

<p>Mat Street에 사는 재우와 재현이는 2024년에도 외로운 하루를 보내고 있다. 동우는 이런 둘이 안쓰러워 마찬가지로 Kor Avenue에 사는 자신의 여사친 두 명과 2 대 2 미팅을 잡아주었다. Mat Street는 가로, Kor Avenue는 세로 방향의 도로이다. Mat Street와 Kor Avenue는 MatKor 사거리에서 수직으로 만나며, 각자 사는 집은 정확하게 Mat Street 혹은 Kor Avenue 위에 위치한다. 집이 정확히 사거리 위에 있을 수도 있다.</p>

<p>첫 미팅이 끝나고 재우와 재현이는 서로 다른 한 명씩 마음이 맞았다. 동우는 누가 누구와 마음이 맞았는지 궁금해 여러 정보를 물어보았다. 그 결과 여기서 재우, 재현이, 재우가 마음에 드는 사람, 재현이가 마음에 드는 사람의 집을 순서대로 $A$, $B$, $C$, $D$라고 할 때 동우는 다음 정보를 알아냈다.</p>

<ul>
	<li>$\overline{AB}$와 $\overline{CD}$는 MatKor 사거리를 포함한다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/35978d5f-ad6e-4c8f-901a-4f93bcd684d2/-/preview/" style="height: 323px; width: 400px;"></p>

<ul>
	<li>$\overline{AC}^2+\overline{BD}^2$의 값은 $X$이고, $\overline{AB}^2+\overline{CD}^2$의 값은 $Y$이다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ba17f808-5f1d-4ee2-9541-d956485b6f36/-/preview/" style="height: 335px; width: 400px;"> <img alt="" src="https://upload.acmicpc.net/dfedd01f-df43-49c1-9bd9-c7a1fd8e6b42/-/preview/" style="height: 335px; width: 400px;"></p>

<ul>
	<li>MatKor 사거리가 집일 수도 있으며, 이 경우도 선분에 포함된다. 또한, 같은 아파트에 살 수 있기 때문에, 집이 같은 위치에 있을 수도 있다.</li>
</ul>

<p>재우는 이러면 식이 대칭적이므로 자신이 마음에 든 사람이 특정되지 않는다고 생각하였다.</p>

<p>재현이는 동우에게 다음에도 같이 만나 더블데이트를 하기로 했다고 자랑했다. 이때, 남자는 남자끼리, 여자는 여자끼리 먼저 각각 중간 지점, 즉 $\overline{AB}$와 $\overline{CD}$의 중점 $M$과 $N$에서 만나서 오기로 했다고 한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/77aba665-7ea4-44b3-bd1b-def2f36ae49a/-/preview/" style="height: 335px; width: 400px;"></p>

<p>동우는 이를 듣고 곰곰이 생각하더니 다음과 같이 이야기했다.</p>

<blockquote>
<p>그럼 $\overline{MN}^2$은 $W$겠네.</p>
</blockquote>

<p>이 말을 듣고 재우와 재현이는 매우 놀랐다. 마치 동우가 자신들이 마음에 들어 하는 여자가 누군지 안 것 같았기 때문이다. $X$, $Y$를 통해 $W$를 구해보자.</p>

<p>모든 점은 평면 위에 있다고 가정하며, 거리의 정의는 직선거리를 기준으로 한다. 단, 두 점이 일치하는 경우 거리가 $0$임에 유의하자.</p>

## 입력 

 <p>첫 번째 줄에 정수 $X$, $Y$가 공백으로 구분되어 주어진다. $(1\le X, Y\le 10^{6})$</p>

## 출력 

 <p>올해는 2024년이므로 $2024\cdot W$을 출력한다.</p>

<p>만약 위의 값이 정수가 아니라면 소수 부분을 제거하고 정수 부분만 출력한다.</p>

<p>재우가 거짓말을 해 $X$와 $Y$가 평면상에서 불가능한 수치라면 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>

<p>$2024\cdot W$로 가능한 값이 여러 개라면 <span style="color:#e74c3c;"><code>-2</code></span>를 출력한다.</p>

