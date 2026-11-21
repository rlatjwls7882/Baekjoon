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
		
		// 도시의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 고속철도를 설치할 때 드는 비용 입력
		ArrayList<Node> road = new ArrayList<>();
		int totalCost=0;
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<i;j++) {
				int cost = Integer.valueOf(st.nextToken());
				if(cost<0) {
					totalCost -= cost;
					union(i, j);
				} else if(cost>0) {
					road.add(new Node(i, j, cost));
				}
			}
		}
		Collections.sort(road);
		
		// 모든 도시 사이에 고속철도 설치
		ArrayList<Integer> additional_construct = new ArrayList<>();
		for(int i=0;i<road.size();i++) {
			if(union(road.get(i).start, road.get(i).end)) {
				totalCost += road.get(i).cost;
				additional_construct.add(i);
			}
		}
		
		// 출력
		bw.write(String.format("%d %d\n", totalCost, additional_construct.size()));
		for(int i=0;i<additional_construct.size();i++) {
			bw.write(String.format("%d %d\n", road.get(additional_construct.get(i)).start+1, road.get(additional_construct.get(i)).end+1));
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