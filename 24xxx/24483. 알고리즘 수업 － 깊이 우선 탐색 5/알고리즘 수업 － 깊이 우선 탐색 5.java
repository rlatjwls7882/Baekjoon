import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	static int N;
	static long idx=1, sum;
	static int[] node;
	static ArrayList<TreeSet<Integer>> link = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 정점의 수 N, 간선의 수 M, 시작지점 R
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int R = Integer.valueOf(st.nextToken())-1;
		
		// 간선 입력
		link = new ArrayList<>();
		for(int i=0;i<N;i++)
			link.add(new TreeSet<Integer>());
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			link.get(a).add(b);
			link.get(b).add(a);
		}
		
		// 각 노드의 di*ti의 합 계산
		node = new int[N];
		Arrays.fill(node, -1);
		
		dfs(R, 0);
		
		bw.write(sum+"\n");

		bw.close();
	} // end of main()
	
	static void dfs(int nodeNum, int depth) {
		
		node[nodeNum]=depth;
		sum += depth*idx++;
		
		for(int childNode:link.get(nodeNum))
			if(node[childNode]==-1)
				dfs(childNode, depth+1);
		
	} // end of dfs()
} // end of Main class