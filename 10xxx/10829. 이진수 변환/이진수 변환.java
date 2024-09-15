import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// N 입력
		long N = Long.valueOf(br.readLine());
		
		// N을 이진수로 바꿔서 출력
		bw.write(Long.toBinaryString(N)+"");
		
		bw.close();
	} // end of main
} // end of Main class