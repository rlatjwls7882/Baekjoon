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

		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			BigInteger num = new BigInteger(bf.readLine());
			
			if(num.remainder(BigInteger.TWO).equals(BigInteger.ZERO))
				bw.write("even\n");
			else
				bw.write("odd\n");
		}
		
		bw.close();
	} // end of main
} // end of main class