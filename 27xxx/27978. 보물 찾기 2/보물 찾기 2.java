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
	static int[] moveX = {1, 0, -1, 1, -1, 1, 0, -1};
	static int[] moveY = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int H, W, INF=1_000_000_000;
	static int[][] map, routeVal;
	
	public static void main(String[] args) throws IOException {

		// 맵의 크기 H*W
		StringTokenizer st = new StringTokenizer(br.readLine());
		H = Integer.valueOf(st.nextToken());
		W = Integer.valueOf(st.nextToken());
		
		// 초기화
		map = new int[H][W];
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
				if(string.charAt(j)=='K') { // 배의 위치
					start[0]=i;
					start[1]=j;
				} else if(string.charAt(j)=='*') { // 보물의 위치
					end[0]=i;
					end[1]=j;
				} else if(string.charAt(j)=='#') { // 암초의 위치
					map[i][j]=INF;
				}
			}
		}
		
		// 보물을 찾기까지 소모하는 연료의 최솟값 계산
		bfs(start[0], start[1]);
		
		if(routeVal[end[0]][end[1]]==INF) {
			bw.write("-1");
		} else {
			bw.write(Integer.toString(routeVal[end[0]][end[1]]));
		}
		
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
			for(int i=0;i<8;i++) {
				int nextX = x+moveX[i];
				int nextY = y+moveY[i];
				
				if(nextX<0||nextX>=H||nextY<0||nextY>=W||map[nextX][nextY]==INF) {
					continue;
				}
				
				// 연료를 사용하는지 확인
				int moveCost=0;
				if(i<5) {
					moveCost=1;
				}
				
				if(routeVal[nextX][nextY]>routeVal[x][y]+moveCost) {
					routeVal[nextX][nextY]=routeVal[x][y]+moveCost;
					
					if(moveCost==0) { // 연료 사용X
						deque.offerFirst(new Pos(nextX, nextY));
					} else { // 연료 사용
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