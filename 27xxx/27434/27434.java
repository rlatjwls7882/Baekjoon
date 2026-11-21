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

		bw.write(fact(1, N).toString());
		bw.close();
	} // end of main
	
	static BigInteger fact(int a, int N) {
		BigInteger tmp = BigInteger.valueOf(a);
		
		if(a<N) {
			int b = (a+N)/2;
			tmp=fact(a, b).multiply(fact(b+1, N));
		}
		
		return tmp;
	} // end of fact
} // end of main class