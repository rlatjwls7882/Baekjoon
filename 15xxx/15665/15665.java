import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	static int M;
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
		TreeSet<Integer> set = new TreeSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			set.add(Integer.valueOf(st.nextToken()));
		
		N = set.size();
		node = new int[N];
		
		for(int i=0;i<N;i++)
			node[i]=set.pollFirst();
		
		// 현재 방문중인 목록 visitList
		visitList = new int[M];

		// 길이 M의 중복순열 출력
		dfs(0);
		
		bw.write(sb.toString());
		bw.close();
	} // end of main()
	
	static void dfs(int depth) {
		
		// 총 M개를 방문한 경우
		if(depth==M) {
			for(int val:visitList)
				sb.append(val).append(' ');
			sb.append('\n');
			
			return;
		}
		
		// 총 M개를 방문할 때까지 반복
		for(int nodeNum=0;nodeNum<N;nodeNum++) {
			visitList[depth]=node[nodeNum];
			dfs(depth+1);
		}
		
	} // end of dfs()
} // end of Main class