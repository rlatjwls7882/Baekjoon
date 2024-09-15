import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static LinkedList<Pos> queue = new LinkedList<>();

	static int M;
	static int N;
	static int endDay;
	static int[] moveX = {-1, 1, 0, 0};
	static int[] moveY = {0, 0, -1, 1};
	static boolean[][] visitList;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 상자의 가로 세로 크기 M N
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		
		// 상자 생성
		visitList = new boolean[N][M];
		map = new int[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<M;j++) {
				String state = st.nextToken();
				if(state.equals("0")) {
					visitList[i][j]=true;
					map[i][j]=-1;
				} else if(state.equals("1")) {
					queue.add(new Pos(i, j));
				}
			}
		}
		
		// 상자 속 모든 토마토가 익을 수 있는지 확인
		bfs();
		boolean allRipen=true;
		
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				if(map[i][j]==-1) {
					allRipen=false;
					i=N;
					break;
				}
		
		bw.write(allRipen?endDay+"":"-1");
		
		bw.close();
	} // end of main()
	
	static void bfs() {
		while(!queue.isEmpty()) {
			Pos pos = queue.poll();
			
			for(int i=0;i<4;i++) {
				int nextX = pos.x+moveX[i];
				int nextY = pos.y+moveY[i];
				
				// 왔던 칸이거나 상자를 벗어나는 경우
				if(nextX<0||nextX>=N||nextY<0||nextY>=M||!visitList[nextX][nextY])
					continue;
				
				// 다음에 방문할 칸
				queue.add(new Pos(nextX, nextY));
				map[nextX][nextY]=map[pos.x][pos.y]+1;
				visitList[nextX][nextY]=false;
			}
			
			// 갈 수 있는 모든 칸을 탐색한 경우
			if(queue.isEmpty()) {
				endDay=map[pos.x][pos.y];
				return;
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