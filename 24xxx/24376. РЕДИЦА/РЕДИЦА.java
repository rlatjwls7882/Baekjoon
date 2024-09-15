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
		BigInteger x = new BigInteger(st.nextToken());
		int n = Integer.valueOf(st.nextToken())-1;
		
		BigInteger before = BigInteger.ONE;
		while(true) {
			before = before.multiply(x);
			int length = before.toString().length();
			
			if(n>length) {
				n -= length;
			} else {
				String string = before.toString();
				bw.write(string.charAt(n-1));
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class