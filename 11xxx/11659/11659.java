import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 수의 개수 N, 합을 구해야 하는 횟수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 수의 누적 합 계산
		st = new StringTokenizer(br.readLine()); 
		int[] sum = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			sum[i] = sum[i-1] + Integer.valueOf(st.nextToken());
		}
		
		// i~j번째 수의 합 계산
		while(M-->0) {
			st = new StringTokenizer(br.readLine()); 
			int i = Integer.valueOf(st.nextToken());
			int j = Integer.valueOf(st.nextToken());
			
			bw.write(Integer.toString(sum[j]-sum[i-1]));
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class