import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long MOD = 1_000_000_009;
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		long[] dp = new long[N+1];
		dp[1]=2;
		for(int i=2;i<N;i++) {
			dp[i] = dp[i-1]*3%MOD;
		}
		
		bw.write(Long.toString(dp[N-1]%MOD));
		
		bw.close();
	} // end of main
} // end of Main class