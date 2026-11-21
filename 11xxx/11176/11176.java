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
        
        // T개의 테스트 케이스 수행
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	
        	// 들어있는 샴푸의 양 E, 샴푸통의 수 N 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int E = Integer.valueOf(st.nextToken());
        	int N = Integer.valueOf(st.nextToken());
        	
        	// 빈 샴푸통의 수 계산
        	int empty=0;
        	
        	while(N-->0)
        		if(E<Integer.valueOf(br.readLine()))
        			empty++;
        	
        	// 빈 샴푸통의 수 출력
        	bw.write(empty+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class