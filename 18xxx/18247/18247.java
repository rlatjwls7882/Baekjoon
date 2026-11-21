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
    	
    	// 테스트 케이스 수 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T--!=0) {
    		
    		// 열 N, 행 M 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int N = Integer.valueOf(st.nextToken());
    		int M = Integer.valueOf(st.nextToken());
    		
    		// L4 좌석이 없을 때 -1 출력
    		if(N<'L'-'A'+1||M<4)
    			bw.write("-1\n");
    		
    		// L4 좌석 번호 출력
    		else
    			bw.write(('L'-'A')*M+4+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class