# [Platinum IV] Poezja z gwiazdką

[문제 링크](https://www.acmicpc.net/problem/8789) 

## 문제 설명

<p>W pewnym egzotycznym języku indiańskim istnieje <strong>N</strong> różnych niepustych słów złożonych z małych liter alfabetu angielskiego. </p>

<p>Język posiada specyficzną właściwość, niespotykaną w żadnym innym języku. Otóż w piśmie używa się specjalnego znaku - gwiazdki ('*'), którym można zastąpić dowolny (być może pusty) spójny fragment pojedynczego słowa. Dzięku temu zapisane słowa stają się wieloznaczne, co sprawia, że w języku można pisać wyjątkowo głębokie wiersze. Utrudnia to codzienne życie, ale w końcu sztuka jest ważniejsza niż biografia.</p>

<p>Znając listę wszystkich słów w języku (w pełnym brzmieniu, bez gwiazdek) oraz tekst poematu, w którym w każdym słowie użyto dokładnie jednej gwiazdki, oblicz ile słów z języka odpowiada każdemu ze słów w poemacie. </p>

<p>Przykładowo, jeśli język zawiera słowa ["zupa","z","malpy","intruz","pyszny"], to w poemacie ["z*", "m*y", "g*ingo"] pierwszemu słowu poematu odpowiadają dwa słowa z języka, drugiemu - jedno, a trzeciemu - żadne (musiało dojść do błędu w druku).</p>

## 입력 

 <p>W pierwszej linii znajduje się liczba naturalna <strong>Z</strong> ( 1 <= <strong>Z</strong> <= 10 ) opisująca liczbę zestawów testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii opisu zestawu znajduje się liczba naturalna <strong>N</strong> ( 1 <= <strong>N </strong><= 100000) oznaczająca liczbę słów w języku.</p>

<p>W kolejnych <strong>N</strong> liniach podawane są kolejne słowa z języka. Słowa są parami różne i każde składa się z minimalnie 1, a maksymalnie 10 małych liter alfabetu angielskiego.</p>

<p>W kolejnej linii opisu zestawu znajduje się liczba naturalna <strong>K</strong> ( 1 <= <strong>K</strong> <= 100000) oznaczająca liczbę słów w poemacie.</p>

<p>W kolejnych <strong>K</strong> liniach podawane są kolejne słowa poematu. Słowa nie muszą być parami różne, każde z nich składa się z minimalnie 1, a maksymalnie 10 znaków, z których dokładnie jeden to gwiazdka, a pozostałe są małymi znakami alfabetu angielskiego.</p>

## 출력 

 <p>Dla każdego zestawu należy w <strong>K</strong> liniach wypisać liczby słów z języka odpowiadających kolejnym słowom poematu.</p>

