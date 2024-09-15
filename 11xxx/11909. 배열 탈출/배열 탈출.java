import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		int[][] map = new int[N][N];
		int[][] cost = new int[N][N];
		for(int i=0;i<N;i++) {
			Arrays.fill(cost[i], 1_000_000_000);
		}
		
		// 맵 입력
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// 배열을 탈출하기 위해 들여야 할 최소 비용 계산
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i==0&&j==0) {
					cost[0][0]=0;
				} else if(i==0||j==0) {
					int beforeX=i, beforeY=j;
					if(i==0) {
						beforeY--;
					} else {
						beforeX--;
					}
					
					cost[i][j]=cost[beforeX][beforeY]+Math.max(0, map[i][j]-map[beforeX][beforeY]+1);
				} else {
					int cost1 = cost[i-1][j]+Math.max(0, map[i][j]-map[i-1][j]+1);
					int cost2 = cost[i][j-1]+Math.max(0, map[i][j]-map[i][j-1]+1);
					
					cost[i][j] = Math.min(cost1, cost2);
				}
			}
		}
		
		bw.write(Integer.toString(cost[N-1][N-1]));
		
		bw.close();
	} // end of main()
} // end of Main class