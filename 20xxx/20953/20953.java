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
		
		// dolmen(a, b)의 실행 결과 계산
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n = Long.valueOf(st.nextToken())+Long.valueOf(st.nextToken());
			
			// = (a+b-1)(a+b)/2 * (a+b)
			bw.write(Long.toString((n-1)*n*n/2));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class