import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			
			// 교차로의 수 n, 거리의 수 m
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			
			// 초기화
			parent = new int[n];
			for(int j=0;j<n;j++) {
				parent[j]=j;
			}
			
			// 거리 입력
			PriorityQueue<Node> pq = new PriorityQueue<>();
			for(int j=0;j<m;j++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.valueOf(st.nextToken())-1;
				int end = Integer.valueOf(st.nextToken())-1;
				int weight = Integer.valueOf(st.nextToken());
				pq.add(new Node(start, end, weight));
			}
			
			// 운송할 수 있는 최대 중량 계산
			int maxWeight = 1000000;
			for(int j=0;j<m;j++) {
				Node road = pq.poll();
				if(find(0)==find(n-1)) {
					break;
				}
				if(union(road.start, road.end)) {
					maxWeight = Math.min(maxWeight, road.weight);
				}
			}
			
			// 출력
			bw.write(String.format("Scenario #%d:\n", i));
			bw.write(String.format("%d\n\n", maxWeight));
		}
		
		bw.close();
	} // end of main()
	
	static int find(int x) {
		if(x==parent[x]) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	} // end of find()
	
	static boolean union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return false;
		} else if(x<y) {
			parent[y]=x;
		} else {
			parent[x]=y;
		}
		return true;
	} // end of union()
} // end of Main class

class Node implements Comparable<Node> {
	int start, end, weight;
	
	public Node(int start, int end, int weight) {
		this.start=start;
		this.end=end;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.weight-this.weight;
	}
} // end of Node class