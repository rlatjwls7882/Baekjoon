# [Bronze II] Õhne vanaraamatupood

[문제 링크](https://www.acmicpc.net/problem/7131) 

## 문제 설명

<p>Õhne vanaraamatupood on globaalse haardega idufirma, mis tegeleb eriti haruldaste ja vanade raamatute müügiga interneti teel. Suurem osa portaalis tegutsevatest müüjatest on robotid, mis püüavad üksteiselt raamatuid odavalt osta ja neid siis teistele kasutajatele kallimalt edasi müüa. Kuna raamatud on väga haruldased, siis pakutakse müügiks ka raamatuid, mida müüjal tegelikult pole.</p>

<p>Vaatleme eriti lihtsat müügirobotit, mis käitub järgmise algoritmi alusel.</p>

<ul>
	<li>Kui antud raamatut veel müügil pole, siis mõtleb esimene robot ise välja suvalise hinna. Loeme seda päevaks 0 ja selle roboti number on 1.</li>
	<li>Iga robot aktiveerub kindla intervalliga (iga $I$ päeva järel), arvutab kõigi portaalis olevate pakkumiste (sealhulgas tema enda pakkumine) keskmise, lisab sellele oma marginaali (juurdehindluse) ning arvutab nii oma uue pakkumise. Arvutuste aluseks on müüjate hinnad eelmise päeva lõpu seisuga.</li>
</ul>

<p>Kõik hinnad avaldatakse portaalis ühe sendi täpsusega, arvuste käigus tekkinud sentide murdosad alates $0{,}5$ sendist ümardatakse üles.</p>

<p>Võib eeldada, et ükski hind ei ületa kunagi väärtust $1\,000\,000.00$.</p>

<p>Kirjutada programm, mis leiab kirjeldatud robotite poolt ühe raamatu eest küsitavad hinnad antud päeva alguses. (Sellel päeval toimuvaid hinnamuutusi mitte arvestada.)</p>

## 입력 

 <p>Tekstifaili esimesel real on kolm arvu: robotide arv $N$ ($1 \le N \le 100$), esimese roboti poolt raamatu eest küsitud hind $P_0$ ($0.01 \le P_0 \le 9999.99$) ja meid huvitava päeva number $T$ ($1 \le T \le 10\,000$).</p>

<p>Järgmisel $N$ real on robotide parameetrid: esimese müügipakkumise tegemise päev $S_i$ ($S_1 = 0$, muidu $1 \le S_i < T$), pakkumise uuendamise intervall $I_i$ ($1 \le I_i \le T$) ja marginaal $M_i$ ($0 < M_i < 1$, täpsusega kuni 5 kohta pärast koma).</p>

## 출력 

 <p>Tekstifaili väljastada päeva $T$ hommikul iga roboti poolt selle raamatu eest küsitav hind. Hindades väljastada täpselt kaks kohta pärast koma.</p>

