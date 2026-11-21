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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			
			// X 계산
			st = new StringTokenizer(br.readLine());
			long X=0;
			for(int i=1;i<=M;i++) {
				X += Long.valueOf(st.nextToken())*Math.pow(10, M-i);
			}
			
			// Y 계산
			st = new StringTokenizer(br.readLine());
			long Y=0;
			for(int i=1;i<=M;i++) {
				Y += Long.valueOf(st.nextToken())*Math.pow(10, M-i);
			}
			
			// N등분한 수
			st = new StringTokenizer(br.readLine());
			long[] nums = new long[N];
			for(int i=0;i<N;i++) {
				nums[i] = Long.valueOf(st.nextToken());
			}
			
			// X<=Z<=Y를 만족하는 Z의 개수 계산
			int cnt=0;
			for(int i=0;i<N;i++) {
				
				long Z=0;
				for(int j=0;j<M;j++) {
					Z += nums[(i+j)%N]*Math.pow(10, M-1-j);
				}
				
				if(X<=Z&&Z<=Y) {
					cnt++;
				}
			}
			
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class