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
    	
    	// 데이터의 수
    	int P = Integer.valueOf(br.readLine());
    	
    	while(P--!=0) {
    		
    		// 데이터의 번호 K, 휴일 일수 N
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int K = Integer.valueOf(st.nextToken());
    		int N = Integer.valueOf(st.nextToken());
    		
    		// 필요한 초의 수 계산
    		int candle=N*(N+3)/2;
    		
    		// 필요한 초의 수 출력
    		bw.write(K+" "+candle+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class