import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		// 건물의 개수 N, 도로의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 도로 입력
		ArrayList<Node> road = new ArrayList<>();
		for(int i=0;i<=M;i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			if(st.nextToken().equals("1")) {
				road.add(new Node(A, B, 0));
			} else {
				road.add(new Node(A, B, 1));
			}
		}
		Collections.sort(road);
		
		// 최악의 경로 계산
		parent = new int[N+1];
		for(int i=0;i<=N;i++) {
			parent[i]=i;
		}
		
		int worstCost=0;
		for(int i=M;i>=0;i--) {
			if(union(road.get(i).start, road.get(i).end)) {
				worstCost+=road.get(i).cost;
			}
		}
		
		// 최적의 경로 계산
		parent = new int[N+1];
		for(int i=0;i<=N;i++) {
			parent[i]=i;
		}
		
		int bestCost=0;
		for(int i=0;i<=M;i++) {
			if(union(road.get(i).start, road.get(i).end)) {
				bestCost+=road.get(i).cost;
			}
		}
		
		// 최악의 경로와 최적의 경로 간 피로도의 차이 계산
		bw.write(Integer.toString(worstCost*worstCost-bestCost*bestCost));
		
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
	int start, end, cost;
	
	public Node(int start, int end, int cost) {
		this.start=start;
		this.end=end;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Node node) {
		return this.cost-node.cost;
	}
} // end of Node class