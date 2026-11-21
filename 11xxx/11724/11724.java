import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static boolean[] visited;
	static boolean[][] node;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 정점의 개수 N, 간선의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 간선 입력
		node = new boolean[N][N];
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken())-1;
			int y = Integer.valueOf(st.nextToken())-1;
			
			node[x][y]=true;
			node[y][x]=true;
		}
		
		// 연결 요소의 개수 계산
		visited = new boolean[N];
		int cnt=0;
		
		for(int i=0;i<N;i++)
			if(!visited[i]) {
				dfs(i);
				cnt++;
			}
		
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
	
	static void dfs(int idx) {
		visited[idx]=true;
		
		for(int i=0;i<N;i++)
			if(!visited[i]&&node[idx][i])
				dfs(i);
		
	} // end of dfs()
} // end of Main class