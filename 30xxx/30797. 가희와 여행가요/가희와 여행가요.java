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
		
		// 도시의 수 n, 건설할 수 있는 노선 Q
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int Q = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		// 노선 입력
		ArrayList<Node> road = new ArrayList<>();
		for(int i=0;i<Q;i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.valueOf(st.nextToken())-1;
			int to = Integer.valueOf(st.nextToken())-1;
			long cost = Integer.valueOf(st.nextToken());
			int time = Integer.valueOf(st.nextToken());
			road.add(new Node(from, to, cost, time));
		}
		Collections.sort(road);
		
		// 최소 건설 비용과 시간 계산
		long cost=0;
		int time=0;
		
		for(int i=0;i<Q;i++) {
			if(union(road.get(i).start, road.get(i).end)) {
				cost += road.get(i).cost;
				time = Math.max(time, road.get(i).time);
			}
		}
		
		if(isConnected(n)) {
			bw.write(time+" "+cost);
		} else {
			bw.write("-1");
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
	
	static boolean isConnected(int N) {
		for(int i=0;i<N;i++) {
			if(find(i)!=0) {
				return false;
			}
		}
		
		return true;
	} // end of isConnected()
} // end of Main class

class Node implements Comparable<Node> {
	int start, end, time;
	long cost;
	
	public Node(int start, int end, long cost, int time) {
		this.start=start;
		this.end=end;
		this.cost=cost;
		this.time=time;
	}
	
	@Override
	public int compareTo(Node node) {
		if(this.cost!=node.cost) {
			return (int)(this.cost-node.cost);
		} else {
			return this.time-node.time;
		}
	}
} // end of Node class