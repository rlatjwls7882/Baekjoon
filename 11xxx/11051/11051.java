import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[][] C;
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// NCK 계산
		C = new int[N+1][K+1];
		bw.write(Integer.toString(NCK(N, K)));
		
		bw.close();
	} // end of main()
	
	static int NCK(int N, int K) {
		
		if(C[N][K]>0) {
			return C[N][K];
		} else if(K==0||N==K) {
			return C[N][K] = 1;
		} else {
			return C[N][K] = (NCK(N-1, K) + NCK(N-1, K-1))%10007;
		}
		
	} // end of NCK()
} // end of Main class