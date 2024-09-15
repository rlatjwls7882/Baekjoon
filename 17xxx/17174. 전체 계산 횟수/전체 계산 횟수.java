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
    	
    	// 1달러의 개수 N, 묶어야 하는 수 M
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// 전체 센 횟수 계산
    	int cnt=0;
    	
    	while(N!=0) {
    		
    		// 낱개의 개수
    		cnt+=N;
    		
    		// 묶기
    		N/=M;
    	}
    	
    	// 전체 센 횟수 출력
    	bw.write(cnt+"");
    	bw.close();
    } // end of main
} // end of Main class