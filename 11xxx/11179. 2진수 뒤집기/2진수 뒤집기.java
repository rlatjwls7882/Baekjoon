import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 10진수 N을 이진수로 변환
		StringBuilder N = new StringBuilder(Integer.toBinaryString(Integer.valueOf(br.readLine())));
		
		// 이진수 N을 뒤집어 10진수로 출력
		bw.write(Integer.valueOf(N.reverse().toString(),2)+"");
		
		bw.close();
	} // end of main()
} // end of Main class