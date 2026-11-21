import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 연도수 입력
		int N = Integer.valueOf(br.readLine());
		
		// 그 연도에 해당하는 서양식 간지 출력
		String gan = "6789012345";
		String g = "IJKLABCDEFGH";
		
		bw.write(g.charAt(N%12)+""+gan.charAt(N%10));

		bw.close();
	} // end of main
} // end of Main class