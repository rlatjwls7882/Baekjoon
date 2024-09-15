import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 자연수 S 입력
        long S = Long.valueOf(br.readLine());
        
        // N(N+1)/2 <= S 를 만족하는 N의 최댓값 찾기
        // (N+1/2)^2 <= 2S + 1/4
        
        long N = (long)(Math.sqrt(2*S+1/4.0)-1/2.0);
        
        // 소수의 오차 판별
        if((N+1)*(N+2)/2<=S)
        	bw.write(N+1+"");
        else
        	bw.write(N+"");
        
        bw.close();
    } // end of main
} // end of Main class