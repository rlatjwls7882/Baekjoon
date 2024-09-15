import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 팩토리얼 0, 1 입력
    	BigInteger[] fact = new BigInteger[N+1];
    	fact[0]=BigInteger.ONE;
    	if(N>=1) fact[1]=BigInteger.ONE;
    	
    	// 팩토리얼 N 계산
    	for(int i=2;i<=N;i++)
    		fact[i]=fact[i-1].multiply(new BigInteger(i+""));
    	
    	// 뒤에서부터 연속되는 0의 개수 계산
    	String factN = fact[N].toString();
    	int cnt=0; if(N>=5) cnt++;
    	
    	for(int i=factN.length()-2;i>=0;i--) {
    		if(factN.charAt(i)==factN.charAt(i+1))
    			cnt++;
    		else
    			break;
    	}
    	
    	// cnt 출력
    	bw.write(cnt+"");
    	bw.close();
    } // end of main
} // end of Main class