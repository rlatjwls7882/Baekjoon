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
		
		// 맵의 크기 N*M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 고라니와의 거리 입력
		int[][] map = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;st.hasMoreTokens();j++) {
				map[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// 고라니가 있는 r값 계산
		int r=1, val=map[0][0];
		
		for(int i=1;i<N;i++) {
			if(val>map[i][0]) {
				r=i+1;
				val = map[i][0];
			}
		}
		
		// 고라니가 있는 c값 계산
		int c=1;
		val=map[N-1][0];
		
		for(int i=1;i<M;i++) {
			if(val>map[N-1][i]) {
				c=i+1;
				val = map[N-1][i];
			}
		}
		
		// 고라니의 위치 출력
		bw.write(String.format("%d %d", r, c));
		
		bw.close();
	} // end of main()
} // end of Main class