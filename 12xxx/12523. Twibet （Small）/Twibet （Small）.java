import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
	static int N;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스의 수 T
		int T = Integer.valueOf(br.readLine());
		
		for(int numCases=1;numCases<=T;numCases++) {
			
			// 수도사의 수
			N = Integer.valueOf(br.readLine());
			
			// 각 수도사를 따르는 수도사 목록
			tree.clear();
			for(int i=0;i<N;i++)
				tree.add(new ArrayList<>());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++)
				tree.get(Integer.valueOf(st.nextToken())-1).add(i);
			
			// 각 날마다 말씀에 대해 속삭일 수도사의 수 계산
			bw.write(String.format("Case #%d:\n", numCases));

			visited = new boolean[N];
			for(int i=0;i<N;i++) {
				bw.write(bfs(i)+"\n");
				Arrays.fill(visited, false);
			}
		}

		bw.close();
	} // end of main()

	static int bfs(int x) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(x);
		visited[x]=true;
		int cnt=1;

		while(!queue.isEmpty()) {
			for(int i:tree.get(queue.poll())) {
				if(!visited[i]) {
					queue.add(i);
					visited[i]=true;
					cnt++;
				}
			}
		}

		return cnt;
	} // end of bfs()
} // end of Main class