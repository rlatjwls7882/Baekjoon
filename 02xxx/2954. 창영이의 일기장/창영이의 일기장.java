import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 일기장에 작성한 문장 입력
		String string = br.readLine();
		
		// 원래 문장으로 바꾸어 출력
		bw.write(string.replace("apa", "a").replace("epe", "e").replace("ipi", "i")
                 .replace("opo", "o").replace("upu", "u"));

		bw.close();
	} // end of main
} // end of Main class