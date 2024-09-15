import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	static long[] size;
	
	public static void main(String[] args) throws IOException {
		
		// 교육생의 수 N, 친분 관계의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		size = new long[N];
		Arrays.fill(size, 1);
		
		// 친분 관계 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken())-1;
			int v = Integer.valueOf(st.nextToken())-1;
			union(u, v);
		}
		
		// 튜터-튜티 관계를 정하는 경우의 수 계산
		long cnt=1;
		for(int i=0;i<N;i++) {
			if(parent[i]==i) {
				cnt *= size[i];
				cnt %= 1_000_000_007;
			}
		}
		bw.write(Long.toString(cnt));
		
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
			size[x] += size[y];
		} else {
			parent[x]=y;
			size[y] += size[x];
		}
	} // end of union()
} // end of Main class