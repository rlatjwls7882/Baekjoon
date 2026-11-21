import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent, sum;
	
	public static void main(String[] args) throws IOException {
		
		// 물탱크의 수 N, 파이프의 수 M, 물탱크에 방문할 횟수 Q
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int Q = Integer.valueOf(st.nextToken());
		
		// 초기화
		st = new StringTokenizer(br.readLine());
		parent = new int[N];
		sum = new int[N];
		
		for(int i=0;i<N;i++) {
			parent[i]=i;
			if(st.nextToken().equals("1")) {
				sum[i]=1;
			} else {
				sum[i]=-1;
			}
		}
		
		// 파이프 연결
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken())-1;
			int v = Integer.valueOf(st.nextToken())-1;
			union(u, v);
		}
		
		// 각 물탱크에 방문했을 때 청정수를 얻을 수 있는지 확인
		while(Q-->0) {
			int K = Integer.valueOf(br.readLine())-1;
			if(sum[find(K)]>0) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
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

		if(x<y) {
			parent[y]=x;
			sum[x] += sum[y];
		} else if(x>y) {
			parent[x]=y;
			sum[y] += sum[x];
		}
	} // end of union()
} // end of Main class