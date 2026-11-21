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
        
        while(T--!=0) {
        	
        	// 서쪽과 동쪽의 사이트의 개수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.valueOf(st.nextToken());
        	int m = Integer.valueOf(st.nextToken());
        	
        	// 다리를 지을 수 있는 경우의 수(mCn) 계산
        	BigInteger sum = BigInteger.ONE;
        	
        	// ex) ₄C₃ -> ₄C₁
        	if(n<m-n) n=m-n;
        	
        	// mCn -> (m)(m-1)(m-2)...(m-n)
        	for(int i=0;i<n;i++)
        		sum = sum.multiply(new BigInteger(m-i+""));
        	
        	// mCn -> 1 / (n)(n-1)(n-2)...(2)(1)
        	for(int i=2;i<=n;i++)
        		sum = sum.divide(new BigInteger(i+""));
        	
        	// 다리를 지을 수 있는 경우의 수 출력
        	bw.write(sum+"\n");
        }
        bw.close();
    } // end of main
} // end of Main class