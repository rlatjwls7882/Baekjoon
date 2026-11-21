import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			
			// 위성 채널의 수 S, 전초기지의 수 P
			StringTokenizer st = new StringTokenizer(br.readLine());
			int S = Integer.valueOf(st.nextToken());
			int P = Integer.valueOf(st.nextToken());
			
			// 초기화
			parent = new int[P];
			for(int i=0;i<P;i++) {
				parent[i]=i;
			}
			
			// 전초기지의 좌표
			int[][] pos = new int[P][2];
			for(int i=0;i<P;i++) {
				st = new StringTokenizer(br.readLine());
				pos[i][0] = Integer.valueOf(st.nextToken());
				pos[i][1] = Integer.valueOf(st.nextToken());
			}
			
			// 개설이 가능한 채널
			PriorityQueue<Node> channel = new PriorityQueue<>();
			for(int i=0;i<P;i++) {
				for(int j=i+1;j<P;j++) {
					channel.add(new Node(i, j, calcDist(pos[i], pos[j])));
				}
			}
			
			// 네트워크 연결에 필요한 최소비용 계산
			double D=0;
			P -= S;
			
			while(P>0) {
				Node curChannel = channel.poll();
				if(union(curChannel.start, curChannel.end)) {
					D = Math.max(D, curChannel.cost);
					P--;
				}
			}
			bw.write(String.format("%.02f\n", D));
		}
		
		bw.close();
	} // end of main()
	
	static double calcDist(int[] pos1, int[] pos2) {
		return Math.sqrt(Math.pow(pos1[0]-pos2[0], 2)+Math.pow(pos1[1]-pos2[1], 2));
	} // end of calcDist()
	
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
	int start, end;
	double cost;
	
	public Node(int start, int end, double cost) {
		this.start=start;
		this.end=end;
		this.cost=cost;
	}
	
	public int compareTo(Node o1) {
		if(this.cost>o1.cost) {
			return 1;
		} else if(this.cost==o1.cost) {
			return 0;
		} else {
			return -1;
		}
	}
} // end of Node class