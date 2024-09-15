import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	static int K;
	static int[] S;
	static int[] select;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			
			// 집합의 크기 K
			StringTokenizer st = new StringTokenizer(br.readLine());
			K = Integer.valueOf(st.nextToken());
			if(K==0) break;
			
			// 집합 S 입력 
			S = new int[K];
			for(int i=0;i<K;i++)
				S[i] = Integer.valueOf(st.nextToken());
			
			// S에서 6개를 고른 수열 계산
			visited = new boolean[K];
			select = new int[6];
			dfs(0, 0);
			sb.append('\n');
		}
		
		bw.write(sb.toString());
		bw.close();
	} // end of main()

	static void dfs(int depth, int idx) {
		
		// 수를 6개 고른 경우
		if(depth==6) {
			
			for(int val:select)
				sb.append(val).append(' ');
			sb.append('\n');
			
			return;
		}
		
		// 수를 6개 고를 때까지 반복
		for(int i=idx;i<K;i++)
			if(!visited[i]) {
				visited[i]=true;
				select[depth]=S[i];
				
				dfs(depth+1, i+1);
				visited[i]=false;
			}
		
	} // end of dfs()
} // end of Main class