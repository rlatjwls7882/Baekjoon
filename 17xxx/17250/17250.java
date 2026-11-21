import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent, planetNum;
	
	public static void main(String[] args) throws IOException {
		
		// 은하의 수 N, 철도의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		planetNum = new int[N];
		parent = new int[N];
		
		for(int i=0;i<N;i++) {
			planetNum[i] = Integer.valueOf(br.readLine());
			parent[i] = i;
		}
		
		// 철도가 연결될 때마다 해당 철도를 이용할 수 있는 행성의 수 계산
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			bw.write(Integer.toString(union(a, b)));
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
	
	static int union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return planetNum[x];
		} else if(x<y) {
			parent[y]=x;
			return planetNum[x] += planetNum[y];
		} else {
			parent[x]=y;
			return planetNum[y] += planetNum[x];
		}
	} // end of union()
} // end of Main class