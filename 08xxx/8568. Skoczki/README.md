# [Platinum II] Skoczki

[문제 링크](https://www.acmicpc.net/problem/8568) 

## 문제 설명

<p>Dana jest szachownica o wymiarach <em>n</em> × <em>n</em>, z której usunięto pewną liczbę pól. Należy wyznaczyć maksymalną liczbę skoczków (koników) szachowych, które można ustawić na pozostałych polach szachownicy tak, żeby żadne dwa skoczki nie atakowały się nawzajem.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/af771a5e-a23d-4b79-8dfb-fb7de17321f2/-/preview/"></p>

<p style="text-align: center;">Rysunek 1: Skoczek umieszczony w polu S atakuje pola oznaczone przez x.</p>

<p>Napisz program, który:</p>

<ul>
	<li>wczyta opis szachownicy z usuniętymi polami ze standardowego wejścia,</li>
	<li>wyznaczy maksymalną liczbę wzajemnie nie atakujących się skoczków szachowych, które można ustawić na tej szachownicy,</li>
	<li>zapisze wynik na standardowym wyjściu.</li>
</ul>

## 입력 

 <p>W pierwszym wierszu znajdują się dwie liczby całkowite <em>n</em> i <em>m</em>, gdzie 1 ≤ <em>n</em> ≤ 200, 0 ≤ <em>m</em> ≤ <em>n</em><sup>2</sup>. Liczba <em>n</em> oznacza rozmiar szachownicy, a <em>m</em> oznacza liczbę usuniętych pól.</p>

<p>W każdym z kolejnych <em>m</em> wierszy jest zapisana para liczb naturalnych <em>x</em> i <em>y</em>, gdzie 1 ≤ <em>x</em>, <em>y</em> ≤ <em>n</em>, oddzielonych pojedynczym odstępem. Są to współrzędne usuniętych pól. Lewy górny róg szachownicy ma współrzędne (1, 1), natomiast prawy dolny róg ma współrzędne (<em>n</em>, <em>n</em>). Pola nie powtarzają się.</p>

## 출력 

 <p>Na standardowym wyjściu należy zapisać dokładnie jeden wiersz, zawierający pojedynczą liczbę całkowitą równą maksymalnej liczbie wzajemnie nie atakujących się skoczków, które można ustawić na zadanej szachownicy.</p>

