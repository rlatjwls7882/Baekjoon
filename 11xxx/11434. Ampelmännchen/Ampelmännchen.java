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
        
        // 테스트 케이스의 수 K 입력
        int K = Integer.valueOf(br.readLine());
        
        for(int numCases=1;numCases<=K;numCases++) {
        	
        	// 논쟁에 있는 항목의 수 n, 서독과 동독의 사람 수 W, E 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.valueOf(st.nextToken());
        	int W = Integer.valueOf(st.nextToken());
        	int E = Integer.valueOf(st.nextToken());
        	
        	// 최대 총행복 계산
        	int maxhappiness=0;
        	
        	while(n-->0) {
        		
        		st = new StringTokenizer(br.readLine());
        		int Lw = Integer.valueOf(st.nextToken())*W;
        		int Le = Integer.valueOf(st.nextToken())*W;
        		Lw += Integer.valueOf(st.nextToken())*E;
        		Le += Integer.valueOf(st.nextToken())*E;
        		
        		maxhappiness += Math.max(Lw, Le);
        	}
        	
        	// 최대 총행복 출력
        	bw.write(String.format("Data Set %d:\n%d\n\n", numCases, maxhappiness));
        }
        
        bw.close();
    } // end of main
} // end of Main class