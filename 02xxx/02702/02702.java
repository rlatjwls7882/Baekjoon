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
    	
    	// 테스트 케이스의 수 T
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T-->0) {
    		
    		// 두 정수 A, B 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int A = Integer.valueOf(st.nextToken());
    		int B = Integer.valueOf(st.nextToken());
    		
    		// A와 B의 최소공배수와 최대공약수 계산
    		int gcdA=A, gcdB=B;
    		
    		while(gcdB!=0) {
    			int tmp=gcdA%gcdB;
    			gcdA=gcdB;
    			gcdB=tmp;
    		}
    		
    		bw.write(String.format("%d %d\n", A*B/gcdA, gcdA));
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class