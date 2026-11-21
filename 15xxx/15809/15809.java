import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	static long[] power;
	
	public static void main(String[] args) throws IOException {
		
		// 국가의 수 N, 기록의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 각 국가의 국력
		power = new long[N];
		for(int i=0;i<N;i++) {
			power[i] = Long.valueOf(br.readLine());
		}
		
		// M개의 기록
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int O = Integer.valueOf(st.nextToken());
			int P = Integer.valueOf(st.nextToken())-1;
			int Q = Integer.valueOf(st.nextToken())-1;
			
			if(O==1) {
				union(P, Q);
			} else {
				fight(P, Q);
			}
		}
		
		// 남아있는 국가의 수와 각 국가가 남은 병력 계산
		PriorityQueue<Long> remains = new PriorityQueue<>();
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			if(parent[i]==i) {
				remains.add(power[i]);
				cnt++;
			}
		}
		
		// 출력
		bw.write(Integer.toString(cnt));
		bw.newLine();
		
		for(int i=0;i<cnt;i++) {
			bw.write(Long.toString(remains.poll()));
			bw.write(' ');
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
		
		if(x==-1||y==-1) {
			return;
		}
		if(x<y) {
			parent[y]=x;
			power[x] += power[y];
		} else {
			parent[x]=y;
			power[y] += power[x];
		}
	} // end of union()
	
	static void fight(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(power[x]==power[y]) {
			parent[x]=parent[y]=-1;
		} else {
			if(x<y) {
				parent[y]=x;
				power[x] = Math.abs(power[x]-power[y]);
			} else {
				parent[x]=y;
				power[y] = Math.abs(power[x]-power[y]);
			}
		}
	} // end of fight()
} // end of Main class