import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, 0, 0, -1};
	static int[] moveY = {0, 1, -1, 0};
	static int[][] map, mapIdx;
	static boolean[][] visited;
	static int[] parent;
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		
		// 지도의 크기
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		// 지도
		map = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// 섬 번호 라벨링
		visited = new boolean[N][M];
		mapIdx = new int[N][M];
		int idx=1;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(!visited[i][j]&&map[i][j]==1) {
					labeling(i, j, idx++);
				}
			}
		}
		
		// 만들 수 있는 다리의 종류
		PriorityQueue<Node> bridge = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==1) {
					
					// 왼쪽
					for(int k=j-1;k>=0;k--) {
						if(map[i][k]==0) {
							continue;
						}
						if(mapIdx[i][k]==mapIdx[i][j]||j-k-1<2) {
							break;
						}
						
						bridge.add(new Node(mapIdx[i][j], mapIdx[i][k], j-k-1));
						break;
					}
					
					// 오른쪽
					for(int k=j+1;k<M;k++) {
						if(map[i][k]==0) {
							continue;
						}
						if(mapIdx[i][k]==mapIdx[i][j]||k-j-1<2) {
							break;
						}
						
						bridge.add(new Node(mapIdx[i][j], mapIdx[i][k], k-j-1));
						break;
					}
					
					// 아래쪽
					for(int k=i+1;k<N;k++) {
						if(map[k][j]==0) {
							continue;
						}
						if(mapIdx[k][j]==mapIdx[i][j]||k-i-1<2) {
							break;
						}
						
						bridge.add(new Node(mapIdx[i][j], mapIdx[k][j], k-i-1));
						break;
					}
					
					// 위쪽
					for(int k=i-1;k>=0;k--) {
						if(map[k][j]==0) {
							continue;
						}
						if(mapIdx[k][j]==mapIdx[i][j]||i-k-1<2) {
							break;
						}
						
						bridge.add(new Node(mapIdx[i][j], mapIdx[k][j], i-k-1));
						break;
					}
				}
			}
		}
		
		// 다리 연결
		parent = new int[idx];
		for(int i=0;i<idx;i++) {
			parent[i]=i;
		}
		
		int connectCnt=0, minLength=0;
		while(!bridge.isEmpty()&&connectCnt<idx-2) {
			Node thisBridge = bridge.poll();
			
			if(union(thisBridge.start, thisBridge.end)) {
				connectCnt++;
				minLength += thisBridge.length;
			}
		}
		
		// 출력
		if(connectCnt!=idx-2) {
			bw.write("-1");
		} else {
			bw.write(Integer.toString(minLength));
		}
		
		bw.close();
	} // end of main()
	
	static void labeling(int x, int y, int idx) {
		 Queue<Pos> pos = new LinkedList<>();
		 pos.add(new Pos(x, y));
		 
		 while(!pos.isEmpty()) {
			 Pos cur = pos.poll();
			 visited[cur.x][cur.y]=true;
			 mapIdx[cur.x][cur.y]=idx;
			 
			 for(int i=0;i<4;i++) {
				 int nextX = cur.x + moveX[i];
				 int nextY = cur.y + moveY[i];
				 
				 if(nextX<0||nextX>=N||nextY<0||nextY>=M||visited[nextX][nextY]||map[nextX][nextY]==0) {
					 continue;
				 }
				 pos.add(new Pos(nextX, nextY));
			 }
		 }
	} // end of labeling()
	
	static int find(int x) {
		if(parent[x]==x) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	} // end of find()
	
	static boolean union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return false;
		} else if(x<y) {
			parent[y]=x;
		} else {
			parent[x]=y;
		}
		return true;
	} // end of union()
} // end of Main class

class Pos {
	int x, y;
	
	public Pos(int x, int y) {
		this.x=x;
		this.y=y;
	}
} // end of Pos class

class Node implements Comparable<Node> {
	int start, end, length;
	
	public Node(int start, int end, int length) {
		this.start=start;
		this.end=end;
		this.length=length;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.length-o.length;
	}
} // end of Node class