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

		BigInteger a = new BigInteger(bf.readLine());
		BigInteger b = new BigInteger(bf.readLine());
		BigInteger c = new BigInteger(bf.readLine());

		BigInteger output = (b.subtract(c)).divide(a);
				
		bw.write(output+"");
		bw.close();
	} // end of main
} // end of main class