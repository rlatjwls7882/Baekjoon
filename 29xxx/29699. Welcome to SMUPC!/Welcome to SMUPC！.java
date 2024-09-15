import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String string = "WelcomeToSMUPC";
        
        // "WelcomeToSMUPC"을 자르는 위치 N 입력
        int N = Integer.valueOf(br.readLine())-1;
        
        // N이 문자열의 크기를 넘어가는 경우
        if(N>13) N = N%14;
        
        // N번째 글자 출력
        bw.write(string.charAt(N)+"");
        
        bw.close();
    } // end of main
} // end of Main class