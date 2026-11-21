import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static int[] moveX = {1, -1, 0, 0, 1, 1, -1, -1};
	static int[] moveY = {0, 0, 1, -1, 1, -1, 1, -1};
	static boolean[][] visited;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			
			// 지도의 크기 M*N
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.valueOf(st.nextToken());
			M = Integer.valueOf(st.nextToken());
			if(N==0&&M==0) break;
			
			// 지도 입력
			visited = new boolean[M][N];
			map = new int[M][N];
			
			for(int i=0;i<M;i++) {
				String string = br.readLine();
				for(int j=0;j<N*2;j+=2)
					if(string.charAt(j)=='1') {
						visited[i][j/2]=true;
					}
			}
			
			// 섬의 개수 계산
			ArrayList<Integer> houseNum = new ArrayList<>();
			for(int i=0;i<M;i++)
				for(int j=0;j<N;j++)
					if(visited[i][j]) {
						bfs(i, j);
						houseNum.add(map[i][j]);
					}
			
			bw.write(houseNum.size()+"\n");
		}
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		queue.add(new Pos(x, y));
		
		visited[x][y]=false;
		map[x][y]=1;
		
		while(!queue.isEmpty()) {
			
			Pos pos = queue.poll();

			// 다음 노드로 이동
			for(int i=0;i<8;i++) {
				int nextX = pos.x+moveX[i];
				int nextY = pos.y+moveY[i];

				if(nextX<0||nextX>=M||nextY<0||nextY>=N||!visited[nextX][nextY])
					continue;

				queue.add(new Pos(nextX, nextY));
				visited[nextX][nextY]=false;
				map[x][y]++;
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