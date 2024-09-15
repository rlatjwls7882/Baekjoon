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
		
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		parent = new int[] {0, 1, 2, 3, 4};
		
		// 붙어있는 손 확인
		boolean connected=false;
		
		if(N==3) {
			while(N-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.valueOf(st.nextToken())-1;
				int y = Integer.valueOf(st.nextToken())-1;
				if(union(x, y)) {
					connected=true;
				}
			}
		}
		
		// 여우 사인인지 확인
		if(find(2)==0&&find(3)==0&&connected) {
			bw.write("Wa-pa-pa-pa-pa-pa-pow!");
		} else {
			bw.write("Woof-meow-tweet-squeek");
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
	
	static boolean union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return true;
		} else if(x<y) {
			parent[y]=x;
		} else {
			parent[x]=y;
		}
		return false;
	} // end of union()
} // end of Main class