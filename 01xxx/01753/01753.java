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
	static int INF = Integer.MAX_VALUE;
	static int[] routeVal;
	
	public static void main(String[] args) throws IOException {

		// 정점의 개수 V, 간선의 개수 E, 시작 정점의 번호 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.valueOf(st.nextToken());
		int E = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(br.readLine())-1;
		
		// 간선 입력
		for(int i=0;i<V;i++) {
			connect.add(new ArrayList<Node>());
		}
		
		while(E-->0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken())-1;
			int v = Integer.valueOf(st.nextToken())-1;
			int w = Integer.valueOf(st.nextToken());
			
			connect.get(u).add(new Node(v, w));
		}
		
		// 최단경로의 경로값 계산
		routeVal = new int[V];
		Arrays.fill(routeVal, INF);
		dijkstra(K);
		
		// 최단경로의 경로값 출력
		for(int val:routeVal) {
			if(val==INF) {
				bw.write("INF\n");
			} else {
				bw.write(Integer.toString(val));
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
	
	static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		routeVal[start]=0;
		
		while(!pq.isEmpty()) {
			Node curnode = pq.poll();
			start = curnode.pos;
			
			if(curnode.weight>routeVal[start]) {
				continue;
			}
			
			// 각각의 노드에 더 빨리 도착할 수 있는지 확인
			for(Node nextNode:connect.get(start)) {
				int end = nextNode.pos;
				
				if(routeVal[end] > routeVal[start]+nextNode.weight) {
					routeVal[end] = routeVal[start]+nextNode.weight;
					pq.add(new Node(end, routeVal[end]));
				}
			}
		}
		
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int pos, weight;
	
	public Node(int pos, int weight) {
		this.pos=pos;
		this.weight=weight;
	} // end of Node()
	
	@Override
	public int compareTo(Node n1) {
		return this.weight-n1.weight;
	} // end of compareTo()
} // end of class Node