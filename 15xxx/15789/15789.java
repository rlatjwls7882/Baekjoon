import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent, size;
	
	public static void main(String[] args) throws IOException {
		
		// 왕국의 수 n, 동맹 관계의 수 m
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		size = new int[N];
		Arrays.fill(size, 1);
		
		// 현재 동맹 관계 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.valueOf(st.nextToken())-1;
			int Y = Integer.valueOf(st.nextToken())-1;
			union(X, Y);
		}
		
		// CTP 왕국의 번호 C, 한솔 왕국의 번호 H, 추가 동맹의 기회 K
		st = new StringTokenizer(br.readLine());
		int C = find(Integer.valueOf(st.nextToken())-1);
		int H = find(Integer.valueOf(st.nextToken())-1);
		int K = Integer.valueOf(st.nextToken());
		
		// CTP왕국의 힘의 최댓값 계산
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			if(parent[i]==i&&i!=C&&i!=H) {
				pq.add(new Node(i, size[i]));
			}
		}
		
		while(K-->0&&!pq.isEmpty()) {
			size[C] += pq.poll().size;
		}
		bw.write(Integer.toString(size[C]));
		
		bw.close();
	} // end of main()
	
	static int find(int x) {
		if(parent[x]==x) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	} // end of find()
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if(x<y) {
			parent[y]=x;
			size[x] += size[y];
		} else if(x>y) {
			parent[x]=y;
			size[y] += size[x];
		}
	} // end of union()
} // end of Main class

class Node implements Comparable<Node> {
	int pos, size;
	
	public Node(int pos, int size) {
		this.pos=pos;
		this.size=size;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.size-this.size;
	}
} // end of Node class