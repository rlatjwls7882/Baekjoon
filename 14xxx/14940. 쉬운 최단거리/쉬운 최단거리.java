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
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 지도의 크기 N*M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());

		// 지도 입력
		visited = new boolean[N][M];
		map = new int[N][M];
		int startX=0, startY=0;

		for(int i=0;i<N;i++) {
			String string = br.readLine();
			for(int j=0;j<M*2;j+=2)
				if(string.charAt(j)=='1') {
					visited[i][j/2]=true;
					map[i][j/2]=-1;
				} else if(string.charAt(j)=='2') {
					startX=i;
					startY=j/2;
				}
		}
		
		// 각 지점에서 목표지점까지의 최소거리 계산
		bfs(startX, startY);

		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++)
				bw.write(map[i][j]+" ");
			bw.write("\n");
		}
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		queue.add(new Pos(x, y));
		
		visited[x][y]=false;
		map[x][y]=0;
		
		while(!queue.isEmpty()) {
			
			Pos pos = queue.poll();

			// 다음 노드로 이동
			for(int i=0;i<4;i++) {
				int nextX = pos.x+moveX[i];
				int nextY = pos.y+moveY[i];

				if(nextX<0||nextX>=N||nextY<0||nextY>=M||!visited[nextX][nextY])
					continue;

				queue.add(new Pos(nextX, nextY));
				visited[nextX][nextY]=false;
				map[nextX][nextY]=map[pos.x][pos.y]+1;
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