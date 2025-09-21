# [Gold III] Koopamatk

[문제 링크](https://www.acmicpc.net/problem/29946) 

## 문제 설명

<p>Speleoloogia on kahtlemata üks põnevamaid ja seiklusrikkamaid teadusi, mida on võimalik üldse ette kujutada. Muidugi kaasnevad seiklustega ka ohud. Aga ega üks päris ohutu asi ikka seiklus ei ole ka ju... Nii või naa, ettevaatusabinõudele vaatamata võib maa all igasuguseid ootamatusi juhtuda ja vahel on teadlastel vaja koobastest välja jõuda nii kiiresti kui vähegi võimalik.</p>

<p>Selleks ongi tarvis kirjutada programm, mis leiaks lühima tee mõne väljapääsuni.</p>

## 입력 

 <p>Faili esimesel real on koobastiku kaardi kõrgus $H$ ja laius $W$ ($1 \le H \le 100$, $1 \le W \le 100$). Järgmisel $H$ real on igaühel täpselt $W$ märki: koobastiku kaart, kus '<code>.</code>' märgib läbipääsetavat kohta, '<code>#</code>' koopa seina ja '<code>@</code>' uurimisgrupi algasukohta. Punkt reas 1 või $H$ või veerus 1 või $W$ märgib väljapääsu. Teadlased saavad igal sammul liikuda läbipääsetavale naaberruudule samas reas või samas veerus.</p>

## 출력 

 <p>Faili esimesele reale väljastada lühima koopast välja viiva tee pikkus ja järgmisele $H$ reale kaart, millel see tee on märgitud tärnidega ('<code>*</code>'). Kui minimaalse pikkusega teid on mitu, väljastada ükskõik milline neist. Kui väljapääsu ei ole, väljastada arv $-1$ ja esialgne kaart.</p>

