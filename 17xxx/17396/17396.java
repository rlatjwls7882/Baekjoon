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
	static boolean[] opponant;
	static long[] routeVal;
	static int N;
	
	public static void main(String[] args) throws IOException {

		// 분기점의 수 N, 길의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 상대가 있는 곳 확인
		st = new StringTokenizer(br.readLine());
		opponant = new boolean[N];
		
		for(int i=0;i<N;i++) {
			if(st.nextToken().equals("1")) {
				opponant[i]=true;
			}
		}
		opponant[0]=opponant[N-1]=false;
		
		// 길 목록 입력
		for(int i=0;i<N;i++) {
			connect.add(new ArrayList<>());
		}
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			
			connect.get(a).add(new Node(b, c));
			connect.get(b).add(new Node(a, c));
		}
		
		// 상대 넥서스까지 안들키고 가는 최소 시간 계산
		routeVal = new long[N];
		Arrays.fill(routeVal, Long.MAX_VALUE);
		dijkstra();
		
		if(routeVal[N-1]==Long.MAX_VALUE) {
			bw.write("-1");
		} else {
			bw.write(Long.toString(routeVal[N-1]));
		}
		
		bw.close();
	} // end of main()
	
	static void dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0, 0));
		routeVal[0]=0;
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			int start = curNode.arrival;
			
			if(curNode.weight>routeVal[N-1]) {
				return;
			}
			if(curNode.weight>routeVal[start]) {
				continue;
			}

			for(Node nextNode:connect.get(start)) {
				int end = nextNode.arrival;

				if(!opponant[end]&&routeVal[end] > routeVal[start]+nextNode.weight) {
					routeVal[end] = routeVal[start]+nextNode.weight;
					pq.add(new Node(end, routeVal[end]));
				}
			}
		}
		
	} // end of dijkstra()
} // end of Main class

class Node implements Comparable<Node> {
	int arrival;
	long weight;
	
	public Node(int arrival, long weight) {
		this.arrival=arrival;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(Node n1) {
		if(this.weight>n1.weight) {
			return 1;
		} else if(this.weight==n1.weight) {
			return 0;
		} else {
			return -1;
		}
	}
} // end of Node class