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
		
		// 정규 라운드에 참가하는 학교 수와 교실 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 방에 사람을 골고루 분배하기
		st = new StringTokenizer(br.readLine());
		double people=0;
		
		while(K-->0) {
			people += Double.valueOf(st.nextToken());
		}
		
		// 제일 많은 사람이 들어있는 교실의 사람수 출력
		bw.write(Long.toString((long)Math.ceil(people/M)));
		
		bw.close();
	} // end of main()
} // end of Main class