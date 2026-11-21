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
		
		// 집의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 첫번째 집 칠하기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] cost = new int[N][3];
		for(int i=0;i<3;i++) {
			cost[0][i] = Integer.valueOf(st.nextToken());
		}
		
		// 다음 집 칠하기
		for(int i=1;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			
			cost[i][0] = Integer.valueOf(st.nextToken())+Math.min(cost[i-1][1], cost[i-1][2]);
			cost[i][1] = Integer.valueOf(st.nextToken())+Math.min(cost[i-1][0], cost[i-1][2]);
			cost[i][2] = Integer.valueOf(st.nextToken())+Math.min(cost[i-1][0], cost[i-1][1]);
		}
		
		// 모든 집을 칠하는 최소 비용 출력
		bw.write(Integer.toString(Math.min(Math.min(cost[N-1][0], cost[N-1][1]), cost[N-1][2])));
		
		bw.close();
	} // end of main()
} // end of Main class