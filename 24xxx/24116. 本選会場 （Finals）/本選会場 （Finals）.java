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
		
		// 도시의 수 N, 도로의 수 M, 본선을 개최하는 도시의 수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 도로 입력
		PriorityQueue<Node> road = new PriorityQueue<>();
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			int C = Integer.valueOf(st.nextToken());
			road.add(new Node(A, B, C));
		}
		
		// 모든 선수를 본선 회장에 모을 때 드는 최소 비용 계산
		int cost=0;
		N -= K;
		while(N>0) {
			Node curRoad = road.poll();
			if(union(curRoad.start, curRoad.end)) {
				cost += curRoad.cost;
				N--;
			}
		}
		bw.write(Integer.toString(cost));
		
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