import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스의 개수 T
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// A, B 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			long A = Long.valueOf(st.nextToken());
			long B = Long.valueOf(st.nextToken());
			
			// 길이가 A인 정삼각형을 덮을 수 있는 길이가 B인 정삼각형의 개수 계산
			bw.write(A*A/B/B+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class