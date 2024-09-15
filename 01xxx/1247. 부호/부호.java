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
		
		for(int i=0;i<3;i++) {
			int N = Integer.valueOf(bf.readLine());
			BigInteger S = BigInteger.ZERO;
			
			while(N--!=0)
				S = S.add(new BigInteger(bf.readLine()));
			
			if(S.compareTo(BigInteger.ZERO)==0) bw.write("0\n");
			else if(S.compareTo(BigInteger.ZERO)>0) bw.write("+\n");
			else bw.write("-\n");
		}
		
		bw.close();
	} // end of main
} // end of main class