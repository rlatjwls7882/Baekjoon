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
	static boolean[] visited = new boolean[1001];
	static int[] routeVal = new int[1001];
	static int INF = 100_000_000;
	
	public static void main(String[] args) throws IOException {
		
		// 도시의 개수 n, 버스의 수 m
		int n = Integer.valueOf(br.readLine());
		int m = Integer.valueOf(br.readLine());
		
		// 각각의 버스의 출발지와 도착지, 비용 입력
		for(int i=0;i<=n;i++) {
			connect.add(new ArrayList<Node>());
		}
		
		while(m-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.valueOf(st.nextToken());
			int end = Integer.valueOf(st.nextToken());
			int cost = Integer.valueOf(st.nextToken());
			
			connect.get(start).add(new Node(end, cost));
		}
		
		// 도착도시까지 가는데 드는 최소비용 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.valueOf(st.nextToken());
		int end = Integer.valueOf(st.nextToken());
		
		Arrays.fill(routeVal, INF);
		Node endNode = dijkstra(start, end);
		
		// 최소비용, 도시의 개수와 목록 출력
		bw.write(Integer.toString(endNode.time));
		bw.newLine();
		bw.write(Integer.toString(endNode.visit.size()));
		bw.newLine();
		
		for(int val:endNode.visit) {
			bw.write(Integer.toString(val));
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
	
	static Node dijkstra(int start, int end) {
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		routeVal[start]=0;

		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			start = curNode.end;
			visited[start]=true;

			if(visited[end]) {
				return curNode;
			}
			
			for(Node nextNode:connect.get(start)) {
				int next = nextNode.end;
				
				if(routeVal[next] > routeVal[start]+nextNode.time) {
					routeVal[next] = routeVal[start]+nextNode.time;
					
					Node offer = new Node(next, routeVal[next], curNode.visit);
					pq.offer(offer);
				}
			}
		}
		
		return new Node(end, 0);
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int end, time;
	ArrayList<Integer> visit = new ArrayList<>();
	
	public Node(int end, int time) {
		this.end=end;
		this.time=time;
		this.visit.add(end);
	}
	
	public Node(int end, int time, ArrayList<Integer> visit) {
		this.end=end;
		this.time=time;
		this.visit.addAll(visit);
		this.visit.add(end);
	}
	
	@Override
	public int compareTo(Node node) {
		return this.time-node.time;
	}
} // end of Node class