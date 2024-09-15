import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 새의 수 N 입력
		int N = Integer.valueOf(br.readLine());
		
		// 모든 새가 날아가는데 걸리는 시간 계산
		int sec=0;
		
		while(N!=0) {
			
			// n(n+1)/2 = N
			int n = (int)(Math.sqrt(2*N+1/4.)-1/2.);
			
			N -= n*(n+1)/2;
			sec += n;
		}
		
		// 모든 새가 날아가는데 걸리는 시간 출력
		bw.write(sec+"");
		
		bw.close();
	} // end of main
} // end of Main class