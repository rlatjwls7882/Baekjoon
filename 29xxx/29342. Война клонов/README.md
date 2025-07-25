# [Bronze II] Война клонов

[문제 링크](https://www.acmicpc.net/problem/29342) 

## 문제 설명

<p>Армия клонов, созданная на планете Камино, помогала джедаям сражаться против дроидов. Все изменилось, когда Палпатин отдал <<Приказ 66>>: без предупреждения клоны напали на джедаев. Но не все еще потеряно для Светлой стороны. Некоторые клоны не услышали приказ и продолжили сражаться на стороне джедаев. Поэтому война не закончилась, когда все джедаи были убиты. По приказу Палпатина все клоны выстроились в одну линию для финальной битвы.</p>

<p>Магистр Йода понял, что он должен научиться отличать имперских клонов и клонов Республики, которые остались верны джедаям. Оглядев поле, Йода присвоил каждому клону координату, соответствующую месту, где стоит клон. С помощью Силы магистр изменил расстановку клонов на поле так, что расстояние между любыми двумя клонами одной стороны стало четно, а между любыми двумя клонами вражеских сторон --- нечетно. При этом никакие два клона не стоят на одной позиции. И началась война клонов...    </p>

<p>Чтобы оценить шансы на победу, магистр Йода хочет знать количество пар клонов, которые могут сразиться между собой, то есть количество пар таких, что клоны в паре служат разным сторонам.</p>

## 입력 

 <p>В первой строке входного файла задано число $n$ ($1 \le n \le 100000$) --- число клонов, участвующих в финальной битве. В следующей строке заданы $n$ чисел $a_i$ ($1 \le a_i \le 10^9$) --- координаты клонов, все $a_i$ различны. </p>

## 출력 

 <p>В выходной файл выведите единственное числов --- количество пар клонов, которые могут сразиться между собой.</p>

