import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static int[][] room, routeVal;
	static int N, M;
	
	public static void main(String[] args) throws IOException {

		// 미로의 크기 N*M
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		
		// 초기화
		room = new int[N][M];
		routeVal = new int[N][M];
		
		for(int i=0;i<N;i++) {
			Arrays.fill(routeVal[i], 1_000_000_000);
		}
		routeVal[0][0]=0;
		
		// 벽 입력
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			
			for(int j=0;j<M;j++) {
				if(string.charAt(j)=='1') {
					room[i][j]=1;
				}
			}
		}
		
		// (N, M)으로 이동하면서 부수는 벽의 최소 개수 계산
		bfs();
		bw.write(Integer.toString(routeVal[N-1][M-1]));
		
		bw.close();
	} // end of main()
	
	static void bfs() {
		Deque<Node> deque = new ArrayDeque<>();
		deque.offer(new Node(0, 0));
		
		while(!deque.isEmpty()) {
			Node curNode = deque.pollFirst();
			int x = curNode.x;
			int y = curNode.y;
			
			for(int i=0;i<4;i++) {
				int nextX = x+moveX[i];
				int nextY = y+moveY[i];
				
				if(nextX<0||nextX>=N||nextY<0||nextY>=M) {
					continue;
				}
				
				if(routeVal[nextX][nextY]>routeVal[x][y]+room[nextX][nextY]) {
					routeVal[nextX][nextY]=routeVal[x][y]+room[nextX][nextY];
					
					if(room[nextX][nextY]==1) {
						deque.offerLast(new Node(nextX, nextY));
					} else {
						deque.offerFirst(new Node(nextX, nextY));
					}
				}
			}
		}
		
	} // end of bfs()
} // end of Main class

class Node {
	int x, y;
	
	public Node(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
} // end of Node class