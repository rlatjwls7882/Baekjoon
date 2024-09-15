import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static boolean[] visited;
	static ArrayList<PriorityQueue<Integer>> road = new ArrayList<>();
	static int virusNum=0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 컴퓨터의 수, 연결되어 있는 컴퓨터의 쌍의 수 입력
		int N = Integer.valueOf(br.readLine());
		int M = Integer.valueOf(br.readLine());

		// 바이러스에 걸린 컴퓨터 목록과 연결된 컴퓨터의 쌍의 목록 생성
		visited = new boolean[N];

		for(int i=0;i<N;i++)
			road.add(new PriorityQueue<Integer>());
		
		// M개의 연결된 컴퓨터의 쌍 입력
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;

			road.get(a).add(b);
			road.get(b).add(a);
		}
		
		// 1번 컴퓨터 때문에 바이러스에 걸린 컴퓨터의 수 계산
		bfs(0);
		bw.write(virusNum+"");
		
		bw.close();
	} // end of main

	public static void bfs(int i) {

        // 첫번째 노드
		Queue<Integer> bfs = new LinkedList<Integer>();
		bfs.offer(i);
		visited[i] = true;

        // 다음 노드 이동
		while(!bfs.isEmpty()) {
			int cur = bfs.poll();

			while(!road.get(cur).isEmpty()) {
				int go = road.get(cur).poll();

				if(visited[go])
					continue;

				visited[go] = true;
				bfs.offer(go);
				virusNum++;
			}
		}
	} // end of bfs
} // end of Main class