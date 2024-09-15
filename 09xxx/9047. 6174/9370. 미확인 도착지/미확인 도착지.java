import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Node>> connect;
	static int INF = Integer.MAX_VALUE;
	static boolean[] visited;
	static int[] routeVal;
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 교차로의 수 n, 도로의 수 m, 목적지 후보의 수 t
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			int t = Integer.valueOf(st.nextToken());
			
			// 출발지 s, 지나간 두 지점 g h
			st = new StringTokenizer(br.readLine());
			int s = Integer.valueOf(st.nextToken());
			int g = Integer.valueOf(st.nextToken());
			int h = Integer.valueOf(st.nextToken());
			
			// 초기화
			connect = new ArrayList<>();
			visited = new boolean[n+1];
			routeVal = new int[n+1];
			
			// m개의 양방향 도로 입력
			for(int i=0;i<=n;i++) {
				connect.add(new ArrayList<>());
			}
			
			while(m-->0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.valueOf(st.nextToken());
				int b = Integer.valueOf(st.nextToken());
				int d = Integer.valueOf(st.nextToken());
				
				connect.get(a).add(new Node(b, d));
				connect.get(b).add(new Node(a, d));
			}
			
			// 가능한 목적지 계산
			TreeSet<Integer> goalList = new TreeSet<>();
			while(t-->0) {
				int goal = Integer.valueOf(br.readLine());
				
				// case1 : s -> goal
				int case1 = dijkstra(s, goal);
				
				// case2 : s -> g -> h -> goal
				int case2 = dijkstra(s, g)+dijkstra(g, h)+dijkstra(h, goal);
				
				// case3 : s -> h -> g -> goal
				int case3 = dijkstra(s, h)+dijkstra(h, g)+dijkstra(g, goal);
				
				// s와 h를 지나갈 때가 최단 거리인 경우
				if(case2==case1||case3==case1) {
					goalList.add(goal);
				}
			}
			
			// 가능한 목적지 출력
			for(int goal:goalList) {
				bw.write(Integer.toString(goal));
				bw.write(' ');
			}
			
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
	
	static int dijkstra(int start, int end) {
		Arrays.fill(visited, false);
		Arrays.fill(routeVal, INF);
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(new Node(start, 0));
		routeVal[start]=0;
		
		while(!pq.isEmpty()) {
			Node startNode = pq.poll();
			start = startNode.pos;
			visited[start]=true;
			
			if(visited[end]) {
				return routeVal[end];
			}
			
			for(Node nextNode:connect.get(start)) {
				int next = nextNode.pos;
				
				if(!visited[next]&&routeVal[next]>routeVal[start]+nextNode.cost) {
					routeVal[next]=routeVal[start]+nextNode.cost;
					pq.add(new Node(next, routeVal[next]));
				}
			}
		}
		
		return routeVal[end];
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