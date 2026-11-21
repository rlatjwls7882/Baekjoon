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
	static int[] parent, S;
	
	public static void main(String[] args) throws IOException {
		
		// 도시 수 N, 건설된 철도 노선의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 건설 비용 S
		st = new StringTokenizer(br.readLine());
		S = new int[N];
		for(int i=0;i<N;i++) {
			S[i] = Integer.valueOf(st.nextToken());
		}
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 이미 연결된 철도
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.valueOf(st.nextToken())-1;
			int u = Integer.valueOf(st.nextToken())-1;
			union(u, v);
		}
		
		// 나머지 철도 건설 비용
		PriorityQueue<Integer> eachCost = new PriorityQueue<>();
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			if(parent[i]==i) {
				eachCost.add(S[i]);
				cnt++;
			}
		}
		
		// 철도 건설에 드는 비용 최소화
		if(cnt==1) {
			bw.write("0");
		} else {
			int smallest = eachCost.poll();
			int totalCost=0;
			
			while(!eachCost.isEmpty()) {
				totalCost += smallest*eachCost.poll();
			}
			
			bw.write(Integer.toString(totalCost));
		}
		
		bw.close();
	} // end of main()
	
	static int find(int x) {
		if(parent[x]==x) {
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
			S[x] = Math.min(S[x], S[y]);
		} else {
			parent[x]=y;
			S[y] = Math.min(S[x], S[y]);
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
	public int compareTo(Node o) {
		return this.cost-o.cost;
	}
} // end of Node class