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
		
		// 도시 수 c, 도로 수 r, 목적지의 수 d
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c = Integer.valueOf(st.nextToken());
		int r = Integer.valueOf(st.nextToken());
		int d = Integer.valueOf(st.nextToken());

		// 초기화
		parent = new int[c];
		for(int i=0;i<c;i++) {
			parent[i]=i;
		}

		// 도로 입력
		ArrayList<Node> roads = new ArrayList<>();

		for(int i=0;i<r;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken())-1;
			int y = Integer.valueOf(st.nextToken())-1;
			int w = Integer.valueOf(st.nextToken());
			roads.add(new Node(x, y, w));
		}
		Collections.sort(roads);

		// 목적지 입력
		int[] destination = new int[d];
		for(int i=0;i<d;i++) {
			destination[i] = Integer.valueOf(br.readLine())-1;
		}

		// 목적지까지의 최대 하중 계산
		int maxWeight=1000000, pos=0;
		for(int i=0;i<r;i++) {
			if(union(roads.get(i).start, roads.get(i).end)) {
				maxWeight = Math.min(maxWeight, roads.get(i).weight);

				while(pos<d&&find(0)==find(destination[pos])) {
					pos++;
				}
				if(pos==d) {
					break;
				}
			}
		}

		// 출력
		bw.write(Integer.toString(maxWeight));
		
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
	int start, end, weight;
	
	public Node(int start, int end, int weight) {
		this.start=start;
		this.end=end;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.weight-this.weight;
	}
} // end of Node class