# [Gold III] Viršininkai - 7271 

[문제 링크](https://www.acmicpc.net/problem/7271) 

### 성능 요약

메모리: 326516 KB, 시간: 2796 ms

### 분류

자료 구조, 분리 집합

### 제출 일자

2023년 12월 26일 21:16:28

### 문제 설명

<p>Bendrovėje „Ūbr“ dirba N programuotojų. Jiems priskirti kodai – sveikieji skaičiai nuo 1 iki N. Visų darbuotojų kodai skirtingi.</p>

<p>Bendrovė vykdo M projektų. Už kiekvieną iš jų atsakingi du programuotojai ir tas, kurio kodas mažesnis, yra kito viršininkas. Žinoma, kad jokia darbuotojų pora nedirba prie daugiau nei vieno bendro projekto.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c1c710fd-3a8c-4887-a189-2aee0ed65371/-/preview/" style="width: 283px; height: 146px;"></p>

<p>1 pav. Šiame pavyzdyje N = 6 ir yra vykdomi penki projektai. Antras, trečias ir šeštas programuotojai turi po vieną viršininką, o ketvirtas programuotojas – du viršininkus.</p>

<p>„Ūbr“ nustatė, kad programuotojai, turintys daugiau nei vieną viršininką, mažiau mėgaujasi darbu. Bendrovė nori persitvarkyti, kad kiekvienas darbuotojas turėtų daugiausia vieną viršininką. Ji tai padarys nutraukdama kai kuriuos senus ir pradėdama naujus projektus. Aukščiau pateiktą pavyzdį būtų galima pertvarkyti panaikinus projektą 3-4 ir sukūrus naują projektą 3-5, tačiau tai – ne vienintelis būdas.</p>

<p>Raskite būdą „Ūbr“ persitvarkyti taip, kad joks programuotojas neturėtų dviejų arba daugiau viršininkų. Taip pat, po pertvarkos „Ūbr“ nori vykdyti kaip įmanoma daugiau projektų.</p>

<p>Jei yra daugiau nei vienas būdas tai padaryti, raskite tokį, kuris panaikintų kuo mažiau prieš pertvarką vykdytų projektų.</p>

<p>Jei vis dar yra keli galimi būdai, pateikite bet kurį iš jų.</p>

### 입력 

 <p>Pirmoje eilutėje pateikiami du skaičiai – programuotojų skaičius N ir prieš pertvarką vykdytų projektų skaičius M. Kitos M eilučių aprašo tuos projektus: kiekvienoje iš jų pateikiama po du skirtingus sveikuosius skaičius tarp 1 ir N, nurodančius, kurie du programuotojai yra atsakingi už atitinkamą projektą.</p>

### 출력 

 <p>Pirmoje eilutėje išveskite tris skaičius K, P, S (privalo galioti K = M − P + S):</p>

<ul>
	<li>K – skaičius projektų, kuriuos bendrovė vykdys po pertvarkos;</li>
	<li>P – skaičius projektų, kurie bus nutraukti;</li>
	<li>S – skaičius projektų, kurie bus pradėti.</li>
</ul>

<p>Tolesnėse P eilučių išveskite po du skaičius, apibūdinančius projektus, kurie bus nutraukti.</p>

<p>Tolesnėse S eilučių išveskite po du skaičius, apibūdinančius projektus, kurie bus pradėti.</p>

