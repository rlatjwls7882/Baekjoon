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
		long A = Long.valueOf(st.nextToken());
		long B = Long.valueOf(st.nextToken());
		long C = Long.valueOf(st.nextToken());
		
		// A를 B번 곱한 수를 C로 나눈 나머지 계산
		bw.write(Long.toString(multiple(A, B, C)));
		
		bw.close();
	} // end of main()
	
	// A^B%C
	static long multiple(long A, long B, long C) {
		
		if(B==0) {
			return 1L;
		} else if(B==1) {
			return A%C;
		}
		
		long key = multiple(A, B/2, C);
		if(B%2==0) {
			return key*key%C;
		} else {
			return (key*key%C*A)%C;
		}
		
	} // end of multiple()
} // end of Main class