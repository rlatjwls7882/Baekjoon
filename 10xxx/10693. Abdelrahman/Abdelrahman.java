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
        	
        	// 컴퓨터의 수 N, 케이블의 수 M 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.valueOf(st.nextToken());
        	int M = Integer.valueOf(st.nextToken());
        	
        	// 제거해도 되는 케이블의 수 출력
        	bw.write(String.format("Case %d: %d\n", numCases, M-N+1));
        }
        
        bw.close();
    } // end of main
} // end of Main class