import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, 0, -1, 0};
	static int[] moveY = {0, 1, 0, -1};
	static boolean[][] visited;
	static int[][] map;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		
		for(int cases=1;;cases++) {
			
			// 동굴의 크기 N
			N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			// 동굴의 지도 입력
			map = new int[N][N];
			
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int j=0;j<N;j++) {
					map[i][j] = Integer.valueOf(st.nextToken());
				}
			}
			
			// 링크가 잃는 최소 금액 계산
			visited = new boolean[N][N];
			dijkstra();
			bw.write(String.format("Problem %d: %d\n", cases, map[N-1][N-1]));
		}
		
		bw.close();
	} // end of main()
	
	static void dijkstra() {
		int[][] lose = new int[N][N];
		for(int i=0;i<N;i++) {
			Arrays.fill(lose[i], 100_000_000);
		}
		lose[0][0]=map[0][0];
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0, 0, map[0][0]));
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			int curX = curNode.posx;
			int curY = curNode.posy;
			
			if(visited[curX][curY]) {
				continue;
			}
			if(curX==N-1&&curY==N-1) {
				map[N-1][N-1]=curNode.cost;
				return;
			}
			visited[curX][curY]=true;
			
			for(int i=0;i<4;i++) {
				int nextX = curX+moveX[i];
				int nextY = curY+moveY[i];
				
				if(nextX<0||nextX>=N||nextY<0||nextY>=N||visited[nextX][nextY]) {
					continue;
				}
				
				if(lose[nextX][nextY]>curNode.cost+map[nextX][nextY]) {
					lose[nextX][nextY]=curNode.cost+map[nextX][nextY];
					pq.add(new Node(nextX, nextY, lose[nextX][nextY]));
				}
			}
		}
		
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int posx, posy, cost;
	
	public Node(int posx, int posy, int cost) {
		this.posx=posx;
		this.posy=posy;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Node node) {
		return this.cost-node.cost;
	}
} // end of Node class