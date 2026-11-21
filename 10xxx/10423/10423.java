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
		
		// 도시의 개수 N, 설치 가능한 케이블의 수 M, 발전소의 개수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N+1];
		for(int i=0;i<=N;i++) {
			parent[i]=i;
		}
		
		// 발전소가 설치된 도시
		st = new StringTokenizer(br.readLine());
		while(K-->0) {
			union(0, Integer.valueOf(st.nextToken()));
		}
		
		// 두 도시를 연결하는 케이블의 정보
		ArrayList<Node> connect = new ArrayList<>();
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken());
			int v = Integer.valueOf(st.nextToken());
			int w = Integer.valueOf(st.nextToken());
			connect.add(new Node(u, v, w));
		}
		Collections.sort(connect);
		
		// 케이블을 설치하는 데 드는 최소비용 계산
		int cost=0;
		for(int i=0;i<M;i++) {
			if(union(connect.get(i).start, connect.get(i).end)) {
				cost += connect.get(i).cost;
			}
		}
		
		bw.write(Integer.toString(cost));
		
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