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

		// P의 바닥수 N, P의 자릿수 L
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int L = Integer.valueOf(st.nextToken());
		
		// 원래 P 계산 (L-1번째 숫자까지 1, L번째 수는 바닥수)
		for(int i=1;i<L;i++) {
			bw.write("1");
		}
		bw.write(Integer.toString(N));
		
		bw.close();
	} // end of main()
} // end of Main class