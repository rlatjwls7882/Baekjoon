import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 노드의 수 N
			int N = Integer.valueOf(br.readLine());
			
			// 부모 정보 입력
			int[] parent = new int[N+1];
			
			for(int i=1;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int A = Integer.valueOf(st.nextToken());
				int B = Integer.valueOf(st.nextToken());
				parent[B]=A;
			}
			
			// 가장 가까운 공통 조상 찾기
			StringTokenizer st = new StringTokenizer(br.readLine());
			int NodeA = Integer.valueOf(st.nextToken());
			int NodeB = Integer.valueOf(st.nextToken());
			
			boolean[] visited = new boolean[N+1];
			while(NodeA!=0) {
				visited[NodeA]=true;
				NodeA = parent[NodeA];
			}
			
			while(!visited[NodeB]) {
				NodeB = parent[NodeB];
			}
			
			// 출력
			bw.write(Integer.toString(NodeB));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class