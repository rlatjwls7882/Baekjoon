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
        
        for(int numCases=1;;numCases++) {
        	
        	// L, P, V 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int L = Integer.valueOf(st.nextToken());
        	int P = Integer.valueOf(st.nextToken());
        	int V = Integer.valueOf(st.nextToken());
        	
        	if(L==0) break;
        	
        	// 캠핑장을 최대 며칠동안 사용할 수 있는지 출력
        	int day = (V/P)*L + Math.min(L, V%P);
        	
        	bw.write(String.format("Case %d: %d\n", numCases, day));
        }
        
        bw.close();
    } // end of main
} // end of Main class