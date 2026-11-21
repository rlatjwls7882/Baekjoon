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
		
		// 논의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		parent = new int[N+1];
		for(int i=0;i<=N;i++) {
			parent[i]=i;
		}
		
		// 우물을 팔 때 드는 비용
		ArrayList<Node> require = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			require.add(new Node(0, i, Integer.valueOf(br.readLine())));
		}
		
		// 논을 연결하는데 드는 비용
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<i;j++) {
				require.add(new Node(i, j, Integer.valueOf(st.nextToken())));
			}
		}
		Collections.sort(require);
		
		// 모든 논에 물을 대는데 필요한 최소비용 계산
		int cost=0;
		for(int i=0;i<require.size();i++) {
			if(union(require.get(i).start, require.get(i).end)) {
				cost += require.get(i).cost;
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