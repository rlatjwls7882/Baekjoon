import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashSet<Integer> treeList, cycleList;
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		for(int cases=1;;cases++) {
			
			// 정점의 개수 n, 간선의 개수 m
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			
			if(n==0&&m==0) {
				break;
			}
			
			// 초기화
			parent = new int[n];
			for(int i=0;i<n;i++) {
				parent[i]=i;
			}
			treeList = new HashSet<>();
			cycleList = new HashSet<>();
			
			// 간선 입력
			while(m-->0) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.valueOf(st.nextToken())-1;
				int b = Integer.valueOf(st.nextToken())-1;
				union(a, b);
			}
			
			// 트리의 개수 계산
			for(int i=0;i<n;i++) {
				if(!cycleList.contains(find(i))) {
					treeList.add(parent[i]);
				}
			}
			
			if(treeList.size()==0) {
				bw.write(String.format("Case %d: No trees.\n", cases));
			} else if(treeList.size()==1) {
				bw.write(String.format("Case %d: There is one tree.\n", cases));
			} else {
				bw.write(String.format("Case %d: A forest of %d trees.\n", cases, treeList.size()));
			}
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
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y||cycleList.contains(y)) {
			cycleList.add(x);
		} else if(cycleList.contains(x)) {
			cycleList.add(y);
		}
		
		if(x<y) {
			parent[y]=x;
		} else {
			parent[x]=y;
		}
	} // end of union()
} // end of Main class