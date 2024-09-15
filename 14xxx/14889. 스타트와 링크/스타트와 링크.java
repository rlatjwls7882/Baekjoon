import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int diff = Integer.MAX_VALUE;
	static boolean[] visited;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 사람 수 N
		N = Integer.valueOf(br.readLine());
		
		// 능력치 입력
		visited = new boolean[N];
		map = new int[N][N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++)
				map[i][j] = Integer.valueOf(st.nextToken());
		}
		
		// 스타트 팀과 링크 팀의 능력치 차이의 최솟값 계산
		dfs(0, 0);
		bw.write(diff+"");
		
		bw.close();
	} // end of main()
	
	static void dfs(int depth, int idx) {
		
		// 한 팀이 완성된 경우
		if(depth==N/2) {
			
			// 각 팀의 능력치 차이 확인
			int team1=0, team2=0;
			for(int i=0;i<N;i++)
				for(int j=i+1;j<N;j++) {
					if(visited[i]&&visited[j]) {
						team1+=map[i][j]+map[j][i];
					} else if(!visited[i]&&!visited[j]) {
						team2+=map[i][j]+map[j][i];
					}
				}
			
			diff = Math.min(diff, Math.abs(team1-team2));
			return;
		}
		
		// 한 팀이 완성될때까지 반복
		for(int i=idx;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				dfs(depth+1, i+1);
				visited[i]=false;
			}
		}
		
	} // end of dfs()
} // end of Main class