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
		
		// 학교의 수 N, 도로의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 남초 대학교인지 여초 대학교인지 입력
		st = new StringTokenizer(br.readLine());
		char[] school = new char[N];
		
		for(int i=0;i<N;i++) {
			school[i] = st.nextToken().charAt(0);
		}
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 도로 입력
		ArrayList<Node> road = new ArrayList<>();
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken())-1;
			int v = Integer.valueOf(st.nextToken())-1;
			int d = Integer.valueOf(st.nextToken());
			road.add(new Node(u, v, d));
		}
		Collections.sort(road);
		
		// 최단경로의 길이 계산
		int length=0, roadCnt=0;
		for(int i=0;i<M;i++) {
			if(school[road.get(i).start]!=school[road.get(i).end]&&union(road.get(i).start, road.get(i).end)) {
				roadCnt++;
				length += road.get(i).length;
				
				if(roadCnt==N-1) {
					break;
				}
			}
		}
		
		if(roadCnt==N-1) {
			bw.write(Integer.toString(length));
		} else {
			bw.write("-1");
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
	int start, end, length;
	
	public Node(int start, int end, int length) {
		this.start=start;
		this.end=end;
		this.length=length;
	}
	
	@Override
	public int compareTo(Node node) {
		return this.length-node.length;
	}
} // end of Node class