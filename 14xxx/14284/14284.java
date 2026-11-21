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
	static int[] routeVal;
	static int t;
	
	public static void main(String[] args) throws IOException {

		// 정점의 개수 n, 간선의 개수 m
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// 간선 입력
		for(int i=0;i<=n;i++) {
			connect.add(new ArrayList<>());
		}
		
		while(m-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			
			connect.get(a).add(new Node(b, c));
			connect.get(b).add(new Node(a, c));
		}
		
		// s와 t 사이의 최소 가중치 계산
		st = new StringTokenizer(br.readLine());
		int s = Integer.valueOf(st.nextToken());
		t = Integer.valueOf(st.nextToken());
		
		routeVal = new int[n+1];
		Arrays.fill(routeVal, Integer.MAX_VALUE);
		dijkstra(s);
		
		bw.write(Integer.toString(routeVal[t]));
		bw.close();
	} // end of main()
	
	static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		routeVal[start]=0;
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			start = curNode.arrival;
			
			if(curNode.weight>routeVal[t]) {
				return;
			}
			if(curNode.weight>routeVal[start]) {
				continue;
			}
			
			for(Node nextNode:connect.get(start)) {
				int end = nextNode.arrival;
				
				if(routeVal[end] > routeVal[start]+nextNode.weight) {
					routeVal[end] = routeVal[start]+nextNode.weight;
					pq.add(new Node(end, routeVal[end]));
				}
			}
		}
		
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int arrival, weight;
	
	public Node(int arrival, int weight) {
		this.arrival=arrival;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(Node n1) {
		return this.weight-n1.weight;
	}
} // end of Node class