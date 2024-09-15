# <img width="20px"  src="https://d2gd6pc034wcta.cloudfront.net/tier/6.svg" class="solvedac-tier"> [if](https://www.acmicpc.net/problem/15549) 

| 제출 번호 | 닉네임 | 채점 결과 | 메모리 | 시간 | 언어 | 코드 길이 |
|---|---|---|---|---|---|---|
|68669576| rlatjwls3333|맞았습니다!! 맞았습니다!!|4528KB|0ms|Text|B|

## 문제
<p>다음 프로그램을 실행시켰을 때, "<code>true</code>"를 출력하는 변수 <code>x</code>의 자료형과 값을 찾는 프로그램을 작성하시오.</p>

<pre class="brush:java; toolbar:false;">import java.util.*;
public class Main {
    public static void main(String[] args) {
        ??? x = ???;
        if (x != 0 && x == -x) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
</pre>

<p>실행 환경은 BOJ 채점 서버의 Java 실행 환경과 같다.</p>

## 입력
<p>입력은 없다.</p>

## 출력
<p>첫째 줄에 변수 <code>x</code>의 자료형과 값을 공백으로 구분해 출력한다. 자료형은 <code>int</code>와 <code>long</code>만 가능하다. 출력한 값이 자료형에 알맞지 않은 경우에는 틀리게 된다.</p>

<p>값은 아래 소스가 런타임 에러 없이 읽을 수 있는 값을 의미한다.</p>

<pre class="brush:java; toolbar:false;">String val = "유저가 출력한 값";
// int의 경우
int temp = Integer.parseInt(val);
// long의 경우
long temp = Long.parseLong(val);</pre>

