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
		
		// xi의 누적합 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] x = new int[n+1];
		for(int i=1;i<=n;i++) {
			x[i] = x[i-1]+Integer.valueOf(st.nextToken());
		}
		
		// 답 계산
		long ans=0;
		for(int i=1;i<=n;i++) {
			ans += (x[i]-x[i-1])*(x[n]-x[i]);
		}
		
		bw.write(Long.toString(ans));

		bw.close();
	} // end of main()
} // end of Main class