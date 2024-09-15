import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static long sum;
	static int[] node;
	static ArrayList<ArrayList<Integer>> link = new ArrayList<>();
	
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
			link.add(new ArrayList<>());
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			link.get(a).add(b);
			link.get(b).add(a);
		}
		
		// 모든 노드에 대한 di * ti 계산
		node = new int[N];
		Arrays.fill(node, -1);
		bfs(R);
		
		bw.write(sum+"");

		bw.close();
	} // end of main()
	
	static void bfs(int start) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(start);
		node[start]=0;
		long idx=2;

		while(!queue.isEmpty()) {
			start = queue.poll();

			for(int nodeNum:link.get(start))
				if(node[nodeNum]==-1) {
					queue.add(nodeNum);
					node[nodeNum]=node[start]+1;
					sum += node[nodeNum]*idx++;
				}
		}

	} // end of bfs()
} // end of Main class