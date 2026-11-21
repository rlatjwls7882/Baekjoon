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

		// 초기좌표(N, N), 자르는 횟수 C
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		// C번 자르기
		int x=N, y=N;
		while(C-->0) {
			st = new StringTokenizer(br.readLine());
			int tmpx = Integer.valueOf(st.nextToken());
			int tmpy = Integer.valueOf(st.nextToken());
			if(tmpx>=x||tmpy>=y) continue;
			
			if(y*tmpx>=x*tmpy) x=tmpx;
			else y=tmpy;
		}
		
		// 마지막에 남는 종이의 면적 출력
		bw.write(x*y+"");

		bw.close();
	} // end of main
} // end of Main class