import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 연속된 곱의 최댓값 계산
		double dp = Double.valueOf(br.readLine());
		double max=dp;
		
		for(int i=1;i<N;i++) {
			double curVal = Double.valueOf(br.readLine());
			dp = Math.max(dp*curVal, curVal);
			max = Math.max(max, dp);
		}
		
		bw.write(String.format("%.03f", max));
		
		bw.close();
	} // end of main()
} // end of Main class