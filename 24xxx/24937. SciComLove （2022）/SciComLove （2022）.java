import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String string = "SciComLove";
		
		// N번 반복한 후의 최종 상태 출력
		int N = Integer.valueOf(br.readLine())%10;
		
		bw.write(string.substring(N));
		bw.write(string.substring(0, N));
		
		bw.close();
	} // end of main()
} // end of Main class