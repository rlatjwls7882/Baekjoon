import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			String string = br.readLine().trim();
			try {
				if(string.charAt(0)=='-') {
					throw new Exception();
				}
				bw.write(new BigInteger(string)+"\n");
			} catch (Exception e) {
				bw.write("invalid input\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class