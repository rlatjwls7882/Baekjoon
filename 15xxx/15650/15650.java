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
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {

		// 자연수의 개수 N, 고르는 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		// 방문한 노드를 담을 배열 arr
		arr = new int[M];
		
		// 1부터 N까지 중복없이 M개를 고른 수열 출력
		dfs(1, 0);
		
		bw.write(sb.toString());
		bw.close();
	} // end of main()
	
	static void dfs(int start, int length) {
		
		// 길이가 M인 경우 출력
		if(length==M) {
			for(int i:arr)
				sb.append(i).append(' ');
			sb.append('\n');
			
			return;
		}
		
		// 길이가 M이 될때까지 방문
		for(int nodeNum=start;nodeNum<=N;nodeNum++) {
			arr[length]=nodeNum;
			dfs(nodeNum+1, length+1);
		}
	} // end of dfs()
} // end of Main class