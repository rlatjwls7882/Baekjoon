import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스의 수 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	for(int i=1;i<=T;i++) {
    		
    		// n, m 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int n = Integer.valueOf(st.nextToken());
    		int m = Integer.valueOf(st.nextToken());
    		
    		// n<0, m<0 인경우 -n(n-1)/2+(m+1)m/2 = (m+n)(m-n+1)/2
    		// n<0, m>0 인경우 -n(n-1)/2+m(m+1)/2 = (m+n)(m-n+1)/2
    		// n>0, m>0 인경우 m(m+1)/2-(n-1)n/2 = (m+n)(m-n+1)/2
    		
    		// n~m 사이의 합 계산
    		BigInteger sum = new BigInteger(String.valueOf(m+n))
    				.multiply(new BigInteger(String.valueOf(m-n+1)))
    				.divide(new BigInteger("2"));
    		
    		// n~m의 합 출력
    		bw.write("Scenario #"+i+":\n"+sum);
    		
    		if(i!=T) bw.write("\n\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class