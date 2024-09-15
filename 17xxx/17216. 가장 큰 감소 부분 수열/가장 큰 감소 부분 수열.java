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
		
		// 수열의 크기 N
		int N = Integer.valueOf(br.readLine());
		
		// 수열 A 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// 가장 큰 감소하는 부분 수열 계산
		int[] dp = new int[N];
		int max=dp[0]=A[0];
		
		for(int i=1;i<N;i++) {
			dp[i] = A[i];
			
			for(int j=0;j<i;j++) {
				if(A[i]<A[j]) {
					dp[i] = Math.max(dp[j]+A[i], dp[i]);
				}
			}
			
			max = Math.max(max, dp[i]);
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class