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
	static ArrayList<Node> road;
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			// 집의 수 m, 길의 수 n
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			
			if(m==0&&n==0) {
				break;
			}
			
			// 초기화
			parent = new int[m];
			for(int i=0;i<m;i++) {
				parent[i]=i;
			}
			road = new ArrayList<>();
			
			// 길 입력
			int totalCost=0;
			while(n-->0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.valueOf(st.nextToken());
				int y = Integer.valueOf(st.nextToken());
				int z = Integer.valueOf(st.nextToken());
				totalCost += z;
				road.add(new Node(x, y, z));
			}
			Collections.sort(road);
			
			// 절약할 수 있는 최대 액수 계산
			int cost=0;
			for(int i=0;i<road.size();i++) {
				if(union(road.get(i).start, road.get(i).end)) {
					cost += road.get(i).cost;
				}
			}
			
			bw.write(Integer.toString(totalCost-cost));
			bw.newLine();
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