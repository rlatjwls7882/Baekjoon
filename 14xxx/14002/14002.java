import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
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
		
		// 가장 긴 증가하는 부분 수열 계산
		int[] dp = new int[N];
		Arrays.fill(dp, 1);
		int[] beforeIdx = new int[N];
		int maxIdx=0, max=1;
		
		for(int i=1;i<N;i++) {
			for(int j=0;j<i;j++) {
				if(A[j]<A[i]&&dp[i]<dp[j]+1) {
					dp[i]=dp[j]+1;
					beforeIdx[i]=j;
				}
			}
			
			if(max<dp[i]) {
				max=dp[i];
				maxIdx=i;
			}
		}
		
		bw.write(Integer.toString(max));
		bw.newLine();
		
		// 경로 추적
		int[] LIS = new int[max];
		
		for(int i=max-1;i>=0;i--) {
			LIS[i]=A[maxIdx];
			maxIdx = beforeIdx[maxIdx];
		}
		
		for(int i=0;i<max;i++) {
			bw.write(Integer.toString(LIS[i]));
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class