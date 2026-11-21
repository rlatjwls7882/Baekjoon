import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 큐의 크기 N, 뽑아내려고 하는 수의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 뽑아내는 수
		st = new StringTokenizer(br.readLine());
		int[] pop = new int[M];
		for(int i=0;i<M;i++)
			pop[i] = Integer.valueOf(st.nextToken());
		
		// 큐에서 모든 수를 뽑아내는데 드는 2번, 3번 연산의 최소 횟수 계산
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i=1;i<=N;i++)
			queue.add(i);
		
		int cnt=0;
		for(int i=0;i<M;i++) {
			
			// 뽑아낼 수의 위치
			int idx=0;
			for(int j=0;j<queue.size();j++)
				if(queue.get(j)==pop[i]) {
					idx=j;
					break;
				}

			// 앞에서 더 가까운 경우
			if(idx<=queue.size()-idx) {
				cnt += idx;
				while(idx-->0)
					queue.add(queue.poll());
				queue.poll();
			}

			// 뒤에서 더 가까운 경우
			else {
				idx = queue.size()-idx;
				cnt += idx;
				while(idx-->0)
					queue.addFirst(queue.pollLast());
				queue.poll();
			}
		}
		
		bw.write(cnt+"\n");

		bw.close();
	} // end of main
} // end of Main class