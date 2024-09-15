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
		
		while(T-->0) {
			
			// 열 R, 행 C
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			
			// 초기화
			parent = new int[R*C];
			for(int i=0;i<R*C;i++) {
				parent[i]=i;
			}
			
			// 통신망 사이의 연결 입력
			ArrayList<Node> connect = new ArrayList<>();
			
			for(int i=0;i<R;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<C-1;j++) {
					connect.add(new Node(i*C+j, i*C+j+1, Integer.valueOf(st.nextToken())));
				}
			}
			for(int i=0;i<R-1;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<C;j++) {
					connect.add(new Node(i*C+j, i*C+j+C, Integer.valueOf(st.nextToken())));
				}
			}
			Collections.sort(connect);
			
			// 최소 비용 계산
			int totalCost=0;
			for(int i=0;i<connect.size();i++) {
				if(union(connect.get(i).start, connect.get(i).end)) {
					totalCost += connect.get(i).cost;
				}
			}
			
			bw.write(Integer.toString(totalCost));
			bw.newLine();
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
		return this.cost-node.cost;
	}
} // end of Node class