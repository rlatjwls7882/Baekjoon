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
		
		// 섬의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		parent = new int[N];
		for(int i=0;i<N;i++) {
			parent[i]=i;
		}
		
		// 집합 더하기
		for(int i=2;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			union(a, b);
		}
		
		// 다리로 이을 두 섬의 번호 출력
		for(int i=1;i<N;i++) {
			if(hasDiffParent(0, i)) {
				bw.write(String.format("1 %d", i+1));
				break;
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
		} else {
			parent[x]=y;
		}
	} // end of union()
	
	static boolean hasDiffParent(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return false;
		} else {
			return true;
		}
	} // end of hasDiffParent()
} // end of Main class