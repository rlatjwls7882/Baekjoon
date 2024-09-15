import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 크리스마스의 기간 N
		long N = Integer.valueOf(br.readLine());
		
		// 선물받은 것들의 개수 출력
		for(long i=0;i<N;i++) {
			bw.write(Long.toString((N-i)*(i+1)));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class