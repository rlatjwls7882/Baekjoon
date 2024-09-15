import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		int[] cost = new int[N+1];
		Arrays.fill(cost, N);
		cost[1]=0;
		
		// 1에서 N으로 가기
		for(int i=2;i<=N;i++) {
			
			// *3
			if(i%3==0) {
				cost[i]=cost[i/3]+1;
			}
			
			// *2
			if(i%2==0) {
				if(cost[i]>cost[i/2]+1) {
					cost[i]=cost[i/2]+1;
				}
			}
			
			// +1
			if(cost[i]>cost[i-1]+1) {
				cost[i]=cost[i-1]+1;
			}
		}
		
		// 연산하는 최소 횟수 출력
		bw.write(Integer.toString(cost[N]));
		
		bw.close();
	} // end of main()
} // end of Main class