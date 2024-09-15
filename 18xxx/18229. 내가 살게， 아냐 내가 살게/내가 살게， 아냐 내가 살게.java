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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 배열 A 입력
		int[][] A = new int[N][M+1];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=M;j++) {
				A[i][j] = Integer.valueOf(st.nextToken()) + A[i][j-1];
			}
		}
		
		// 결제한 사람이 누구인지 확인
		for(int i=1;i<=M;i++) {
			for(int j=0;j<N;j++) {
				if(A[j][i]>=K) {
					bw.write(Integer.toString(j+1));
					bw.write(' ');
					bw.write(Integer.toString(i));
					i=j=100;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class