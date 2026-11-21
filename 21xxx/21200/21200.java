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
        
        // 카드의 수 N, 예측 값 P, 단계의 수 S 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int P = Integer.valueOf(st.nextToken());
        int S = Integer.valueOf(st.nextToken());
        
        while(S-->0) {
        	
        	// 공주가 고른 카드의 수 m 입력
        	st = new StringTokenizer(br.readLine());
        	int m = Integer.valueOf(st.nextToken());
        	
        	// 공주가 고른 카드를 남겨야 하는지 확인
        	String keep = "REMOVE\n";
        	
        	while(m-->0)
        		if(st.nextToken().equals(P+"")) {
        			keep = "KEEP\n";
        			break;
        		}
        	
        	// 공주가 고른 카드를 남겨야 하는지 출력
        	bw.write(keep);
        }
        
        bw.close();
    } // end of main
} // end of Main class