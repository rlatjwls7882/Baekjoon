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
		
		// 건물의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 건물의 위치
		int[][] pos = new int[N][2];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			pos[i][0] = Integer.valueOf(st.nextToken());
			pos[i][1] = Integer.valueOf(st.nextToken());
			
		}
		
		// 건물사이의 거리
		ArrayList<Node> dist = new ArrayList<>();
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				dist.add(new Node(i, j, calcDist(pos[i], pos[j])));
			}
		}
		Collections.sort(dist);
		
		// 기존 케이블
		int M = Integer.valueOf(br.readLine());
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken())-1;
			int y = Integer.valueOf(st.nextToken())-1;
			union(x, y);
		}
		
		// 새 케이블의 길이 계산
		ArrayList<Integer> posList = new ArrayList<>();
		double minDist=0;
		for(int i=0;i<dist.size();i++) {
			if(union(dist.get(i).x, dist.get(i).y)) {
				posList.add(i);
				minDist += dist.get(i).dist;
			}
		}
		
		// 출력
		bw.write(String.format("%.2f\n", minDist));
		
		for(int i=0;i<posList.size();i++) {
			bw.write(String.format("%d %d\n", dist.get(posList.get(i)).x+1, dist.get(posList.get(i)).y+1));
		}
		
		bw.close();
	} // end of main()
	
	static double calcDist(int[] a, int[] b) {
		return Math.sqrt(Math.pow(a[0]-b[0], 2)+Math.pow(a[1]-b[1], 2));
	} // end of calcDist()
	
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
	double dist;
	int x, y;
	
	public Node(int x, int y, double dist) {
		this.x=x;
		this.y=y;
		this.dist=dist;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.dist>o.dist) {
			return 1;
		} else if(this.dist<o.dist) {
			return -1;
		} else {
			return 0;
		}
	}
} // end of Node class