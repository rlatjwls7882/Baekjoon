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
		
		BigInteger n = new BigInteger(br.readLine());
		
		if(n.equals(BigInteger.ZERO)) {
			bw.write("1");
		} else {
			bw.write("2486".charAt(n.subtract(BigInteger.ONE).mod(new BigInteger("4")).intValue()));
		}
		
		bw.close();
	} // end of main()
} // end of Main class