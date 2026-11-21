import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	static int M;
	static boolean[] visited;
	static int[] visitList;
	static int[] node;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 자연수의 개수 N, 뽑는 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		// 뽑을 수의 종류 node
		node = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			node[i] = Integer.valueOf(st.nextToken());
		Arrays.sort(node);
		
		// 방문한 노드를 확인할 visited, 현재 방문중인 목록 visitList
		visited = new boolean[N];
		visitList = new int[M];

		// N개의 자연수에서 M개를 고른 수열 출력
		dfs(0);
		
		bw.write(sb.toString());
		bw.close();
	} // end of main()
	
	static void dfs(int depth) {
		
		if(depth==M) {
			for(int i:visitList)
				sb.append(i).append(' ');
			sb.append('\n');
			
			return;
		}
		
		for(int nodeNum=0;nodeNum<N;nodeNum++)
			if(!visited[nodeNum]) {
				
				visited[nodeNum]=true;
				visitList[depth]=node[nodeNum];
				dfs(depth+1);
				
				visited[nodeNum]=false;
			}
        
	} // end of dfs()
} // end of Main class