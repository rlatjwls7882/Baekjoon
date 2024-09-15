import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
	
	static int N;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static boolean[][] visited;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 지도의 크기 N
		N = Integer.valueOf(br.readLine());
		
		// 지도 입력
		visited = new boolean[N][N];
		map = new int[N][N];
		
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			for(int j=0;j<N;j++)
				if(string.charAt(j)=='1') {
					visited[i][j]=true;
				}
		}
		
		// 각 단지에 속하는 집의 수 계산
		PriorityQueue<Integer> houseNum = new PriorityQueue<>();
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				if(visited[i][j]) {
					bfs(i, j);
					houseNum.add(map[i][j]);
				}
		
		bw.write(houseNum.size()+"\n");
		while(!houseNum.isEmpty())
			bw.write(houseNum.poll()+"\n");
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		queue.add(new Pos(x, y));
		
		visited[x][y]=false;
		map[x][y]=1;
		
		while(!queue.isEmpty()) {
			
			Pos pos = queue.poll();

			// 이동
			for(int i=0;i<4;i++) {
				int nextX = pos.x+moveX[i];
				int nextY = pos.y+moveY[i];

				if(nextX<0||nextX>=N||nextY<0||nextY>=N||!visited[nextX][nextY])
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