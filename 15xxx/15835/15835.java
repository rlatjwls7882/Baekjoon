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
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			
			// 체크포인트의 수 N, 경로의 수 M
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			
			// 초기화
			parent = new int[N];
			for(int j=0;j<N;j++) {
				parent[j]=j;
			}
			
			// 경로 입력
			ArrayList<Node> road = new ArrayList<>();
			for(int j=0;j<M;j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.valueOf(st.nextToken())-1;
				int b = Integer.valueOf(st.nextToken())-1;
				int c = Integer.valueOf(st.nextToken());
				road.add(new Node(a, b, c));
			}
			Collections.sort(road);
			
			// 최소 거리 계산
			int minDist=0;
			for(int j=0;j<M;j++) {
				if(union(road.get(j).start, road.get(j).end)) {
					minDist += road.get(j).weight;
				}
			}
			bw.write(String.format("Case #%d: %d meters\n", i, minDist));
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
		} else if(x>y) {
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
		return this.weight-o.weight;
	}
} // end of Node class