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
		
		// 섬의 수 N, 다리의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());

		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}

		// 다리 입력
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			int C = Integer.valueOf(st.nextToken());
			pq.add(new Node(A, B, C));
		}
		
		// 공장과 섬의 위치
		st = new StringTokenizer(br.readLine());
		int x = Integer.valueOf(st.nextToken())-1;
		int y = Integer.valueOf(st.nextToken())-1;

		// 옮길 수 있는 최대 중량 계산
		int maxWeight = 1_000_000_000;
		for(int j=0;j<M;j++) {
			if(find(x)==find(y)) {
				break;
			}
			
			Node road = pq.poll();
			if(union(road.start, road.end)) {
				maxWeight = Math.min(maxWeight, road.weight);
			}
		}
		bw.write(Integer.toString(maxWeight));

		bw.close();
	} // end of main()

	static int find(int x) {
		if(x==parent[x]) {
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
	int start, end, weight;
	
	public Node(int start, int end, int weight) {
		this.start=start;
		this.end=end;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.weight-this.weight;
	}
} // end of Node class