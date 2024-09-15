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
	static int INF = 100_000;
	static boolean[] visited = new boolean[200001];
	static int[] routeVal = new int[200001];
	
	public static void main(String[] args) throws IOException {
		
		// 수빈이의 위치 N, 동생의 위치 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());

		// 수빈이가 동생을 찾는 가장 빠른 시간 계산
		Arrays.fill(routeVal, INF);
		dijkstra(N, K);
		
		bw.write(Integer.toString(routeVal[K]));
		
		bw.close();
	} // end of main()
	
	static void dijkstra(int start, int end) {
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		routeVal[start]=0;

		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			start = curNode.end;
			visited[start]=true;

			if(visited[end]) {
				return;
			}
			
			// +1
			int arrival = start+1;
			if(start<end&&!visited[arrival]&&routeVal[arrival] > routeVal[start]+1) {
				routeVal[arrival] = routeVal[start]+1;
				pq.add(new Node(arrival, routeVal[arrival]));
			}

			// -1
			arrival = start-1;
			if(start>0&&!visited[arrival]&&routeVal[arrival] > routeVal[start]+1) {
				routeVal[arrival] = routeVal[start]+1;
				pq.add(new Node(arrival, routeVal[arrival]));
			}

			// *2
			arrival = start*2;
			if(start<end&&!visited[arrival]&&routeVal[arrival] > routeVal[start]) {
				routeVal[arrival] = routeVal[start];
				pq.add(new Node(arrival, routeVal[arrival]));
			}
		}
		
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int end, time;
	
	public Node(int end, int time) {
		this.end=end;
		this.time=time;
	}
	
	@Override
	public int compareTo(Node node) {
		return this.time-node.time;
	}
} // end of Node class