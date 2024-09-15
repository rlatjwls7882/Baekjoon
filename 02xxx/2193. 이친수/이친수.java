import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 1(1) : 1
		 * 2(1) : 10
		 * 3(2) : 100 101
		 * 4(3) : 1000 1010 1001
		 * 5(5) : 10000 10100 10010 10001 10101
		 * 6(8) : 100000 101000 100100 100010 100001 101010 101001 100101
		 * ...
		 */
		
		int N = Integer.valueOf(br.readLine());
		
		// N자리 이친수의 개수 계산
		long[] dp = new long[N+2];
		dp[0]=dp[1]=1;
		
		for(int i=2;i<N;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		bw.write(Long.toString(dp[N-1]));
		
		bw.close();
	} // end of main()
} // end of Main class