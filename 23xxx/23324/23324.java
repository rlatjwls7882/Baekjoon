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
	static int[] parent, size;
	
	public static void main(String[] args) throws IOException {
		
		// 정점의 수 N, 간선의 개수 M, 가중치 1인 간선의 위치 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		size = new int[N];
		Arrays.fill(size, 1);
		
		// 간선으로 정점 연결
		for(int i=1;i<=M;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken())-1;
			int v = Integer.valueOf(st.nextToken())-1;
			
			if(i!=K) {
				union(u, v);
			}
		}
		
		// 모든 정점 쌍의 최단 거리의 합 계산
		long distSum=1;
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			if(parent[i]==i) {
				distSum *= size[i];
				cnt++;
			}
		}
		
		if(cnt==1) {
			bw.write("0");
		} else {
			bw.write(Long.toString(distSum));
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
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if(x<y) {
			parent[y]=x;
			size[x]+=size[y];
		} else if(x>y) {
			parent[x]=y;
			size[y]+=size[x];
		}
	} // end of union()
} // end of Main class