import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(br.readLine());
		
		BigInteger F0 = BigInteger.ZERO;
		BigInteger F1 = BigInteger.ONE;
		
		// n번째 피보나치 수 계산
		while(n-->0) {
			BigInteger tmp = F0;
			F0 = F1;
			F1 = F1.add(tmp);
		}
		
		bw.write(F0+"");
		
		bw.close();
	} // end of main
} // end of Main class