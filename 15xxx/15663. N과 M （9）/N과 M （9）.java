import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
	static LinkedHashSet<String> set = new LinkedHashSet<>();
	
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
		
		// 방문한 노드를 확인하는 visited, 현재 방문중인 목록 visitList
		visited = new boolean[N];
		visitList = new int[M];

		// 길이 M의 중복이 없는 수열 출력
		dfs(0);
		
		for(String val:set)
			bw.write(val);
		
		bw.close();
	} // end of main()
	
	static void dfs(int depth) {
		
		// 총 M개를 방문한 경우
		if(depth==M) {
			StringBuilder sb = new StringBuilder();
			for(int val:visitList)
				sb.append(val).append(' ');
			sb.append('\n');
			
			set.add(sb.toString());
			return;
		}
		
		// 총 M개를 방문할 때까지 반복
		for(int nodeNum=0;nodeNum<N;nodeNum++)
			if(!visited[nodeNum]) {
				
				// 방문
				visited[nodeNum]=true;
				visitList[depth]=node[nodeNum];
				dfs(depth+1);
				
				// 방문 종료
				visited[nodeNum]=false;
			}
		
	} // end of dfs()
} // end of Main class