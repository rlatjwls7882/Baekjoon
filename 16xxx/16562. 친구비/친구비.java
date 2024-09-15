import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent, cost;
	
	public static void main(String[] args) throws IOException {
		
		// 학생 수 N, 친구관계 수 M, 가지고 있는 돈 k
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 친구비
		st = new StringTokenizer(br.readLine());
		cost = new int[N];
		for(int i=0;i<N;i++) {
			cost[i] = Integer.valueOf(st.nextToken());
		}
		
		// 학생끼리의 친구관계 확인
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.valueOf(st.nextToken())-1;
			int w = Integer.valueOf(st.nextToken())-1;
			union(v, w);
		}
		
		// 모든 학생과 친구하는데 드는 비용 계산
		int totalCost=0;
		for(int i=0;i<N;i++) {
			if(parent[i]==i) {
				totalCost += cost[i];
			}
		}
		
		// 모든 학생을 친구로 만드는데 드는 최소비용 출력
		if(totalCost>k) {
			bw.write("Oh no");
		} else {
			bw.write(Integer.toString(totalCost));
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
			cost[x] = Math.min(cost[x], cost[y]);
		} else if(x>y) {
			parent[x]=y;
			cost[y] = Math.min(cost[x], cost[y]);
		}
	} // end of union()
} // end of Main class