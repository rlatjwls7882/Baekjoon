import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static int I;
	static int endX;
	static int endY;
	static int[] moveX = {2, 1, -2, -1, 2, 1, -2, -1};
	static int[] moveY = {1, 2, -1, -2, -1, -2, 1, 2};
	static boolean[][] visited;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 체스판의 크기 I
			I = Integer.valueOf(br.readLine());
			
			// 시작지점과 도착지점
			StringTokenizer st = new StringTokenizer(br.readLine());
			int startX = Integer.valueOf(st.nextToken());
			int startY = Integer.valueOf(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			endX = Integer.valueOf(st.nextToken());
			endY = Integer.valueOf(st.nextToken());
			
			// 체스판 생성
			visited = new boolean[I][I];
			map = new int[I][I];
			
			// 나이트의 최소 이동 거리 계산
			bfs(startX, startY);
			bw.write(map[endX][endY]+"\n");
		}
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		queue.add(new Pos(x, y));
		visited[x][y]=true;
		
		while(!queue.isEmpty()) {
			Pos pos = queue.poll();
			
			// 도착지점 도달
			if(pos.x==endX&&pos.y==endY)
				return;
			
			// 다음 칸으로 이동
			for(int i=0;i<8;i++) {
				int nextX = pos.x+moveX[i];
				int nextY = pos.y+moveY[i];
				
				// 왔던 길을 되돌아가거나 체스판을 벗어나는 경우
				if(nextX<0||nextX>=I||nextY<0||nextY>=I||visited[nextX][nextY])
					continue;
				
				queue.add(new Pos(nextX, nextY));
				map[nextX][nextY]=map[pos.x][pos.y]+1;
				visited[nextX][nextY]=true;
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