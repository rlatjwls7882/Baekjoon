import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		// 농장의 개수 N, 설치 가능한 파이프의 최소비용 C
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 농장의 위치
		int[][] pos = new int[N][2];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			pos[i][0] = Integer.valueOf(st.nextToken());
			pos[i][1] = Integer.valueOf(st.nextToken());
		}
		
		// 모든 파이프
		PriorityQueue<Node> pipes = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				pipes.add(new Node(i, j, (int)(Math.pow(pos[i][0]-pos[j][0], 2) + Math.pow(pos[i][1]-pos[j][1], 2))));
			}
		}
		
		// 모든 농장을 연결하는 파이프의 최소 비용 계산
		int minCost=0;
		while(N>1&&!pipes.isEmpty()) {
			Node curPipe = pipes.poll();
			if(curPipe.cost>=C&&union(curPipe.start, curPipe.end)) {
				minCost += curPipe.cost;
				N--;
			}
		}
		
	        // 출력
		if(N==1) {
			bw.write(Integer.toString(minCost));
		} else {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
	
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

class Node implements Comparable<Node> {
	int start, end, cost;
	
	public Node(int start, int end, int cost) {
		this.start=start;
		this.end=end;
		this.cost=cost;
	}
	
	public int compareTo(Node o) {
		return this.cost-o.cost;
	}
} // end of Node class
