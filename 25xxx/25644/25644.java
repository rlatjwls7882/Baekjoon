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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 얻을 수 있는 최대 금액 계산
		int max=0, min=1_000_000_000;
		
		for(int i=0;i<N;i++) {
			
			// 현재의 주가 입력
			int a = Integer.valueOf(st.nextToken());
			
			// 각각의 날짜에서의 최솟값 계산
			min = Math.min(min, a);
			
			// 이 전날의 최대 이익과, 오늘의 최대 이익중 큰값 계산
			max = Math.max(max, a-min);
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class