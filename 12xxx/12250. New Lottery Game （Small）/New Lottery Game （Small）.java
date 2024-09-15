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
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        for(int numCases=1;numCases<=T;numCases++) {
        	
        	// A, B, K 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.valueOf(st.nextToken());
        	int B = Integer.valueOf(st.nextToken());
        	int K = Integer.valueOf(st.nextToken());
        	
        	// 로또에 당점되는 숫자 쌍의 수 계산
        	int cnt=0;
        	
        	for(int i=0;i<A;i++)
        		for(int j=0;j<B;j++)
        			if((i&j)<K)
        				cnt++;
        	
        	// 로또에 당점되는 숫자 쌍의 수 출력
        	bw.write(String.format("Case #%d: %d\n", numCases, cnt));
        }
        
        bw.close();
    } // end of main
} // end of Main class