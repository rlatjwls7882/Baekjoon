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
	static ArrayList<ArrayList<Node>> connect;
	static int INF = 1_000_000_000;
	static boolean[] visited;
	static int[] routeVal;
	
	public static void main(String[] args) throws IOException {

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 컴퓨터 개수 n, 의존성 개수 d, 해킹당한 컴퓨터의 번호 c
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int d = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken())-1;
			
			// 초기화
			visited = new boolean[n];
			routeVal = new int[n];
			Arrays.fill(routeVal, INF);
			
			connect = new ArrayList<>();
			for(int i=0;i<n;i++) {
				connect.add(new ArrayList<Node>());
			}
			
			// d개의 의존성 입력
			while(d-->0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.valueOf(st.nextToken())-1;
				int b = Integer.valueOf(st.nextToken())-1;
				int s = Integer.valueOf(st.nextToken());
				connect.get(b).add(new Node(a, s));
			}
			
			// 감염되는 컴퓨터의 수와 걸리는 시간 계산
			dijkstra(c);
			
			int cnt=0, max=0;
			for(int i=0;i<n;i++) {
				if(routeVal[i]!=INF) {
					if(max<routeVal[i]) {
						max=routeVal[i];
					}
					cnt++;
				}
			}
			
			bw.write(Integer.toString(cnt));
			bw.write(' ');
			bw.write(Integer.toString(max));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
	
	static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		routeVal[start]=0;
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			start = curNode.pos;
			
			if(visited[start]) {
				continue;
			}
			visited[start]=true;
			
			for(Node nextNode:connect.get(start)) {
				int next = nextNode.pos;
				
				if(!visited[next]&&routeVal[next]>routeVal[start]+nextNode.cost) {
					routeVal[next]=routeVal[start]+nextNode.cost;
					pq.add(new Node(next, routeVal[next]));
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
	}
	
	@Override
	public int compareTo(Node node) {
		return this.cost-node.cost;
	}
}