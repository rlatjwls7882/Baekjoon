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
		
		// 요리 학원의 수 N, 길의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 길 입력
		ArrayList<Node> road = new ArrayList<>();
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.valueOf(st.nextToken())-1;
			int end = Integer.valueOf(st.nextToken())-1;
			int d = Integer.valueOf(st.nextToken());
			road.add(new Node(start, end, d));
		}
		Collections.sort(road);
		
		// 키위새가 쓰러지는 날 계산
		int maxDay=0;
		for(int i=0;i<M;i++) {
			if(union(road.get(i).start, road.get(i).end)) {
				if(maxDay+1==road.get(i).d) {
					maxDay++;
				} else {
					break;
				}
			}
		}
		
		bw.write(Integer.toString(maxDay+1));
		
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
	int start, end, d;
	
	public Node(int start, int end, int d) {
		this.start=start;
		this.end=end;
		this.d=d;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.d-o.d;
	}
} // end of Node class