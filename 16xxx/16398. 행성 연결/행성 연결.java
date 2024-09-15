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
		
		// 행성의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 행성간의 플로우 입력
		ArrayList<Node> flow = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<i;j++) {
				flow.add(new Node(i, j, Integer.valueOf(st.nextToken())));
			}
		}
		Collections.sort(flow);
		
		// 플로우의 최소 관리비용 계산
		long cost=0;
		for(int i=0;i<flow.size();i++) {
			if(union(flow.get(i).start, flow.get(i).end)) {
				cost += flow.get(i).cost;
			}
		}
		
		bw.write(Long.toString(cost));
		
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