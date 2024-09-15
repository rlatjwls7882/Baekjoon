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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// N일의 온도의 누적합 계산
		st = new StringTokenizer(br.readLine());
		int[] temp = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			temp[i] = temp[i-1] + Integer.valueOf(st.nextToken());
		}
		
		// 연속된 K일동안의 온도의 최대합 계산
		int max=-10000;
		for(int i=K;i<=N;i++) {
			max = Math.max(max, temp[i]-temp[i-K]);
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class