import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 소 한 마리가 말하는 숫자 N 입력
        long N = Long.valueOf(br.readLine());
        
        // 게임을 N으로 시작했을 때의 점수 계산
        int score=0;
        
        for(;N!=1;) {
        	score++;
        	
        	// N이 짝수인 경우
        	if(N%2==0)
        		N/=2;
        	
        	// N이 홀수인 경우
        	else
        		N = N*3+1;
        }
        
        // 게임을 N으로 시작했을 때의 점수 출력
        bw.write(score+"");
        bw.close();
    } // end of main
} // end of Main class