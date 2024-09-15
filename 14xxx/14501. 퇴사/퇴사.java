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
		
		// 근무일수 N, 걸리는 시간 T, 받는 금액 P
		int N = Integer.valueOf(br.readLine());
		int[][] TP = new int[N][2];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			TP[i][0] = Integer.valueOf(st.nextToken());
			TP[i][1] = Integer.valueOf(st.nextToken());
		}
		
		// 최대 수익 계산
		int[] dp = new int[N+1];
		int max=0;
		
		for(int i=N-1;i>=0;i--) {
			
			// 일을 할 수 없는 경우
			if(TP[i][0]+i>N) {
				dp[i]=max;
			}
			
			// 일을 할 수 있는 경우
			else {
				dp[i]=dp[i+TP[i][0]]+TP[i][1];
				max = Math.max(max, dp[i]);
				
				// 특정 일 이후의 최댓값 계산
				dp[i]=max;
			}
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class