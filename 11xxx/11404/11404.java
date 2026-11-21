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
		
		// 도시의 수 N, 버스의 수 M
		int N = Integer.valueOf(br.readLine());
		int M = Integer.valueOf(br.readLine());
		
		// 초기화
		int[][] cost = new int[N][N];
		for(int i=0;i<N;i++) {
			Arrays.fill(cost[i], INF);
			cost[i][i]=0;
		}
		
		// 버스 입력
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			int C = Integer.valueOf(st.nextToken());
			
			if(C<cost[A][B]) {
				cost[A][B]=C;
			}
		}
		
		// 도시 i에서 j로 가는데 필요한 최소 비용 계산
		for(int mid=0;mid<N;mid++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(cost[i][j] > cost[i][mid]+cost[mid][j]) {
						cost[i][j] = cost[i][mid]+cost[mid][j];
					}
				}
			}
		}
		
		// 도시 i에서 j로 가는데 필요한 최소 비용 출력
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(cost[i][j]==INF) {
					bw.write("0 ");
				} else {
					bw.write(Integer.toString(cost[i][j]));
					bw.write(' ');
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class