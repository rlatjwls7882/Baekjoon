import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long MOD = 1_000_000_007;
	static long[] fact;
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// NCK = N!/(N-K)!K! % MOD 계산
		fact = new long[N+1];
		bw.write(Long.toString(fact(N)*pow(fact(N-K)*fact(K)%MOD, MOD-2)%MOD));
		
		bw.close();
	} // end of main()
	
	static long fact(int N) {
		if(fact[N]!=0) {
			return fact[N];
		} else {
			fact[0]=fact[1]=1;
			
			for(int i=2;i<=N;i++) {
				fact[i]=(fact[i-1]*i)%MOD;
			}
			return fact[N];
		}
		
	} // end of fact()
	
	static long pow(long N, long K) {
		if(K==1) {
			return N;
		}
		
		long tmp = pow(N, K/2);
		
		if(K%2==1) {
			return (tmp*tmp%MOD)*N%MOD;
		} else {
			return tmp*tmp%MOD;
		}
		
	} // end of pow()
} // end of Main class