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

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			// 돼지의 초기 사료양
			StringTokenizer st = new StringTokenizer(br.readLine());
			long[] pigs = new long[6];
			for(int i=0;i<6;i++) {
				pigs[i] = Long.valueOf(st.nextToken());
			}
			
			// 돼지의 요구를 들어줄 수 없게 되는 날 확인
			for(int day=1;;day++) {
				
				// 요구를 들어줄 수 없음
				long sum=0;
				for(int i=0;i<6;i++) {
					sum += pigs[i];
				}
				
				if(sum>N) {
					bw.write(Long.toString(day));
					bw.newLine();
					break;
				}
				
				// 다음 날의 요구사항
				long[] nextday = new long[6];
				for(int i=0;i<6;i++) {
					nextday[i] = pigs[i]+pigs[(i+1)%6]+pigs[Math.max(i-1, (i+5)%6)]+pigs[(i+3)%6];
				}
				
				for(int i=0;i<6;i++) {
					pigs[i] = nextday[i];
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class