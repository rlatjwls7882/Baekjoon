# [Platinum IV] Tågstationer

[문제 링크](https://www.acmicpc.net/problem/26893) 

## 문제 설명

<p>Zohan och Jimón är på väg till träningsläger i programmering. Det episka träningslägret äger rum i staden Petrozavodsk, och de har beslutat sig för att resa med tåg.</p>

<p>Under resans gång så sitter Jimón av någon anledning och räknar antalet personer som går av och på vid varje station som tåget stannar vid. Dessa antal skriver han upp i sin anteckningsbok -- en stations data antecknas per sida.</p>

<p>När Jimón ska kliva av tåget så ramlar han och hans anteckningsbok slits i bitar -- allt han har kvar är en hög med anteckningar huller om buller. Zohan utmanar nu Jimón att återställa ordningen i vilken stationerna uppträdde, givet siffrorna som står på sidorna som ligger på marken. Kan du hjälpa honom, eller kan du bevisa att Jimón måste ha räknat fel?</p>

## 입력 

 <p>På första rader står ett heltal $N$, antalet sidor i anteckningsblocket.</p>

<p>Efter det följer $N$ rader (en per papperssida), vardera med två icke-negativa heltal: antalet personer som stiger på vid stationen, och antalet som stiger av.</p>

<p>En person går aldrig av på samma plats som hen går på. Det garanteras att det totala antalet påstigande och det totala antalet avstigande är samma, och att detta antal är högst $10^9$. Tåget är alltid tomt när Jimón börjar räkna och tåget är alltid tomt när han har räknat klart. För enkelhets skull så antar vi att Jimón inte räknar med sig själv eller Zohan -- och det är garanterat att de går på först och stiger av sist (de missar alltså inte att räkna någon).</p>

## 출력 

 <p>Om det är möjligt för stationerna att ordnas på så sätt att det aldrig är fler personer som stiger av än som finns på tåget, skriv ut först en rad "<code>JA</code>", och sedan en rad med en möjlig ordning, där varje tal $1$ till $N$ förekommer exakt en gång. I annat fall, d.v.s. om Jimón gjort något fel, skriv ut "<code>NEJ</code>".</p>

