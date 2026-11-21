import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static int M;
	static int N;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 지도의 가로 세로 길이 M N, 배추가 심어져있는 위치의 개수 K
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.valueOf(st.nextToken());
			N = Integer.valueOf(st.nextToken());
			int K = Integer.valueOf(st.nextToken());
			
			// 배추지도 입력
			visited = new boolean[M][N];
			
			while(K-->0) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.valueOf(st.nextToken());
				int Y = Integer.valueOf(st.nextToken());
				
				visited[X][Y]=true;
			}
			
			// 필요한 배추흰지렁이의 최소 마리수 계산
			int cnt=0;
			for(int i=0;i<M;i++)
				for(int j=0;j<N;j++)
					if(visited[i][j]) {
						bfs(i, j);
						cnt++;
					}
			
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		queue.add(new Pos(x, y));
		
		visited[x][y]=false;
		
		while(!queue.isEmpty()) {
			
			Pos pos = queue.poll();

			// 다음 노드로 이동
			for(int i=0;i<4;i++) {
				int nextX = pos.x+moveX[i];
				int nextY = pos.y+moveY[i];

				if(nextX<0||nextX>=M||nextY<0||nextY>=N||!visited[nextX][nextY])
					continue;

				queue.add(new Pos(nextX, nextY));
				visited[nextX][nextY]=false;
			}
		}
	} // end of bfs()
} // end of Main class

class Pos {
	int x;
	int y;
	
	public Pos(int x, int y) {
		this.x=x;
		this.y=y;
	} // end of Pos()
} // end of Pos class