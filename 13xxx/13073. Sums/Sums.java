import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	int N = Integer.valueOf(br.readLine());
        	
        	// 1부터 N개의 자연수의 합 출력
        	bw.write(N*(N+1)/2+" ");
        	
        	// 1부터 N개의 홀수의 합 출력
        	bw.write(N*N+" ");
        	
        	// 1부터 N개의 짝수의 합 출력
        	bw.write(N*N+N+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class