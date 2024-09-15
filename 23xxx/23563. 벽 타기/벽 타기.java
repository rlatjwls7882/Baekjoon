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
	static int H, W, INF=1_000_000_000;
	static int[][] map, routeVal;
	
	public static void main(String[] args) throws IOException {

		// 맵의 크기 H*W
		StringTokenizer st = new StringTokenizer(br.readLine());
		H = Integer.valueOf(st.nextToken());
		W = Integer.valueOf(st.nextToken());
		
		// 초기화
		map = new int[H][W];
		for(int i=0;i<H;i++) {
			Arrays.fill(map[i], 1);
		}
		
		routeVal = new int[H][W];
		for(int i=0;i<H;i++) {
			Arrays.fill(routeVal[i], INF);
		}
		
		// 맵 입력
		int[] start = new int[2];
		int[] end = new int[2];
		
		for(int i=0;i<H;i++) {
			String string = br.readLine();
			for(int j=0;j<W;j++) {
				if(string.charAt(j)=='S') { // 시작점
					start[0]=i;
					start[1]=j;
				} else if(string.charAt(j)=='E') { // 끝점
					end[0]=i;
					end[1]=j;
				} else if(string.charAt(j)=='#') { // 벽
					map[i][j]=INF;
					
					// 벽과 인접한 칸 0으로 채우기
					for(int k=0;k<4;k++) {
						int nextX = i+moveX[k];
						int nextY = j+moveY[k];
						
						if(nextX<0||nextX>=H||nextY<0||nextY>=W||map[nextX][nextY]==INF) {
							continue;
						}
						
						map[nextX][nextY]=0;
					}
				}
			}
		}
		
		// 끝점까지 이동하는데 걸리는 최소시간 계산
		bfs(start[0], start[1]);
		bw.write(Integer.toString(routeVal[end[0]][end[1]]));
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		Deque<Pos> deque = new LinkedList<>();
		deque.offer(new Pos(x, y));
		routeVal[x][y]=0;
		
		while(!deque.isEmpty()) {
			Pos pos = deque.pollFirst();
			x = pos.x;
			y = pos.y;
			
			// 다음 칸으로 이동
			for(int i=0;i<4;i++) {
				int nextX = x+moveX[i];
				int nextY = y+moveY[i];
				
				if(nextX<0||nextX>=H||nextY<0||nextY>=W||map[nextX][nextY]==INF) {
					continue;
				}
				
				// 벽을 따라 이동하는 경우인지 확인
				int moveCost=1;
				if(map[x][y]==0&&map[nextX][nextY]==0) {
					moveCost=0;
				}
				
				if(routeVal[nextX][nextY]>routeVal[x][y]+moveCost) {
					routeVal[nextX][nextY]=routeVal[x][y]+moveCost;
					
					if(moveCost==0) { // 벽을 타고 이동하는 경우
						deque.offerFirst(new Pos(nextX, nextY));
					} else { // 벽을 타고 이동하지 못하는 경우
						deque.offerLast(new Pos(nextX, nextY));
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