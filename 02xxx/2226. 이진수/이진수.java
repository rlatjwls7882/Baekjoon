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
		
		// 0, 1, 1, 3, 5, 11, ...
		int n = Integer.valueOf(br.readLine());
		BigInteger val = BigInteger.ZERO;
		for(int i=0;i<n-1;i++) {
			if(i%2==0) val = val.multiply(BigInteger.TWO).add(BigInteger.ONE);
			else val = val.multiply(BigInteger.TWO).subtract(BigInteger.ONE);
		}
		bw.write(val.toString());
		
        bw.close();
    } // end of main
} // end of Main