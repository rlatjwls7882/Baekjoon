# [Platinum II] Apteka

[문제 링크](https://www.acmicpc.net/problem/8571) 

## 문제 설명

<p>Jaś stoi ostatni w kolejce do apteki. Ponieważ Jasiowi bardzo się śpieszy, to postanowił, że spróbuje się pozamieniać miejscami z niektórymi osobami, nawet jeśli musiałby za to zapłacić.</p>

<p>Każda osoba jest chętna do zamiany, ale $i$-tej osobie za przesunięcie o każde jedno miejsce dalej w kolejce trzeba zapłacić $c_i$. Dokładniej, jeśli Jaś jest $k$ miejsc ($k > 0$) dalej od kasy niż pewna osoba i jeśli chce się z nią zamienić miejscami, to musi jej zapłacić kwotę $k \cdot c_i$.</p>

<p>Jaś chciałby być pierwszy w kolejce i zastanawia się, jak dokonywać zamian, aby wydać jak najmniej.</p>

## 입력 

 <p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $n$ ($1 ≤ n ≤ 10^6$), oznaczającą liczbę osób, które stoją przed Jasiem w kolejce do apteki.</p>

<p>Następny wiersz wejścia zawiera $n$ liczb całkowitych $c_1, c_2, \dots , c_n$ ($1 ≤ c_i ≤ 10^9$), gdzie $c_i$ oznacza kwotę, jaką Jaś musi zapłacić $i$-tej osobie za przesunięcie o każde miejsce dalej w kolejce. Kolejność osób liczona jest od osoby, za którą bezpośrednio stoi Jaś, a więc od końca kolejki do jej początku.</p>

## 출력 

 <p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, równą minimalnej kwocie, jaką Jaś musi zapłacić, aby być pierwszym w kolejce.</p>

