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
		
		// 꽃의 수 F, 벌의 수 B
		StringTokenizer st = new StringTokenizer(br.readLine());
		int F = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[F];
		for(int i=0;i<F;i++) {
			parent[i]=i;
		}
		
		// 각 꽃의 위치
		int[][] pos = new int[F][2];
		for(int i=0;i<F;i++) {
			st = new StringTokenizer(br.readLine());
			pos[i][0] = Integer.valueOf(st.nextToken());
			pos[i][1] = Integer.valueOf(st.nextToken());
		}
		
		// 벌이 움직일 수 있는 경로
		PriorityQueue<Node> route = new PriorityQueue<>();
		for(int i=0;i<F;i++) {
			for(int j=i+1;j<F;j++) {
				route.add(new Node(i, j, calcDist(pos[i], pos[j])));
			}
		}
		
		// B마리의 벌이 총 움직여야 하는 최단거리 계산
		double cost=0;
		F -= B;
		
		while(F>0) {
			Node curRoute = route.poll();
			if(union(curRoute.start, curRoute.end)) {
				cost = Math.max(cost, curRoute.cost);
				F--;
			}
		}
		bw.write(String.format("%.02f", cost));
		
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