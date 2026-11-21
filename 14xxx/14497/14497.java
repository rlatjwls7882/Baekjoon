import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static int[][] map, routeVal;
	static int N, M;
	
	public static void main(String[] args) throws IOException {

		// 교실의 크기 N*M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		// 주난이의 위치 x1 y1, 범인의 위치 x2 y2
		st = new StringTokenizer(br.readLine());
		int x1 = Integer.valueOf(st.nextToken())-1;
		int y1 = Integer.valueOf(st.nextToken())-1;
		int x2 = Integer.valueOf(st.nextToken())-1;
		int y2 = Integer.valueOf(st.nextToken())-1;
		
		// 초기화
		map = new int[N][M];
		routeVal = new int[N][M];
		for(int i=0;i<N;i++) {
			Arrays.fill(routeVal[i], 1_000_000_000);
		}
		routeVal[x1][y1]=0;
		
		// 교실의 정보 입력
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			
			for(int j=0;j<M;j++) {
				if(string.charAt(j)=='1'||string.charAt(j)=='#') {
					map[i][j]=1;
				}
			}
		}
		
		// 범인을 잡기 위해 점프해야하는 횟수 계산
		// = 모든친구를 가중치 1로 둘때의 최단거리
		bfs(x1, y1);
		bw.write(Integer.toString(routeVal[x2][y2]));
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		Deque<Pos> deque = new LinkedList<>();
		deque.offer(new Pos(x, y));
		
		while(!deque.isEmpty()) {
			Pos pos = deque.pollFirst();
			x = pos.x;
			y = pos.y;
			
			for(int i=0;i<4;i++) {
				int nextX = x+moveX[i];
				int nextY = y+moveY[i];
				
				if(nextX<0||nextX>=N||nextY<0||nextY>=M) {
					continue;
				}
				
				if(routeVal[nextX][nextY]>routeVal[x][y]+map[nextX][nextY]) {
					routeVal[nextX][nextY]=routeVal[x][y]+map[nextX][nextY];
					
					if(map[nextX][nextY]==1) {
						deque.offerLast(new Pos(nextX, nextY));
					} else {
						deque.offerFirst(new Pos(nextX, nextY));
					}
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