import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static boolean[][] visited;
	static int N;
	
	public static void main(String[] args) throws IOException {

		// 지도의 크기 N
		N = Integer.valueOf(br.readLine());
		
		// 지도 입력
		int[][] map1 = new int[N][N]; // 적록색약이 아닌 사람이 본 지도
		int[][] map2 = new int[N][N]; // 적록색약인 사람이 본 지도
		
		for(int i=0;i<N;i++) { // R:0, G:1, B:2
			String string = br.readLine();
			for(int j=0;j<N;j++) {
				if(string.charAt(j)=='G') {
					map1[i][j]=1;
				} if(string.charAt(j)=='B') {
					map1[i][j]=2;
					map2[i][j]=2;
				}
			}
		}
		
		// 적록색약이 아닌 사람이 봤을 때의 구역의 개수
		visited = new boolean[N][N];
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {
					bfs(i, j, map1);
					cnt++;
				}
			}
		}
		
		bw.write(Integer.toString(cnt));
		bw.write(' ');
		
		// 적록색약인 사람이 봤을 때의 구역의 개수
		visited = new boolean[N][N];
		cnt=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {
					bfs(i, j, map2);
					cnt++;
				}
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y, int[][] map) {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(x, y));
		visited[x][y]=true;
		
		while(!q.isEmpty()) {
			Pos pos = q.poll();
			x = pos.x;
			y = pos.y;
			
			for(int i=0;i<4;i++) {
				int nextX = x+moveX[i];
				int nextY = y+moveY[i];
				
				if(nextX<0||nextX>=N||nextY<0||nextY>=N||visited[nextX][nextY]) {
					continue;
				} else if(map[x][y]==map[nextX][nextY]) {
					visited[nextX][nextY]=true;
					q.add(new Pos(nextX, nextY));
				}
			}
		}
		
	} // end of bfs()
} // end of Main class

class Pos {
	int x, y;
	
	public Pos(int x, int y) {
		this.x=x;
		this.y=y;
	}
} // end of Pos class