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
		String opt = bf.readLine();
		BigInteger B = new BigInteger(bf.readLine());
			
		if(opt.equals("*"))
			bw.write(A.multiply(B)+"");
		else
			bw.write(A.add(B)+"");
		
		bw.close();
	} // end of main
} // end of main class