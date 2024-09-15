import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[] parent;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 노드의 개수 N
		N = Integer.valueOf(br.readLine());
		
		// 노드 사이의 연결 입력
		for(int i=0;i<N;i++)
			list.add(new ArrayList<Integer>());
		
		for(int i=1;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int node1 = Integer.valueOf(st.nextToken())-1;
			int node2 = Integer.valueOf(st.nextToken())-1;
			
			list.get(node1).add(node2);
			list.get(node2).add(node1);
		}
		
		// 부모 노드의 정보를 담을 parent, 방문한 노드 목록 visited
		parent = new int[N];
		visited = new boolean[N];
		
		// 각 노드의 부모 노드 확인
		bfs(0);
		
		for(int nodeNum=1;nodeNum<N;nodeNum++)
			bw.write(parent[nodeNum]+"\n");
		
		bw.close();
	} // end of main()

	static void bfs(int start) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start]=true;
		
		while(!queue.isEmpty()) {
			int pos = queue.poll();

			for(int nodeNum:list.get(pos))
				if(!visited[nodeNum]) {
					queue.add(nodeNum);
					parent[nodeNum]=pos+1;
					visited[nodeNum]=true;
				}
		}
		
	} // end of bfs()
} // end of Main class