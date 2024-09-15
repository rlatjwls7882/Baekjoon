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
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			// maximum subarray의 합 계산
			StringTokenizer st = new StringTokenizer(br.readLine());
			int dp = Integer.valueOf(st.nextToken());
			int max=dp;
			
			while(N-->1) {
				int next = Integer.valueOf(st.nextToken());
				dp = Math.max(dp+next, next);
				max = Math.max(max, dp);
			}
			
			bw.write(Integer.toString(max));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class