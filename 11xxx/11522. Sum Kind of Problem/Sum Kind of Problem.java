import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 데이터의 번호 K와 하나의 정수 N 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int K = Integer.valueOf(st.nextToken());
        	int N = Integer.valueOf(st.nextToken());
        	
        	// 데이터의 번호 출력
        	bw.write(K+" ");
        	
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