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
		
		int N = Integer.valueOf(br.readLine());

		BigInteger val = BigInteger.ONE;
		for(int i=2;i<=N;i++) {
			val = val.multiply(new BigInteger(Integer.toString(i)));
		}
		
		int cnt=0;
		String string = val.toString();
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='0') {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class