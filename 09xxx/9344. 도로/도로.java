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
			
			// 도시의 수 N, 길의 수 M, 판단해야하는 두 도시 p q
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			int p = Integer.valueOf(st.nextToken())-1;
			int q = Integer.valueOf(st.nextToken())-1;
			
			// 초기화
			parent = new int[N];
			for(int i=0;i<N;i++) {
				parent[i]=i;
			}
			
			// 길 입력
			ArrayList<Node> road = new ArrayList<>();
			while(M-->0) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.valueOf(st.nextToken())-1;
				int v = Integer.valueOf(st.nextToken())-1;
				int w = Integer.valueOf(st.nextToken());
				road.add(new Node(u, v, w));
			}
			Collections.sort(road);
			
			// p-q를 지으면서 가장 짧은 도로망을 만들 수 있는지 확인
			boolean p_q=false;
			int roadCnt=0;
			
			for(int i=0;i<road.size();i++) {
				if(union(road.get(i).start, road.get(i).end)) {
					roadCnt++;
					if(!p_q&&(road.get(i).start==p&&road.get(i).end==q||road.get(i).start==q&&road.get(i).end==p)) {
						p_q=true;
					}
					if(roadCnt==N-1) {
						break;
					}
				}
			}
			
			if(p_q&&roadCnt==N-1) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
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