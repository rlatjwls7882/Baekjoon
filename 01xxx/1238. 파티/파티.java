import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int INF = 1_000_000_000;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		// 마을의 수 N, 도로의 수 M, 모이는 장소 X
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int X = Integer.valueOf(st.nextToken());
		
		// 초기화
		ArrayList<ArrayList<Node>> fromX = new ArrayList<>();
		ArrayList<ArrayList<Node>> toX = new ArrayList<>();
		
		for(int i=0;i<=N;i++) {
			fromX.add(new ArrayList<>());
			toX.add(new ArrayList<>());
		}
		
		// 도로 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			
			fromX.get(A).add(new Node(B, C));
			toX.get(B).add(new Node(A, C));
		}
		
		// 모든 집에서 X로 가는 시간 t1, X에서 모든 집으로 가는 시간 t2
		int[] t1 = dijkstra(X, fromX);
		int[] t2 = dijkstra(X, toX);
		
		// 학생들 중 왕복하는데 가장 오래 걸리는 학생의 소요 시간 계산
		int max=0;
		for(int i=1;i<=N;i++) {
			if(max<t1[i]+t2[i]) {
				max=t1[i]+t2[i];
			}
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
	
	static int[] dijkstra(int start, ArrayList<ArrayList<Node>> route) {
		boolean[] visited = new boolean[N+1];
		int[] cost = new int[N+1];
		Arrays.fill(cost, INF);
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		cost[start]=0;
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			start = curNode.pos;
			
			if(visited[start]) {
				continue;
			}
			visited[start]=true;
			
			for(Node nextNode:route.get(start)) {
				int next = nextNode.pos;
				
				if(!visited[next]&&cost[next]>cost[start]+nextNode.cost) {
					cost[next]=cost[start]+nextNode.cost;
					pq.add(new Node(next, cost[next]));
				}
			}
		}
		
		return cost;
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int pos, cost;
	
	public Node(int pos, int cost) {
		this.pos=pos;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Node node) {
		return this.cost-node.cost;
	}
} // end of Node class