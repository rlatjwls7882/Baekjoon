# [Silver V] Efficient Pinning

[문제 링크](https://www.acmicpc.net/problem/33782) 

## 문제 설명

<p>While building a computer for Johnny's new library, Eric notices all the shiny pins on the new processor. He also notices, that the processor socket in the motherboard is a lot bigger than usual. After closely examining the pins and holes on the processor and motherboard, he realizes that there are a number of possible pin shapes. It seems the processor can be placed at a number of positions, but only one of them will work.</p>

<p>Unfortunately, Eric has a very busy life, and doesn't have the time to figure out where the processor should go. He will let a friend install the processor. Eric's friend is a very precise worker, but this also makes him slow: it will take him an hour to put in and test a possible position. Every pin on the processor is indicated by either an upercase letter, or $*$ for no pin. Every hole in the motherboard is indicated by an uppercase letter. A pin will fit in the hole if the pin and hole have the same letter, or the pin is $*$. The processor and motherboard have to be placed facing north, as indicated by a big red arrow on both of them, they cant be rotated.</p>

<p>Can you help Eric figure out how many hours he will have to pay his friend to get the computer running?</p>

## 입력 

 <p>The first line consists of two space-seperated integers $w$ and $h$ ($1 \leq w,h \leq 400$), indicating the number of columns and rows of the motherboard. After that, $h$ lines of length $w$ follow, each line containing a string of uppercase letters, representing holes in the motherboard socket. On the next line, there are two space-seperated integers $n$ and $m$ ($1 \leq n,m \leq 100$, $n \leq w$, and $m \leq h$), indicating the number of columns and rows of the processor. After that, $m$ lines of length $n$ follow, each line containing a string of uppercase letters and/or $*$, representing pins on the processor.</p>

## 출력 

 <p>An integer indicating the number of hours Eric's friend will be working on this computer.</p>

