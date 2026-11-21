import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		int[] cost = new int[N+1];
		int[] beforeVisit = new int[N+1];
		Arrays.fill(cost, N);
		cost[N]=0;
		
		// N을 1로 만들기
		Queue<Integer> q = new LinkedList<>();
		q.offer(N);

		while(!q.isEmpty()) {
			int X = q.poll();
			
			// 1인 경우 종료
			if(X==1) {
				break;
			}
			
			// 3으로 나누어 떨어지는 경우 3으로 나눔
			if(X%3==0) {
				if(cost[X/3]>cost[X]+1) {
					cost[X/3]=cost[X]+1;
					beforeVisit[X/3]=X;
					q.offer(X/3);
				}
			}
			
			// 2로 나누어 떨어지는 경우 2로 나눔
			if(X%2==0) {
				if(cost[X/2]>cost[X]+1) {
					cost[X/2]=cost[X]+1;
					beforeVisit[X/2]=X;
					q.offer(X/2);
				}
			}
			
			// 1을 뺌
			if(cost[X-1]>cost[X]+1) {
				cost[X-1]=cost[X]+1;
				beforeVisit[X-1]=X;
				q.offer(X-1);
			}
		}
		
		// 경로 확인
		ArrayList<Integer> track = new ArrayList<>();
		int X=1;
		while(X!=0) {
			track.add(X);
			X=beforeVisit[X];
		}
		
		// 연산 횟수와 경로 출력
		bw.write(Integer.toString(cost[1]));
		bw.newLine();
		
		for(int i=cost[1];i>=0;i--) {
			bw.write(Integer.toString(track.get(i)));
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class