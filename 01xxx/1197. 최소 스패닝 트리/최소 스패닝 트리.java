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
		
		// 정점의 개수 V, 간선의 개수 E
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.valueOf(st.nextToken());
		int E = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[V];
		for(int i=0;i<V;i++) {
			parent[i]=i;
		}
		
		// 간선 입력
		ArrayList<Node> link = new ArrayList<>();
		while(E-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			int C = Integer.valueOf(st.nextToken());
			link.add(new Node(A, B, C));
		}
		Collections.sort(link);
		
		// 최소 스패닝 트리의 가중치 계산
		int cost=0;
		for(int i=0;i<link.size();i++) {
			if(union(link.get(i).start, link.get(i).end)) {
				cost += link.get(i).cost;
			}
		}
		
		bw.write(Integer.toString(cost));
		
		bw.close();
	} // end of main()
	
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
	
	static int find(int x) {
		if(x==parent[x]) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	} // end of find()
} // end of Main class

class Node implements Comparable<Node> {
	int start, end, cost;
	
	public Node(int start, int end, int cost) {
		this.start=start;
		this.end=end;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Node n) {
		return this.cost-n.cost;
	}
} // end of Node class