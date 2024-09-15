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
		int[] num = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			num[i] = num[i-1] + Integer.valueOf(st.nextToken());
		}
		
		// 수열에서 두 수의 곱의 합 계산
		long sum=0;
		for(int i=1;i<=N;i++) {
			sum += (num[i]-num[i-1])*(long)(num[N]-num[i]);
		}
		
		bw.write(Long.toString(sum));

		bw.close();
	} // end of main()
} // end of Main class