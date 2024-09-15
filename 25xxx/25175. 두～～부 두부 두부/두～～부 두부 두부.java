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
		
		// 게임을 하는 사람의 수 N, 현재 차례인 사람의 번호 M, 부른 두부의 모 수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 다음 차례인 사람의 번호 계산
		if(K<=3) {
			M-=3-K;
		} else {
			M+=K-3;
		}
		
		M%=N;
		if(M<=0) {
			M+=N;
		}
		
		bw.write(Integer.toString(M));
		
		bw.close();
	} // end of main()
} // end of Main class