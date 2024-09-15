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
		
		// 4^0 + 4^1 + 4^2 + ...
		int N = Integer.valueOf(br.readLine());
		bw.write(new BigInteger("4").pow(N).subtract(BigInteger.ONE).divide(new BigInteger("3")).mod(new BigInteger("500000009")).toString());
		
		bw.close();
	} // end of main()
} // end of Main class