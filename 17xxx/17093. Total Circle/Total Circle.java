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
		int M = Integer.valueOf(st.nextToken());
		
		// 배열 P
		long[][] P = new long[N][2];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			P[i][0] = Long.valueOf(st.nextToken());
			P[i][1] = Long.valueOf(st.nextToken());
		}
		
		// 배열 P
		long[][] Q = new long[M][2];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			Q[i][0] = Long.valueOf(st.nextToken());
			Q[i][1] = Long.valueOf(st.nextToken());
		}
		
		// P 점과 Q 점의 가장 먼 거리 계산
		long dist=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				dist = Math.max((long)(Math.pow(P[i][0]-Q[j][0], 2)+Math.pow(P[i][1]-Q[j][1], 2)), dist);
			}
		}
		
		bw.write(Long.toString(dist));
		
		bw.close();
	} // end of main()
} // end of Main class