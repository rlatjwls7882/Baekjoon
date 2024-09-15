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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 노드의 수 N, 간선의 수 M
			int N = Integer.valueOf(br.readLine());
			int M = Integer.valueOf(br.readLine());
			
			// 초기화
			parent = new int[N];
			for(int i=0;i<N;i++) {
				parent[i]=i;
			}
			
			// 간선 입력
			boolean isTree=true;
			int connectCnt=0;
			for(int i=0;i<M;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				if(isTree) {
					int A = Integer.valueOf(st.nextToken())-1;
					int B = Integer.valueOf(st.nextToken())-1;
					
					if(union(A, B)) {
						connectCnt++;
					} else {
						isTree=false;
					}
				}
			}
			
			// 트리인지 그래프인지 확인
			if(isTree&&connectCnt==N-1) {
				bw.write("tree\n");
			} else {
				bw.write("graph\n");
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
	
	static boolean union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x==y) {
			return false;
		} else if(x<y) {
			parent[y]=x;
		} else if(x>y) {
			parent[x]=y;
		}
		return true;
	} // end of union()
} // end of Main class