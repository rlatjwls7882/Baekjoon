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
	static ArrayList<Node> bridge = new ArrayList<>();
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		// 섬에 존재하는 집의 수 N, 다리의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 출발위치 s, 도착위치 e
		st = new StringTokenizer(br.readLine());
		int s = Integer.valueOf(st.nextToken())-1;
		int e = Integer.valueOf(st.nextToken())-1;
		
		// 다리 입력
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int h1 = Integer.valueOf(st.nextToken())-1;
			int h2 = Integer.valueOf(st.nextToken())-1;
			int k = Integer.valueOf(st.nextToken());
			bridge.add(new Node(h1, h2, k));
		}
		Collections.sort(bridge);
		
		// 송이가 들고 갈 수 있는 금빼빼로의 최대 개수 계산
		int maxWeight=Integer.MAX_VALUE;
		for(int i=0;i<M;i++) {
			if(union(bridge.get(i).start, bridge.get(i).end)) {
				maxWeight = Math.min(maxWeight, bridge.get(i).cost);
				if(find(s)==find(e)) {
					break;
				}
			}
		}
		
		if(find(s)==find(e)) {
			bw.write(Integer.toString(maxWeight));
		} else {
			bw.write("0");
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
	int start, end, cost;
	
	public Node(int start, int end, int cost) {
		this.start=start;
		this.end=end;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Node node) {
		return node.cost-this.cost;
	}
} // end of Node class