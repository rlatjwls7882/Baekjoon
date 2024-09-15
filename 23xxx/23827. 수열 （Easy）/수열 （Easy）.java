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
		
		// 수열의 누적합 계산
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] A = new long[N+1];
		
		for(int i=1;i<=N;i++) {
			A[i] = A[i-1] + Long.valueOf(st.nextToken());
		}
		
		// 모든 Ai * Aj의 합 % 1000000007 계산
		long sum=0;
		for(int i=1;i<=N;i++) {
			sum += (A[i]-A[i-1])*(A[N]-A[i]);
			sum %= 1_000_000_007;
		}
		
		bw.write(Long.toString(sum));

		bw.close();
	} // end of main()
} // end of Main class