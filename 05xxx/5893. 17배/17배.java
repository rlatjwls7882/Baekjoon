import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

import org.xml.sax.ext.Attributes2;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		BigInteger N = new BigInteger(bf.readLine(),2);
		N = N.multiply(new BigInteger("17"));
		
		bw.write(N.toString(2)+"");
		bw.close();
	} // end of main
} // end of main class