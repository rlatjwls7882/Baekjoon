import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		// 행성의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 행성의 좌표
		Pos[] pos = new Pos[N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			int z = Integer.valueOf(st.nextToken());
			pos[i] = new Pos(i, x, y, z);
		}
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 행성 사이의 건설 가능성이 있는 터널
		ArrayList<Node> tunnel = new ArrayList<>();
		
		Arrays.sort(pos, (pos1, pos2) -> pos1.x-pos2.x);
		for(int i=0;i<N-1;i++) {
			tunnel.add(new Node(pos[i].idx, pos[i+1].idx, Math.abs(pos[i].x-pos[i+1].x)));
		}
		
		Arrays.sort(pos, (pos1, pos2) -> pos1.y-pos2.y);
		for(int i=0;i<N-1;i++) {
			tunnel.add(new Node(pos[i].idx, pos[i+1].idx, Math.abs(pos[i].y-pos[i+1].y)));
		}
		
		Arrays.sort(pos, (pos1, pos2) -> pos1.z-pos2.z);
		for(int i=0;i<N-1;i++) {
			tunnel.add(new Node(pos[i].idx, pos[i+1].idx, Math.abs(pos[i].z-pos[i+1].z)));
		}
		
		Collections.sort(tunnel);
		
		// 모든 행성을 터널로 연결하는데 필요한 최소 비용 계산
		long cost=0;
		for(int i=0;i<tunnel.size();i++) {
			if(union(tunnel.get(i).start, tunnel.get(i).end)) {
				cost += tunnel.get(i).cost;
				N--;
				if(N==1) {
					break;
				}
			}
		}
		
		bw.write(Long.toString(cost));
		
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
	
	public int compareTo(Node o1) {
		return this.cost-o1.cost;
	}
} // end of Node class

class Pos {
	int idx, x, y, z;
	
	public Pos(int idx, int x, int y, int z) {
		this.idx=idx;
		this.x=x;
		this.y=y;
		this.z=z;
	}
} // end of Pos class