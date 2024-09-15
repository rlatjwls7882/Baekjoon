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
	static int cnt=0;
	
	public static void main(String[] args) throws IOException {
		
		// 뉴런의 개수 N, 시냅스의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 시냅스로 연결된 뉴런
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken())-1;
			int v = Integer.valueOf(st.nextToken())-1;
			union(u, v);
		}
		
		// 연결해야하는 시냅스
		for(int i=0;i<N;i++) {
			if(parent[i]==i) {
				cnt++;
			}
		}
		
		// 트리 형태로 연결하기 위해 필요한 최소 연산 횟수 계산
		bw.write(Integer.toString(cnt-1));
		
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

		if(x==y) { // 끊어야 하는 시냅스
			cnt++;
		} else if(x<y) {
			parent[y]=x;
		} else {
			parent[x]=y;
		}
	} // end of union()
} // end of Main class