# [Bronze II] Tågväxeln

[문제 링크](https://www.acmicpc.net/problem/26904) 

## 문제 설명

<p>Växelholm är en väldigt liten stad som ligger långt ute på landet. Den består faktiskt endast av en enda byggnad - Växelholms tågstation. Staden har också bara en invånare, nämligen tågstationens föreståndare, Lokas. </p>

<p>Lokas jobb går i huvudsak ut på att operera stationens manuella tågväxel, så att de två pendeltågen som passerar genom staden åker åt rätt håll. Tågen går periodiskt med $n$ respektive $m$ minuters mellanrum, med första avgång $n$ och $m$ minuter <strong>efter midnatt</strong>. Tågen åker alltså ut från stationen åt samma håll men åker sedan ut på två olika spår, som delas upp av en växel.</p>

<p>Nu har Lokas arbetsgivare JS, Järnvägarnas Stat, bestämt att Lokas ska få lön baserat på hur många gånger han måste ändra växeln på en dag. De undrar nu hur många gånger som Lokas måste ändra på växeln under ett helt dygn (dvs 1440 minuter). Tågen avgår alltså bara under minuterna 00:00 till 23:59. </p>

<p>Lokas ska ändra växeln enligt reglerna:</p>

<ol>
	<li>Om ett tåg ska avgå, och växeln är fel inställd, måste Lokas ändra växeln till rätt spår.</li>
	<li>Om båda tåg ska avgå samma minut, så avgår först det tåg som växeln är inställd för, och sedan ska Lokas ändra växeln till det andra tågets spår.</li>
</ol>

<p>I början är växeln inställd på spåret för det tåg som avgår först. </p>

<p>Skriv ett program som beräknar hur många gånger som Lokas måste ändra växeln under ett helt dygn.</p>

## 입력 

 <p>På första raden står två heltal $n$ och $m$ ($1 \leq n, m \leq 1399, n \not= m$), perioderna för tågens avgång angivna i minuter.</p>

## 출력 

 <p>Skriv ut ett heltal, minsta antalet gånger som Lokas måste ändra växeln.</p>

