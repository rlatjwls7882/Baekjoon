import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 두 이진수 입력
		long B1 = Long.valueOf(br.readLine(),2);
		long B2 = Long.valueOf(br.readLine(),2);
		
		// 곱을 이진수로 출력
		bw.write(Long.toBinaryString(B1*B2));
		
		bw.close();
	} // end of main
} // end of Main class