import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		// 정점의 개수 N, 간선의 개수 M, 턴의 수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 간선 입력
		ArrayList<Node> connect = new ArrayList<>();
		for(int i=1;i<=M;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken())-1;
			int y = Integer.valueOf(st.nextToken())-1;
			connect.add(new Node(x, y, i));
		}
		
		// 각 턴에 얻는 점수 계산
		for(int i=0;i<K;i++) {
			
			// 초기화
			parent = new int[N];
			for(int j=0;j<N;j++) {
				parent[j]=j;
			}
			
			// 점수 계산
			int score=0, connectCnt=0;
			for(int j=i;j<M;j++) {
				if(union(connect.get(j).start, connect.get(j).end)) {
					score += connect.get(j).cost;
					connectCnt++;
					
					if(connectCnt==N-1) {
						break;
					}
				}
			}
			
			if(connectCnt==N-1) {
				bw.write(Integer.toString(score));
				bw.write(' ');
			} else {
				while(i++<K) {
					bw.write("0 ");
				}
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