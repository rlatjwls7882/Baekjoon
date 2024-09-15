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
	static ArrayList<ArrayList<Node>> road = new ArrayList<>();
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		
		// 지점의 개수 p, 길의 개수 w
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p = Integer.valueOf(st.nextToken());
		int w = Integer.valueOf(st.nextToken());
		
		// Baekjoon World의 수도 c, Cube World의 수도 v
		st = new StringTokenizer(br.readLine());
		int c = Integer.valueOf(st.nextToken());
		int v = Integer.valueOf(st.nextToken());
		
		// 초기화
		for(int i=0;i<p;i++) {
			road.add(new ArrayList<>());
		}
		visited = new boolean[p];
		
		// 길 입력
		while(w-->0) {
			st = new StringTokenizer(br.readLine());
			int wStart = Integer.valueOf(st.nextToken());
			int wEnd = Integer.valueOf(st.nextToken());
			int wWidth = Integer.valueOf(st.nextToken());
			road.get(wStart).add(new Node(wEnd, wWidth));
			road.get(wEnd).add(new Node(wStart, wWidth));
		}
		
		// 가장 좁은 길의 너비의 최대값 계산
		int maxWidth = dijkstra(c, v);
		
		bw.write(Integer.toString(maxWidth));
		
		bw.close();
	} // end of main()
	
	static int dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 1000));
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			start = curNode.end;
			
			if(start==end) {
				return curNode.cost;
			}
			if(visited[start]) {
				continue;
			}
			visited[start]=true;
			
			for(Node nextNode:road.get(start)) {
				if(!visited[nextNode.end]) {
					pq.add(new Node(nextNode.end, Math.min(curNode.cost, nextNode.cost)));
				}
			}
		}
		return 0;
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int end, cost;
	
	public Node(int end, int cost) {
		this.end=end;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.cost-this.cost;
	}
} // end of Node class