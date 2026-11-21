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
		
		// 컴퓨터의 수 n, 컴퓨터들의 쌍의 수 m
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		// 직접 연결되어 있는 컴퓨터 입력
		while(m-->0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken())-1;
			int y = Integer.valueOf(st.nextToken())-1;
			union(x, y);
		}
		
		// 안정된 네트워크인지(1을 제외한 모든 노드가 연결되어 있는지) 확인
		if(isConnected(n)) {
			bw.write("0 0");
		} else {
			
			// 연결할때의 비용 입력
			ArrayList<Node> connect = new ArrayList<>();
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				for(int j=1;j<i;j++) {
					connect.add(new Node(i, j, Integer.valueOf(st.nextToken())));
				}
			}
			Collections.sort(connect);
			
			// 안정된 네트워크로 만드는 최소비용 계산
			int totalCost=0;
			ArrayList<Integer> connectPos = new ArrayList<>();
			for(int i=0;i<connect.size();i++) {
				if(union(connect.get(i).start, connect.get(i).end)) {
					totalCost += connect.get(i).cost;
					connectPos.add(i);
				}
			}
			
			// 출력
			bw.write(String.format("%d %d\n", totalCost, connectPos.size()));
			for(int i=0;i<connectPos.size();i++) {
				bw.write(String.format("%d %d\n", connect.get(connectPos.get(i)).start+1, connect.get(connectPos.get(i)).end+1));
			}
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
		for(int i=2;i<N;i++) {
			if(find(i)!=1) {
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