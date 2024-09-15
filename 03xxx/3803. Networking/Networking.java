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
		
		while(true) {
			
			// 지점의 수 P, 길의 수 R
			StringTokenizer st = new StringTokenizer(br.readLine());
			int P = Integer.valueOf(st.nextToken());
			if(P==0) {
				break;
			}
			int R = Integer.valueOf(st.nextToken());
			
			// 초기화
			parent = new int[P];
			for(int i=0;i<P;i++) {
				parent[i]=i;
			}
			
			// 길 입력
			ArrayList<Node> road = new ArrayList<>();
			for(int i=0;i<R;i++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.valueOf(st.nextToken())-1;
				int end = Integer.valueOf(st.nextToken())-1;
				int cost = Integer.valueOf(st.nextToken());
				road.add(new Node(start, end, cost));
			}
			Collections.sort(road);
			
			// 케이블의 최소 길이 계산
			int minCost=0;
			for(int i=0;i<R;i++) {
				if(union(road.get(i).start, road.get(i).end)) {
					minCost += road.get(i).cost;
				}
			}
			
			// 출력
			bw.write(Integer.toString(minCost));
			bw.newLine();
			br.readLine();
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
	public int compareTo(Node o) {
		return this.cost-o.cost;
	}
} // end of Node class