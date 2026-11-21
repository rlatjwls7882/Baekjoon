import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		int n = Integer.valueOf(br.readLine());
		
		// 수열 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		// 연속하는 수의 최댓값 계산
		int[] dp = new int[n+1];
		int max=arr[0];
		
		for(int i=1;i<=n;i++) {
			dp[i]=Math.max(dp[i-1]+arr[i-1], arr[i-1]);
			max = Math.max(max, dp[i]);
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class