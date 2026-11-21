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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// 집합 생성
		parent = new int[n+1];
		for(int i=1;i<=n;i++) {
			parent[i]=i;
		}
		
		// m개의 연산 수행
		while(m-->0) {
			st = new StringTokenizer(br.readLine());
			if(st.nextToken().equals("0")) {
				union(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
			} else {
				if(hasSameParent(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()))) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			}
		}
		
		bw.close();
	} // end of main()
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x<y) {
			parent[y]=x;
		} else if(y<x) {
			parent[x]=y;
		}
	} // end of union()
	
	static int find(int x) {
		if(x==parent[x]) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	} // end of find()
	
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