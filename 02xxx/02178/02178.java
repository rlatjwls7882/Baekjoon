import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static boolean[][] visited;
	static int[][] move;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 미로의 열 수 N, 행 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		// 미로 입력
		visited = new boolean[N][M];
		move = new int[N][M];
		
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			for(int j=0;j<M;j++)
				if(string.charAt(j)=='1') {
					visited[i][j]=true;
				}
		}
		
		// 도착지점까지 움직이는 최소 횟수 계산
		bfs(0, 0);
		bw.write(move[N-1][M-1]+"");
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		queue.add(new Pos(x, y));
		
		visited[x][y]=false;
		move[x][y]=1;
		
		while(!queue.isEmpty()) {
			
			Pos pos = queue.poll();
			
			// 이동
			for(int i=0;i<4;i++) {
				int nextX = pos.x+moveX[i];
				int nextY = pos.y+moveY[i];
				
				if(nextX<0||nextX>=M||nextY<0||nextY>=N||!visited[nextY][nextX])
					continue;
				
				queue.add(new Pos(nextX, nextY));
				visited[nextY][nextX]=false;
				move[nextY][nextX]=move[pos.y][pos.x]+1;
			}
			
			// 도착지점 도달
			if(pos.x==M-1&&pos.y==N-1)
				return;
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