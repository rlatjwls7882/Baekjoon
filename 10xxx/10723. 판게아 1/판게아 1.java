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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 도시의 수 n, 건설된 횟수 m
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			
			// 태초의 세계에 대한 정보 입력
			ArrayList<Node> road = new ArrayList<>();
			for(int i=1;i<=n-1;i++) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.valueOf(st.nextToken());
				int v = Integer.valueOf(st.nextToken());
				road.add(new Node(i, u, v));
			}
			
			// 새 도로 m번 놓기
			long totalLength=0;
			while(m-->0) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.valueOf(st.nextToken());
				int v = Integer.valueOf(st.nextToken());
				int c = Integer.valueOf(st.nextToken());
				road.add(new Node(u, v, c));
				Collections.sort(road);
				
				// 초기화
				parent = new int[n];
				for(int i=0;i<n;i++) {
					parent[i]=i;
				}
				
				// 새 도로를 놓았을 때 도로의 최소 길이 계산
				long length=0;
				int roadCnt=0;
				
				for(int i=0;i<road.size();i++) {
					if(union(road.get(i).start, road.get(i).end)) {
						length += road.get(i).length;
						roadCnt++;
						
						if(roadCnt==n-1) {
							break;
						}
					}
				}
				totalLength ^= length;
			}
			
			// 매번 최소길이의 XOR한 값 계산
			bw.write(Long.toString(totalLength));
			bw.newLine();
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