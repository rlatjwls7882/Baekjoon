import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int cost = Integer.MAX_VALUE;
	static int N;
	static int[][] map;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		
		N = Integer.valueOf(br.readLine());
		map = new int[N][N];
		visited = new boolean[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		dfs(0, 0);
		bw.write(Integer.toString(cost));
		
		bw.close();
	} // end of main
	
	static void dfs(int depth, int sum) {
		if(depth==3) {
			cost = Math.min(cost, sum);
			return;
		}
		
		for(int i=1;i<N-1;i++) {
			for(int j=1;j<N-1;j++) {
				if(!visited[i][j]&&!visited[i-1][j]&&!visited[i+1][j]&&!visited[i][j-1]&&!visited[i][j+1]) {
					visited[i][j]=visited[i-1][j]=visited[i+1][j]=visited[i][j-1]=visited[i][j+1]=true;
					dfs(depth+1, sum+map[i][j]+map[i-1][j]+map[i+1][j]+map[i][j-1]+map[i][j+1]);
					visited[i][j]=visited[i-1][j]=visited[i+1][j]=visited[i][j-1]=visited[i][j+1]=false;
				}
			}
		}
	} // end of dfs
} // end of Main class