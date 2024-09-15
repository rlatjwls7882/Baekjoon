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
	static int INF = 1_000_000_000;
	
	public static void main(String[] args) throws IOException {
		
		// 마을의 수 V, 도로의 수 E
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.valueOf(st.nextToken());
		int E = Integer.valueOf(st.nextToken());
		
		// 초기화
		int[][] cost = new int[V][V];
		for(int i=0;i<V;i++) {
			Arrays.fill(cost[i], INF);
			cost[i][i]=0;
		}
		
		// 마을 사이의 도로 입력
		while(E-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			int C = Integer.valueOf(st.nextToken());
			cost[A][B]=C;
		}
		
		// 도시 i에서 j로 가는데 필요한 최소 비용 계산
		for(int mid=0;mid<V;mid++) {
			for(int i=0;i<V;i++) {
				for(int j=0;j<V;j++) {
					if(cost[i][j] > cost[i][mid]+cost[mid][j]) {
						cost[i][j] = cost[i][mid]+cost[mid][j];
					}
				}
			}
		}
		
		// 비용이 가장 작은 사이클 계산
		int min=INF;
		for(int i=0;i<V;i++) {
			for(int j=0;j<V;j++) {
				if(i!=j&&cost[i][j]!=INF&&cost[j][i]!=INF) {
					min = Math.min(cost[i][j]+cost[j][i], min);
				}
			}
		}
		
		if(min==INF) {
			bw.write("-1");
		} else {
			bw.write(Integer.toString(min));
		}
		
		bw.close();
	} // end of main()
} // end of Main class