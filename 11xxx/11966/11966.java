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
		
		BigInteger N = new BigInteger(bf.readLine());
		BigInteger start = new BigInteger("1");
		
		while(N.compareTo(start)>0)
			start = start.multiply(BigInteger.TWO);
		
		if(N.equals(start))
			bw.write("1");
		else
			bw.write("0");
		
		bw.close();
	} // end of main
} // end of main class