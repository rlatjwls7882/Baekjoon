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
		
		// 다항식의 차수 N, 평가할 정수 x
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		long x = Long.valueOf(st.nextToken());
		
		// 다항식 계산
		long val = 0;
		
		while(N-->-1) {
			st = new StringTokenizer(br.readLine());
			val *= x;
			val += Long.valueOf(st.nextToken());
			val %= 1_000_000_007;
		}
		
		// 출력
		bw.write(Long.toString(val));
		
		bw.close();
	} // end of main()
} // end of Main class