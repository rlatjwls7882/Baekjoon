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
		
		// 미로의 크기 N
		int N = Integer.valueOf(br.readLine());
		
		// 미로 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] maze = new int[N];
		
		for(int i=0;i<N;i++) {
			maze[i] = Integer.valueOf(st.nextToken());
		}
		
		// 재환이가 해야하는 점프의 최소 횟수 계산
		int[] dp = new int[N];
		Arrays.fill(dp, 1000);
		dp[N-1]=0;
		
		for(int i=N-2;i>=0;i--) {
			for(int j=i+1;j<=i+maze[i]&&j<N;j++) {
				dp[i] = Math.min(dp[i], dp[j]+1);
			}
		}
		
		if(dp[0]>=1000) {
			bw.write("-1");
		} else {
			bw.write(Integer.toString(dp[0]));
		}
		
		bw.close();
	} // end of main()
} // end of Main class