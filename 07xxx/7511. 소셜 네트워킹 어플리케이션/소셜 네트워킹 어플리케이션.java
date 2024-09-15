import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		for(int numCases=1;numCases<=T;numCases++) {
			bw.write(String.format("Scenario %d:\n", numCases));
			
			// 유저의 수 n, 친구 관계의 수 k
			int n = Integer.valueOf(br.readLine());
			int k = Integer.valueOf(br.readLine());
			
			// 초기화
			parent = new int[n];
			for(int i=0;i<n;i++) {
				parent[i]=i;
			}
			
			// 친구 관계 입력
			while(k-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.valueOf(st.nextToken());
				int b = Integer.valueOf(st.nextToken());
				union(a, b);
			}
			
			// 각 쌍이 연결되어 있는지 확인
			int m = Integer.valueOf(br.readLine());
			while(m-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int u = Integer.valueOf(st.nextToken());
				int v = Integer.valueOf(st.nextToken());
				if(hasSameParent(u, v)) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			}
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
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x<y) {
			parent[y]=x;
		} else {
			parent[x]=y;
		}
	} // end of union()
	
	static boolean hasSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return true;
		} else {
			return false;
		}
	} // end of hasSameParent()
} // end of Main class