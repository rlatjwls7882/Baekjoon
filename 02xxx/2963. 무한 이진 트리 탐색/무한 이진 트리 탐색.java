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
		
		String string = br.readLine();
		
		BigInteger sum = BigInteger.ONE;
		BigInteger plus = BigInteger.ONE;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='L') {
				sum = sum.multiply(BigInteger.TWO);
			} else if(string.charAt(i)=='R') {
				sum = sum.multiply(BigInteger.TWO).add(plus);
			} else if(string.charAt(i)=='*') {
				sum = sum.multiply(new BigInteger("5")).add(plus);
				plus = plus.multiply(new BigInteger("3"));
			}
		}
		bw.write(sum.toString());
		
        bw.close();
    } // end of main
} // end of Main