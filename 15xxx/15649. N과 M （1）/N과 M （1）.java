import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int N;
	static int M;
	static int[] arr;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {

		// 자연수의 개수 N, 고르는 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		// 방문한 노드를 담을 배열 arr, 방문한 노드를 확인할 배열 visited
		arr = new int[M];
		visited = new boolean[N+1];
		
		// 백트랙킹 수행
		dfs(0);
		
		bw.close();
	} // end of main()
	
	static void dfs(int length) throws IOException {
		
		// 길이가 M인 경우 출력
		if(length==M) {
			for(int i:arr)
				bw.write(i+" ");
			bw.write("\n");
			
			return;
		}
		
		// 길이가 M이 될때까지 방문
		for(int nodeNum=1;nodeNum<=N;nodeNum++) {
			if(!visited[nodeNum]) {
				
				// 방문
				visited[nodeNum]=true;
				arr[length]=nodeNum;
				dfs(length+1);
				
				// 방문 완료 후 복귀
				visited[nodeNum]=false;
			}
		}
	} // end of dfs()
} // end of Main class