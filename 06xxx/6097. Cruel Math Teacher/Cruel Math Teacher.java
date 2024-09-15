import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger N = new BigInteger(st.nextToken());
		int P = Integer.valueOf(st.nextToken());
		
		String string = N.pow(P).toString();
		for(int idx=0;idx<string.length();idx+=70) {
			bw.write(string.substring(idx, Math.min(string.length(), idx+70))+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class