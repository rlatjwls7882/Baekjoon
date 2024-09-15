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

		// 피제수 A, 제수 B, 구할 소수점 아래 자리수 N
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		
		// 소수점 아래 N번째 수 계산
		int num=0;
		while(N-->-1) {
			num = A/B;
			A=A%B*10;
		}
		
		bw.write(Integer.toString(num));

		bw.close();
	} // end of main()
} // end of Main class