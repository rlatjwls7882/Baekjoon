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
	static ArrayList<ArrayList<Edge>> link = new ArrayList<>();
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.valueOf(br.readLine());
		for(int i=0;i<=N;i++) {
			link.add(new ArrayList<Edge>());
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		int M = Integer.valueOf(br.readLine());
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int D = Integer.valueOf(st.nextToken());
			int E = Integer.valueOf(st.nextToken());
			int L = Integer.valueOf(st.nextToken());
			link.get(D).add(new Edge(E, L));
			link.get(E).add(new Edge(D, L));
		}
		
		int[] distA = search(A);
		int[] distB = search(B);
		int[] distC = search(C);
		
		int max=0, idx=0;
		for(int i=1;i<=N;i++) {
			int cost = Math.min(Math.min(distA[i], distB[i]), distC[i]);
			if(cost>max) {
				max=cost;
				idx=i;
			}
		}
		bw.write(Integer.toString(idx));
		
		bw.close();
	} // end of main()
	
	static int[] search(int start) {
		boolean[] visited = new boolean[N+1];
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(new Node(start, 0));
		int[] dist = new int[N+1];
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			
			if(visited[curNode.end]) {
				continue;
			}
			visited[curNode.end]=true;
			dist[curNode.end] = Math.max(dist[curNode.end], curNode.cost);;
			
			for(Edge next:link.get(curNode.end)) {
				if(!visited[next.end]) {
					pq.add(new Node(next.end, curNode.cost+next.cost));
				}
			}
		}
		return dist;
	}
} // end of Main class

class Edge {
	int end, cost;
	public Edge(int end, int cost) {
		this.end=end;
		this.cost=cost;
	}
}

class Node implements Comparable<Node> {
	int end, cost;
	public Node(int end, int cost) {
		this.end=end;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.cost-o.cost;
	}
}