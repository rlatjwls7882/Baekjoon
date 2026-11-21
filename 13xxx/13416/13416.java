import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 수 T 입력
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		// 날짜 N 입력
    		int N = Integer.valueOf(bf.readLine());
    		
    		// 이익 계산
    		int profit=0;
    		while(N--!=0) {
    			StringTokenizer st = new StringTokenizer(bf.readLine());
    			int A = Integer.valueOf(st.nextToken());
    			int B = Integer.valueOf(st.nextToken());
    			int C = Integer.valueOf(st.nextToken());
    			
    			if(A>=B&&A>=C&&A>0)
    				profit+=A;
    			else if(B>=C&&B>0)
    				profit+=B;
    			else if(C>0)
    				profit+=C;
    		} // end of while(N--!=0)
    		
    		// 이익 출력
    		bw.write(profit+"\n");
    	} // end of while(T--!=0)
    	
    	bw.close();
    } // end of main
} // end of Main class