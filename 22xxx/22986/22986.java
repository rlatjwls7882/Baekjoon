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
			long N = Long.valueOf(st.nextToken());
			long K = Math.min(N, Long.valueOf(st.nextToken()));
			
			// 지구의 끝에 도달할 수 있는 칸의 수 계산
			long cnt=N*(N+1)/2-(N-K-1)*(N-K)/2;
			bw.write(Long.toString(cnt*4));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class