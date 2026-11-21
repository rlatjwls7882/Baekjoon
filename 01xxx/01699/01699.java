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
		 * 1(1):1
		 * 2(2):1+1
		 * 3(3):1+1+1
		 * 4(1):2
		 * 5(2):2+1
		 * 6(3):2+1+1
		 * 7(4):2+1+1+1
		 * 8(2):2+2
		 * 9(1):3
		 * 10(2):3+1
		 */
		
		// 제곱수의 합으로 나타냈을때 항의 최소개수 계산
		int N = Integer.valueOf(br.readLine());
		int[] dp = new int[N+1];
		for(int i=1;i<=N;i++) {
			
			int sqrt=(int)Math.sqrt(i);
			dp[i]=dp[i-sqrt*sqrt]+1;
			sqrt--;
			
			// 18의 경우 4²+1²+1²보다 3²+3²이 항의 개수가 더 적음
			while(sqrt>0) {
				dp[i]=Math.min(dp[i-sqrt*sqrt]+1, dp[i]);
				sqrt--;
			}
		}
		
		bw.write(Integer.toString(dp[N]));
		
		bw.close();
	} // end of main()
} // end of Main class