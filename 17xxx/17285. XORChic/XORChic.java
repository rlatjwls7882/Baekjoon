import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String string = br.readLine();
		int key = string.charAt(0)^'C';
		
		// XOR 연산이 수행되기 이전의 문자열 출력
		for(int i=0;i<string.length();i++) {
			bw.write(string.charAt(i)^key);
		}

		bw.close();
	} // end of main()
} // end of Main class