import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Node>> connect;
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		connect = new ArrayList<>();
		for(int i=0;i<N;i++) {
			connect.add(new ArrayList<>());
		}
		
		// 간선 입력
		for(int i=0;i<N-1;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			long C = Long.valueOf(st.nextToken());
			connect.get(A).add(new Node(B, C));
			connect.get(B).add(new Node(A, C));
		}
		
		// 숨기려는 방까지 이동하는 거리 계산
		long dist = dijkstra(N);
		bw.write(Long.toString(dist));
		
		bw.close();
	} // end of main()
	
	static long dijkstra(int N) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[N];
		pq.add(new Node(0, 0));
		long dist=0;
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			
			if(visited[node.end]) {
				continue;
			}
			visited[node.end]=true;
			
			for(Node nextNode:connect.get(node.end)) {
				if(!visited[nextNode.end]) {
					pq.add(new Node(nextNode.end, node.cost+nextNode.cost));
				}
			}
			dist = Math.max(dist, node.cost);
		}
		
		return dist;
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int end;
	long cost;
	
	public Node(int end, long cost) {
		this.cost=cost;
		this.end=end;
	}
	
	@Override
	public int compareTo(Node o) {
		if(o.cost>this.cost) {
			return 1;
		} else if(o.cost<this.cost) {
			return -1;
		} else {
			return 0;
		}
	}
} // end of Node class