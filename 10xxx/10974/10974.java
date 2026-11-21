import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	static boolean[] visited;
	static int[] visitList;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.valueOf(br.readLine());

        // 방문한 노드를 확인하는 visited, 현재 방문중인 목록 visitList
		visited = new boolean[N];
		visitList = new int[N];
		
		// 만들 수 있는 모든 순열 출력
		dfs(0);
		
		bw.write(sb.toString());
		bw.close();
	} // end of main()
	
	static void dfs(int depth) {
		
		// 총 N개를 방문한 경우
		if(depth==N) {
			for(int val:visitList)
				sb.append(val).append(' ');
			sb.append('\n');
			
			return;
		}
		
		// N개를 방문할 때까지 반복
		for(int nodeNum=0;nodeNum<N;nodeNum++)
			if(!visited[nodeNum]) {
				visitList[depth]=nodeNum+1;
				visited[nodeNum]=true;
				
				dfs(depth+1);
				visited[nodeNum]=false;
			}
	} // end of dfs()
} // end of Main class