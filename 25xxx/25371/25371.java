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
		int n = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		// k진수로 변환하여 집합 b의 합 계산
		long sum = calcSum(Integer.toString(n, k));
		
		// 합을 k진수로 출력
		bw.write(Long.toString(sum, k));
		
		bw.close();
	} // end of main()
	
	static long calcSum(String string) {
		StringTokenizer st = new StringTokenizer(string, "0");
		long sum=0;
		
		while(st.hasMoreTokens()) {
			sum += Long.valueOf(st.nextToken());
		}
		
		return sum;
	} // end of calcSum()
} // end of Main class