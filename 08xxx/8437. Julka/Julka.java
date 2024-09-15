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

		BigInteger A = new BigInteger(bf.readLine());
		BigInteger B = new BigInteger(bf.readLine());
		
		bw.write((A.add(B)).divide(BigInteger.TWO)+"\n");
		bw.write((A.subtract(B)).divide(BigInteger.TWO)+"");
		bw.close();
		
	} // end of main
} // end of main class