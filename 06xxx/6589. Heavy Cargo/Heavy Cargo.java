import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		for(int i=1;;i++) {
			
			// 네트워크를 구성하는 도시의 수 n, 도로의 수 r
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int r = Integer.valueOf(st.nextToken());
			
			if(n==0&&r==0) {
				break;
			}
			
			// 초기화
			parent = new int[n];
			for(int j=0;j<n;j++) {
				parent[j]=j;
			}
			
			// 도로 입력
			HashMap<String, Integer> city = new HashMap<>();
			ArrayList<Node> roads = new ArrayList<>();
			int pos=0;
			
			for(int j=0;j<r;j++) {
				
				// 새 도시 라벨링
				st = new StringTokenizer(br.readLine());
				String name1 = st.nextToken();
				String name2 = st.nextToken();
				int w = Integer.valueOf(st.nextToken());
				
				if(!city.containsKey(name1)) {
					city.put(name1, pos++);
				}
				if(!city.containsKey(name2)) {
					city.put(name2, pos++);
				}
				
				// 도로 추가
				roads.add(new Node(city.get(name1), city.get(name2), w));
			}
			Collections.sort(roads);
			
			// 두 도시 사이에서 운반할 수 있는 최대 하중 계산
			st = new StringTokenizer(br.readLine());
			int start = city.get(st.nextToken());
			int end = city.get(st.nextToken());
			
			int maxWeight=1000000;
			for(int j=0;j<r;j++) {
				if(union(roads.get(j).start, roads.get(j).end)) {
					maxWeight = Math.min(maxWeight, roads.get(j).weight);
					
					if(find(start)==find(end)) {
						break;
					}
				}
			}
			
			// 출력
			bw.write(String.format("Scenario #%d\n", i));
			bw.write(String.format("%d tons\n\n", maxWeight));
		}
		
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