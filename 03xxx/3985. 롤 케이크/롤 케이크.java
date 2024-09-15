import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 롤 케이크의 길이 L, 방청객의 수 N
		int L = Integer.valueOf(br.readLine());
		int N = Integer.valueOf(br.readLine());
		
		// 실제로 가장 많이 받는 방청객과 자신이 가장 많이 받을거라 예상하는 방청객 확인
		int realMax=0, realIdx=1;
		int expectMax=0, expectIdx=1;
		boolean[] rollCake = new boolean[L+1];
		
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int P = Integer.valueOf(st.nextToken());
			int K = Integer.valueOf(st.nextToken());
			
			// 각 방청객의 기댓값
			if(K-P>expectMax) {
				expectMax=K-P;
				expectIdx=i;
			}
			
			// 각 방청객이 받는 실제 조각의 수
			int cnt=0;
			for(;P<=K;P++) {
				if(!rollCake[P]) {
					cnt++;
					rollCake[P]=true;
				}
			}
			
			if(realMax<cnt) {
				realMax = cnt;
				realIdx = i;
			}
		}
		
		bw.write(Integer.toString(expectIdx));
		bw.newLine();
		bw.write(Integer.toString(realIdx));
		
		bw.close();
	} // end of main()
} // end of Main class