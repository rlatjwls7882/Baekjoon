# [Bronze II] Goodbye, ChAOS!

[문제 링크](https://www.acmicpc.net/problem/35453)

## 문제 설명

<p>ChAOS는 <strong>Ch</strong>ung-Ang University <strong>A</strong>lgorithm <strong>O</strong>rganization and <strong>S</strong>ociety의 약자로서 중앙대학교 소프트웨어학부에 소속되어 있는 학회이다. ACM-ICPC, Facebook Hacker Cup, Google Code Jam, Samsung Collegiate Programming Cup, Kakao Code Festival 등 국내외 다양한 프로그래밍 경진대회에 대한 대비의 필요성에 의하여 2017년에 설립되었다.</p>

<p>설립 이후 ChAOS는 꾸준히 운영되었지만, 시간이 지나면서 학생들 사이에서 PS에 대한 관심이 줄었고, 참여도도 자연스럽게 떨어졌다. 스터디나 대회 준비 같은 활동에 예전만큼 모이기 어려워졌고, 최근에는 생성형 AI가 보편화되면서 질문 및 풀이 공유 같은 교류도 많이 줄었다. 이런 이유로 운영을 이어가기 어렵다고 판단해 2025년을 끝으로 학회가 종료되었다. 앞으로 동아리 및 학회 주최의 알고리즘 대회는 없을 예정이다.</p>

<p>따라서 이번 2026 CPC가 마지막 대회일지도 모른다. 그런 의미에서 <strong>2026 CPC는 지금까지 ChAOS에서 개최한 대회를 기념하고자 모든 문제를 역대 기출문제의 패러디로 구성</strong>하기로 하였다. 문제 출제를 위해 지난 대회들을 정산하던 중 재미있는 사실을 발견했다. ChAOS는 같은 조합으로 대회를 개최한 연도가 없었다!</p>

<ul>
<li>2017년에는 CodeRace, CPC (Chung-Ang Programming Contest)가 개최되었다.</li>
<li>2018년에는 CodeRace, SCAL-MOOKJA가 개최되었다.</li>
<li>2019년에는 NPC (Newbie Programming Contest), CPC가 개최되었다.</li>
<li>2020년에는 CPC가 개최되었다.</li>
<li>2021년에는 NPC (Newbie Programming Challenge)가 개최되었다.</li>
<li>2022년에는 CHAC (ChAOS Hello{Year} Algorithm Contest), CPC가 개최되었다.</li>
<li>2023년에는 KCPC (Kookmin Chung-Ang Programming Contest), CHAC가 개최되었다.</li>
<li>2024년에는 KCPC, CPC가 개최되었다.</li>
<li>2025년에는 CC (Centroid Cup), CPC가 개최되었다.</li>
</ul>

<p>2025년까지 개최된 대회만 고려할 때, 대회 이름이 최대 $2$개 주어질 때 대회가 개최된 연도를 맞춰보자.</p>

<hr />
<p>&quot;또 많은 조건 분기 문제야?&quot;라고 화내고 있는 여러분을 위해 친절한 출제자는 구현을 단순화할 수 있는 방법을 적어놓았다.</p>

<p>잘 살펴보면 주어지는 대회 문자열 길이는 모두 서로 다르다. 공백이나 특수문자를 포함한 문자열 길이를 오름차순으로 적으면 $8$, $11$, $12$, $26$, $28$, $29$, $35$, $37$이다. 이를 바탕으로 다음과 같이 정리할 수 있다.</p>

<ul>
<li>2017년: $[8,29]\rightarrow 8\times 29=232$</li>
<li>2018년: $[8,11]\rightarrow 8\times 11=88$</li>
<li>2019년: $[26,29]\rightarrow 26\times 29=754$</li>
<li>2020년: $[29]\rightarrow 29$</li>
<li>2021년: $[28]\rightarrow 28$</li>
<li>2022년: $[29,35]\rightarrow 29\times 35=1015$</li>
<li>2023년: $[35,37]\rightarrow 35\times 37=1295$</li>
<li>2024년: $[29,37]\rightarrow 29\times 37=1073$</li>
<li>2025년: $[12,29]\rightarrow 12\times 29=348$</li>
</ul>

<p>각 해마다 대회 이름 문자열 길이의 곱도 함께 적었다. 놀랍게도 이는 이 문제에 한정해서 <strong>Perfect Hash Function</strong>이다. 따라서 각 연도를 깔끔하게 구분할 수 있다. 그러니 안심하고 문자열 길이의 곱으로 해싱을 구현하자.</p>

## 입력

<p>첫 번째 줄에 테스트 케이스의 수 $T$가 주어진다. $(1 \le T \le 100)$</p>

<p>테스트 케이스의 첫 번째 줄에 대회의 개수 $N$이 주어진다. $(1 \le N \le 2)$</p>

<p>테스트 케이스의 두 번째 줄부터 $N$개의 줄에 걸쳐 대회 이름이 한 줄에 하나씩 주어진다. 대회 이름은 다음 문자열 중 하나이다. <strong>대회명에서 각 단어를 공백 대신 언더바로 구분 하였음에 유의하라.</strong></p>

<ul>
<li><code><span style="color:#e74c3c;">CodeRace</span></code></li>
<li><code><span style="color:#e74c3c;">SCAL-MOOKJA</span></code></li>
<li><code><span style="color:#e74c3c;">Centroid_Cup</span></code></li>
<li><code><span style="color:#e74c3c;">Newbie_Programming_Contest</span></code></li>
<li><code><span style="color:#e74c3c;">Newbie_Programming_Challenge</span></code></li>
<li><code><span style="color:#e74c3c;">Chung-Ang_Programming_Contest</span></code></li>
<li><code><span style="color:#e74c3c;">ChAOS_Hello{Year}_Algorithm_Contest</span></code></li>
<li><code><span style="color:#e74c3c;">Kookmin_Chung-Ang_Programming_Contest</span></code></li>
</ul>

## 출력

<p>주어진 대회 이름이 2017년부터 2025년까지의 어느 한 해에 개최된 모든 대회와 정확히 일치하면 그 연도를 출력한다.</p>

<p>만약 그런 해가 없다면 첫 번째 줄에 <code><span style="color:#e74c3c;">Goodbye, ChAOS!</span></code>를 대신 출력한다.</p>
