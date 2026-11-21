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
		
		for(int i=1;i<=T;i++) {
			int N = Integer.valueOf(br.readLine());
			
			// 모든 체크포인트 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] checkpoint = new int[N];
			for(int j=0;j<N;j++) {
				checkpoint[j] = Integer.valueOf(st.nextToken());
			}
			
			// 피크의 수 계산
			int peak=0;
			for(int j=1;j<N-1;j++) {
				if(checkpoint[j]>checkpoint[j-1]&&checkpoint[j]>checkpoint[j+1]) {
					peak++;
				}
			}
			
			bw.write(String.format("Case #%d: %d\n", i, peak));
		}
		
		bw.close();
	} // end of main()
} // end of Main class