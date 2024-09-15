import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		long K = Long.valueOf(st.nextToken())%3;
		String string = br.readLine();
		
		int idx1 = N/4;
		int idx3 = idx1*3;
		
		while(K-->0) {
			string = string.substring(0, idx1)+string.substring(idx3, N)+string.substring(idx1, idx3);
		}
		bw.write(string);
		
		bw.close();
	} // end of main()
} // end of Main class