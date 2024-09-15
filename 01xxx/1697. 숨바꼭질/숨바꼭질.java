import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int K;
	static int[] arriveTime;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 수빈이의 위치 N, 동생의 위치 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		
		// 수빈이가 동생을 찾는 가장 빠른 시간 계산
		arriveTime = new int[Math.max(N, K)*2+1];
		visited = new boolean[Math.max(N, K)*2+1];
		bfs();
		
		bw.write(arriveTime[K]+"");
		bw.close();
	} // end of main()
	
	static void bfs() {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(N);
		visited[N]=true;
		
		while(!queue.isEmpty()) {
			int pos = queue.poll();
			
			// 동생에게 도착한 경우
			if(pos==K) {
				return;
			}

			// 이동
			if(pos>0&&!visited[pos-1]) {
				queue.add(pos-1);
				visited[pos-1]=true;
				arriveTime[pos-1]=arriveTime[pos]+1;
			} if(pos<K) {
				if(!visited[pos+1]) {
					queue.add(pos+1);
					visited[pos+1]=true;
					arriveTime[pos+1]=arriveTime[pos]+1;
				} if(!visited[pos*2]) {
					queue.add(pos*2);
					visited[pos*2]=true;
					arriveTime[pos*2]=arriveTime[pos]+1;
				}
			}
		}
	} // end of bfs()
} // end of Main class