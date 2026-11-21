import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		// k번째로 작은 수 출력
		while(T-->0) {
			int k = Integer.valueOf(br.readLine());
			bw.write(Integer.toString(k*23));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class