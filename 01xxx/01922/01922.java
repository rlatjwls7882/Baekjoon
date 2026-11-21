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
	static ArrayList<ArrayList<Node>> computer;
	
	public static void main(String[] args) throws IOException {
		
		// 컴퓨터의 수 N, 선의 수 M
		int N = Integer.valueOf(br.readLine());
		int M = Integer.valueOf(br.readLine());
		
		// 선 입력
		computer = new ArrayList<>();
		for(int i=0;i<N;i++) {
			computer.add(new ArrayList<>());
		}
		
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			int c = Integer.valueOf(st.nextToken());
			computer.get(a).add(new Node(b, c));
			computer.get(b).add(new Node(a, c));
		}
		
		// 프림 알고리즘으로 모든 컴퓨터를 연결하는 최소비용 계산
		int totalCost = prim(N);
		bw.write(Integer.toString(totalCost));
		
		bw.close();
	} // end of main()
	
	static int prim(int N) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[N];
		pq.add(new Node(0, 0));
		int totalCost=0;
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			if(visited[node.end]) {
				continue;
			}
			
			totalCost += node.cost;
			visited[node.end]=true;
			
			for(Node target:computer.get(node.end)) {
				if(!visited[target.end]) {
					pq.add(target);
				}
			}
		}
		
		return totalCost;
	} // end of prim()
} // end of Main class

class Node implements Comparable<Node> {
	int end, cost;
	
	public Node(int end, int cost) {
		this.end=end;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Node node) {
		return this.cost-node.cost;
	}
} // end of Node class