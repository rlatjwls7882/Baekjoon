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

		// 대회에 참여할 수 있는 방법을 M으로 나눈 나머지 계산
		int method = 1%M;
		
		while(N-->0) {
			int A = Integer.valueOf(br.readLine());
			method *= Math.max(1, A);
			method %= M;
		}
		
		bw.write(Integer.toString(method));
		
		bw.close();
	} // end of main()
} // end of Main class