import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int N, S, cnt;
	static int[] node;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 정수의 개수 N, 만들 합 S
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		S = Integer.valueOf(st.nextToken());
		
		// 수열 생성
		st = new StringTokenizer(br.readLine());
		node = new int[N];
		for(int i=0;i<N;i++)
			node[i] = Integer.valueOf(st.nextToken());
		
		// 합이 S가 되는 부분수열의 개수 계산
		visited = new boolean[N];
		for(int i=1;i<=N;i++)
			dfs(0, i, 0, 0);
		
		bw.write(cnt+"");
		bw.close();
	} // end of main()
	
	static void dfs(int depth, int end, int sum, int idx) {
		
		if(depth==end) {
			if(sum==S) cnt++;
			return;
		}
		
		for(int i=idx;i<N;i++)
			if(!visited[i]) {
				visited[i]=true;
				dfs(depth+1, end, sum+node[i], i+1);
				visited[i]=false;
			}
        
	} // end of dfs()
} // end of Main class