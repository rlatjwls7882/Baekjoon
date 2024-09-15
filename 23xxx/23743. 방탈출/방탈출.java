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
		
		// 방의 개수 N, 워프의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N+1];
		for(int i=0;i<=N;i++) {
			parent[i]=i;
		}
		
		// 워프의 정보
		ArrayList<Node> connect = new ArrayList<>();
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			connect.add(new Node(a, b, c));
		}
		
		// 비상탈출구
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			connect.add(new Node(0, i, Integer.valueOf(st.nextToken())));
		}
		
		// 워프와 비상탈출구를 설치하는데 걸리는 최소 시간 계산
		Collections.sort(connect);
		int time=0;
		
		for(int i=0;i<connect.size();i++) {
			if(union(connect.get(i).start, connect.get(i).end)) {
				time += connect.get(i).time;
			}
		}
		
		bw.write(Integer.toString(time));
		
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
	int start, end, time;
	
	public Node(int start, int end, int time) {
		this.start=start;
		this.end=end;
		this.time=time;
	}
	
	@Override
	public int compareTo(Node node) {
		return this.time-node.time;
	}
} // end of Node class