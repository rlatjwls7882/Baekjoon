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
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int w = Integer.valueOf(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int[] dp = new int[n+1];
			for(int j=1;j<=n;j++) {
				dp[j] = Integer.valueOf(st.nextToken()) +dp[j-1];
			}
			
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			for(int j=w;j<=n;j++) {
				int val = (dp[j]-dp[j-w])/w;
				max = Math.max(max, val);
				min = Math.min(min, val);
			}
			bw.write("Data Set "+i+":\n"+(max-min)+"\n\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class