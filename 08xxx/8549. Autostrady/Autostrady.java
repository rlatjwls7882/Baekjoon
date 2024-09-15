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
		
		// 먼 나라에 있는 도시 수 n, 도로의 수 m
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		// 도로 입력
		ArrayList<Node> road = new ArrayList<>();
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			int c = Integer.valueOf(st.nextToken());
			road.add(new Node(a, b, c));
		}
		Collections.sort(road);
		
		// 가장 비싼 고속도로를 건설하는데 드는 비용의 최솟값 계산
		int max = 0;
		for(int i=0;i<m;i++) {
			if(union(road.get(i).start, road.get(i).end)) {
				max = Math.max(max, road.get(i).cost);
			}
		}
		bw.write(Integer.toString(max));
		
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
	public int compareTo(Node o) {
		return this.cost-o.cost;
	}
} // end of Node class