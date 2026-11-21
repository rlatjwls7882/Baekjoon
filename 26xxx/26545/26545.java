import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long N = Long.valueOf(bf.readLine());
		BigInteger sum = BigInteger.ZERO;
		
		while(N--!=0) {
			BigInteger a = new BigInteger(bf.readLine());
			sum = sum.add(a);
		}
		
		bw.write(sum+"");
		bw.close();
	} // end of main
} // end of main class