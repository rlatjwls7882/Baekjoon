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
	static int INF = Integer.MAX_VALUE, B;
	static int[] routeVal;
	
	public static void main(String[] args) throws IOException {

		// 도시의 수 N, 버스의 수 M
		int N = Integer.valueOf(br.readLine());
		int M = Integer.valueOf(br.readLine());
		
		// 버스의 정보 입력
		for(int i=0;i<N;i++) {
			connect.add(new ArrayList<Node>());
		}
		
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.valueOf(st.nextToken())-1;
			int arrive = Integer.valueOf(st.nextToken())-1;
			int cost = Integer.valueOf(st.nextToken());
			
			connect.get(start).add(new Node(arrive, cost));
		}
		
		// A에서 B까지 도달하는데 걸리는 최소 비용 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken())-1;
		B = Integer.valueOf(st.nextToken())-1;
		
		routeVal = new int[N];
		Arrays.fill(routeVal, INF);
		dijkstra(A);
		
		// 최단경로의 경로값 출력
		bw.write(Integer.toString(routeVal[B]));
		
		bw.close();
	} // end of main()
	
	static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		routeVal[start]=0;
		
		while(!pq.isEmpty()) {
			Node curnode = pq.poll();
			start = curnode.pos;
			
			if(curnode.cost>=routeVal[B]) {
				return;
			}
			
			// 각각의 노드에 더 빨리 도착할 수 있는지 확인
			for(Node nextNode:connect.get(start)) {
				int arrival = nextNode.pos;
				
				if(routeVal[arrival] > routeVal[start]+nextNode.cost) {
					routeVal[arrival] = routeVal[start]+nextNode.cost;
					pq.add(new Node(arrival, routeVal[arrival]));
				}
			}
		}
		
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int pos, cost;
	
	public Node(int pos, int cost) {
		this.pos=pos;
		this.cost=cost;
	} // end of Node()
	
	@Override
	public int compareTo(Node n1) {
		return this.cost-n1.cost;
	} // end of compareTo()
} // end of class Node