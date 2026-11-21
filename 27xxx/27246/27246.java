import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		long n = Long.valueOf(br.readLine());
		
		// 만들 수 있는 서로 다른 정사각형의 수 계산
		long i=1;
		while(i*i<=n) {
			n -= i*i;
			i++;
		}
		bw.write(Long.toString(i-1));
		
		bw.close();
	} // end of main()
} // end of Main class