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
		
		int N = Integer.valueOf(br.readLine());
		
		// 점의 좌표 입력
		long[] x = new long[N];
		long[] y = new long[N];

		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Long.valueOf(st.nextToken());
			y[i] = Long.valueOf(st.nextToken());
		}
		
		// 신발끈 공식으로 넓이 계산
		double area=0;
		for(int i=0;i<N;i++) {
			area += x[i]*y[(i+1)%N];
			area -= x[(i+1)%N]*y[i];
		}
		
		bw.write(String.format("%.01f", Math.abs(area)/2));
		
		bw.close();
	} // end of main()
} // end of Main class