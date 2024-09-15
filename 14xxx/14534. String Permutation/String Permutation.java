import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	static String string;
	static int N;
	static boolean[] visited;
	static char[] visitList;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		
		// 각 문자열의 구성요소의 모든 순열 출력
		for(int numCases=1;numCases<=T;numCases++) {
			sb.append("Case # ").append(numCases).append(":\n");
			string = br.readLine();
			
			N = string.length();
			visited = new boolean[N];
			visitList = new char[N];
			
			dfs(0);
		}
		
		bw.write(sb.toString());
		bw.close();
	} // end of main()
	
	static void dfs(int depth) {
		
		// 총 N개를 방문한 경우
		if(depth==N) {
			for(char val:visitList)
				sb.append(val);
			sb.append('\n');
			
			return;
		}
		
		// N개를 방문할 때까지 반복
		for(int nodeNum=0;nodeNum<N;nodeNum++)
			if(!visited[nodeNum]) {
				visitList[depth]=string.charAt(nodeNum);
				visited[nodeNum]=true;
				
				dfs(depth+1);
				visited[nodeNum]=false;
			}
	} // end of dfs()
} // end of Main class