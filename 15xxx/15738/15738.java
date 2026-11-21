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
		
		// 배열의 크기 N, 위치 K, 연산의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 배열
		br.readLine();
		
		// M번의 연산 후의 K번째 수의 위치 계산
		while(M-->0) {
			int i = Integer.valueOf(br.readLine());
			
			if(i>0&&i>=K) {
				K = i-K+1;
			} else if(i<0&&N+i+1<=K) {
				// K = N-(K-(N+i+1));
				K = 2*N-K+i+1;
			}
		}
		
		// K번째 수의 위치 출력
		bw.write(Integer.toString(K));
		
		bw.close();
	} // end of main()
} // end of Main class