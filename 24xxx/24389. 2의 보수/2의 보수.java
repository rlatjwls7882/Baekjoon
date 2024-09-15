import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// N과 N의 보수의 서로 다른 비트의 수 계산
		int N = Integer.valueOf(br.readLine());
		int notN = ~N+1;
		
		bw.write(Integer.toString(Integer.bitCount(N^notN)));
		
		bw.close();
	} // end of main()
} // end of Main class