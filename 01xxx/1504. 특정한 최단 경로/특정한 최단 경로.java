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
	
	static ArrayList<ArrayList<Node>> connect = new ArrayList<>();
	static int INF = 2_000_000;
	static boolean[] visited;
	static int[] routeVal;
	
	public static void main(String[] args) throws IOException {
		
		// 정점의 개수 N, 간선의 개수 E
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int E = Integer.valueOf(st.nextToken());
		
		// 양방향 간선 입력
		for(int i=0;i<N;i++) {
			connect.add(new ArrayList<>());
		}
		
		while(E-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			int c = Integer.valueOf(st.nextToken());
			
			connect.get(a).add(new Node(b, c));
			connect.get(b).add(new Node(a, c));
		}
		
		// 반드시 방문해야 하는 두 정점 v1 v2
		st = new StringTokenizer(br.readLine());
		int v1 = Integer.valueOf(st.nextToken())-1;
		int v2 = Integer.valueOf(st.nextToken())-1;
		
		routeVal = new int[N];
		visited = new boolean[N];
		
		// 방법 1) 1 -> v1 -> v2 -> N
		int case1 = dijkstra(0, v1)+dijkstra(v1, v2)+dijkstra(v2, N-1);
		
		// 방법 2) 1 -> v2 -> v1 -> N
		int case2 = dijkstra(0, v2)+dijkstra(v2, v1)+dijkstra(v1, N-1);
		
		// v1과 v2를 거치고 N에 도달하는 최단 경로 계산
		if(case1>=INF&&case2>=INF) {
			bw.write("-1");
		} else if(case1<case2) {
			bw.write(Integer.toString(case1));
		} else {
			bw.write(Integer.toString(case2));
		}

		bw.close();
	} // end of main()
	
	static int dijkstra(int start, int end) {
		Arrays.fill(routeVal, INF);
		Arrays.fill(visited, false);
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		routeVal[start]=0;
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			start = curNode.end;
			visited[start]=true;
			
			for(Node nextNode:connect.get(start)) {
				int arrival = nextNode.end;
				
				if(!visited[arrival]&&routeVal[arrival] > routeVal[start]+nextNode.cost) {
					routeVal[arrival] = routeVal[start]+nextNode.cost;
					pq.add(new Node(arrival, routeVal[arrival]));
				}
			}
		}
		
		return routeVal[end];
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int end, cost;
	
	public Node(int end, int cost) {
		this.end=end;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Node node) {
		return this.cost-node.cost;
	}
} // end of Node class