import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 포인트 카드에 있는 칸의 수 N, 포인트 카드의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 돈을 더 내지 않고도 경품을 받는 개수 계산
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int cnt=0;
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			int B = Integer.valueOf(st.nextToken());
			
			if(B<=N) {
				cnt++;
			} else {
				pq.add(B);
			}
		}
		
		// M-1개의 경품을 얻기 위한 최소 비용 계산
		int cost=0;
		
		while(cnt<M-1) {
			cost += pq.poll()-N;
			cnt++;
		}
		
		bw.write(Integer.toString(cost));
		
		bw.close();
	} // end of main()
} // end of Main class