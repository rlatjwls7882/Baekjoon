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
		
		// 우주신의 개수 N, 이미 연결된 신들과의 통로의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 우주신들의 좌표
		double[][] pos = new double[N][2];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			pos[i][0] = Double.valueOf(st.nextToken());
			pos[i][1] = Double.valueOf(st.nextToken());
		}
		
		// 이미 연결된 통로
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			union(a, b);
		}
		
		// 각 우주신들의 거리 계산
		ArrayList<Node> dist = new ArrayList<>();
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				dist.add(new Node(i, j, calcDist(pos[i], pos[j])));
			}
		}
		Collections.sort(dist);
		
		// 만들어야 할 최소 통로의 길이 계산
		double minDist=0;
		for(int i=0;i<dist.size();i++) {
			if(union(dist.get(i).start, dist.get(i).end)) {
				minDist += dist.get(i).dist;
			}
		}
		
		bw.write(String.format("%.02f", minDist));
		
		bw.close();
	} // end of main()
	
	static double calcDist(double[] s1, double[] s2) {
		return Math.sqrt(Math.pow(s1[0]-s2[0], 2)+Math.pow(s1[1]-s2[1], 2));
	}
	
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
	int start, end;
	double dist;
	
	public Node(int start, int end, double dist) {
		this.start=start;
		this.end=end;
		this.dist=dist;
	}
	
	@Override
	public int compareTo(Node o1) {
		if(this.dist>o1.dist) {
			return 1;
		} else if(this.dist==o1.dist) {
			return 0;
		} else {
			return -1;
		}
	}
} // end of Node class