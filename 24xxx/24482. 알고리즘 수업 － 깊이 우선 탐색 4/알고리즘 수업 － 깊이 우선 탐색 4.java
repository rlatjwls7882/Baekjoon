import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	static int N;
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
			link.add(new TreeSet<Integer>(Collections.reverseOrder()));
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			link.get(a).add(b);
			link.get(b).add(a);
		}
		
		// 각 노드의 깊이 계산
		node = new int[N];
		Arrays.fill(node, -1);
		
		dfs(R, 0);
		
		for(int val:node)
			bw.write(val+"\n");

		bw.close();
	} // end of main()
	
	static void dfs(int nodeNum, int depth) {
		
		node[nodeNum]=depth;
		
		for(int childNode:link.get(nodeNum))
			if(node[childNode]==-1)
				dfs(childNode, depth+1);
		
	} // end of dfs()
} // end of Main class