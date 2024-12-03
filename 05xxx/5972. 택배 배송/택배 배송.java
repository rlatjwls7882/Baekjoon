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
	static int INF = Integer.MAX_VALUE, N;
	static int[] routeVal;
	
	public static void main(String[] args) throws IOException {

		// 헛간의 수 N, 헛간 사이의 길의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 헛간 사이의 길 입력
		for(int i=0;i<N;i++) {
			connect.add(new ArrayList<Node>());
		}
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.valueOf(st.nextToken())-1;
			int arrive = Integer.valueOf(st.nextToken())-1;
			int cost = Integer.valueOf(st.nextToken());
			
			connect.get(start).add(new Node(arrive, cost));
			connect.get(arrive).add(new Node(start, cost));
		}
		
		// 1에서 N까지 도달하는데 필요한 최소 여물 계산
		routeVal = new int[N];
		Arrays.fill(routeVal, INF);
		dijkstra();
		
		// 최단경로의 경로값 출력
		bw.write(Integer.toString(routeVal[N-1]));
		
		bw.close();
	} // end of main()
	
	static void dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(0, 0));
		routeVal[0]=0;
		
		while(!pq.isEmpty()) {
			Node curnode = pq.poll();
			int start = curnode.pos;
			
			if(curnode.cost>=routeVal[N-1]) {
				return;
			}
			
			// 각각의 노드에 더 적은 비용으로 도착할 수 있는지 확인
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