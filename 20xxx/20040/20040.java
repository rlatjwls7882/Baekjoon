import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean cycled=false;
	static int[] parent;
	
	public static void main(String[] args) throws IOException {
		
		// 점의 개수 n, 진행된 차례의 수 m
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		// 사이클이 처음 만들어지는 차례의 번호 계산
		int cycleNum=0;
		for(int i=1;i<=m;i++) {
			st = new StringTokenizer(br.readLine());
			union(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
			if(cycled) {
				cycleNum=i;
				break;
			}
		}
		
		bw.write(Integer.toString(cycleNum));
		
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
		
		if(x==y) {
			cycled=true;
		} else if(x<y) {
			parent[y]=x;
		} else {
			parent[x]=y;
		}
	} // end of union()
} // end of Main class