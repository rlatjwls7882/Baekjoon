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
		
		// n개의 별 입력
		int n = Integer.valueOf(br.readLine());
		
		double[][] star = new double[n][2];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			star[i][0] = Double.valueOf(st.nextToken());
			star[i][1] = Double.valueOf(st.nextToken());
		}
		
		// 초기화
		parent = new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		// 두 별 사이의 모든 선분 생성
		ArrayList<Node> line = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				line.add(new Node(i, j, calcDist(star[i], star[j])));
			}
		}
		Collections.sort(line);
		
		// 별자리 연결
		double cost=0;
		for(int i=0;i<line.size();i++) {
			if(union(line.get(i).start, line.get(i).end)) {
				cost += line.get(i).dist;
			}
		}
		
		bw.write(Double.toString(cost));
		
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
		return (int)Math.ceil(this.dist-o1.dist);
	}
} // end of Node class