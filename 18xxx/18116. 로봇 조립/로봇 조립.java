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
		
		// 호재의 지시 횟수 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		parent = new int[1000000];
		for(int i=0;i<1000000;i++) {
			parent[i]=i;
		}
		
		size = new int[1000000];
		Arrays.fill(size, 1);
		
		// 지시 수행
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			if(st.nextToken().equals("I")) {
				int a = Integer.valueOf(st.nextToken())-1;
				int b = Integer.valueOf(st.nextToken())-1;
				union(a, b);
			} else {
				int a = Integer.valueOf(st.nextToken())-1;
				bw.write(Integer.toString(size[find(a)]));
				bw.newLine();
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
	
	static int union(int x, int y) {
		x = find(x);
		y = find(y);

		if(x==y) {
			return size[x];
		} else if(x<y) {
			parent[y]=x;
			return size[x] += size[y];
		} else {
			parent[x]=y;
			return size[y] += size[x];
		}
	} // end of union()
} // end of Main class