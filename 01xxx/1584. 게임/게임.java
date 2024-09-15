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
	static int N=501, INF=1_000_000_000;
	
	public static void main(String[] args) throws IOException {

		// 초기화
		map = new int[N][N];
		routeVal= new int[N][N];
		for(int i=0;i<N;i++) {
			Arrays.fill(routeVal[i], INF);
		}
		routeVal[0][0]=0;
		
		// 위험 구역 입력
		int n = Integer.valueOf(br.readLine());
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			
			for(int i=Math.min(x1, x2);i<=Math.max(x1, x2);i++) {
				for(int j=Math.min(y1, y2);j<=Math.max(y1, y2);j++) {
					map[i][j]=1;
				}
			}
		}
		
		// 죽음 구역 입력
		int m = Integer.valueOf(br.readLine());
		while(m-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			
			for(int i=Math.min(x1, x2);i<=Math.max(x1, x2);i++) {
				for(int j=Math.min(y1, y2);j<=Math.max(y1, y2);j++) {
					map[i][j]=INF;
				}
			}
		}
		
		// (500, 500)으로 갈때 잃는 생명의 최솟값 계산
		bfs();
		
		if(routeVal[500][500]==INF) {
			bw.write("-1");
		} else {
			bw.write(Integer.toString(routeVal[500][500]));
		}
		
		bw.close();
	} // end of main()
	
	static void bfs() {
		Deque<Pos> deque = new LinkedList<>();
		deque.offer(new Pos(0, 0));
		
		while(!deque.isEmpty()) {
			Pos pos = deque.pollFirst();
			int x = pos.x;
			int y = pos.y;
			
			for(int i=0;i<4;i++) {
				int nextX = x+moveX[i];
				int nextY = y+moveY[i];
				
				if(nextX<0||nextX>=N||nextY<0||nextY>=N||map[nextX][nextY]==INF) {
					continue;
				}
				
				if(routeVal[nextX][nextY]>routeVal[x][y]+map[nextX][nextY]) {
					routeVal[nextX][nextY]=routeVal[x][y]+map[nextX][nextY];
					
					if(map[nextX][nextY]==1) { // 위험구역 통과
						deque.offerLast(new Pos(nextX, nextY));
					} else { // 안전한 구역 통과
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