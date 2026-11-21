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
		
		// 내비게이션의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 시작점과 도착점
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sx = Integer.valueOf(st.nextToken());
		int sy = Integer.valueOf(st.nextToken());
		int ex = Integer.valueOf(st.nextToken());
		int ey = Integer.valueOf(st.nextToken());
		
		// 순정 내비게이션의 번호 계산
		long min_dist=Long.MAX_VALUE;
		int original=1;
		
		for(int i=1;i<=N;i++) {
			int M = Integer.valueOf(br.readLine());
			
			long dist=0, beforeX=sx, beforeY=sy;
			for(int j=0;j<M;j++) {
				st = new StringTokenizer(br.readLine());
				long curX = Long.valueOf(st.nextToken());
				long curY = Long.valueOf(st.nextToken());
				
				dist += Math.abs(curX-beforeX) + Math.abs(curY-beforeY);
				beforeX = curX;
				beforeY = curY;
				
				if(j==M-1) {
					dist += Math.abs(curX-ex) + Math.abs(curY-ey);
				}
			}
			
			if(min_dist>dist) {
				min_dist=dist;
				original=i;
			}
		}
		
		bw.write(Integer.toString(original));
		
		bw.close();
	} // end of main()
} // end of Main class