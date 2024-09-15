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
		
		int N = Integer.valueOf(br.readLine());
		String S = br.readLine();
		int[] chars = new int[10];
		
		for(int i=0;i<N;i++) {
			chars[S.charAt(i)-'0']++;
		}
		
		BigInteger A=BigInteger.ZERO, B=BigInteger.ZERO;
		for(int i=1;i<10;) {
			while(i<10&&chars[i]==0) {
				i++;
			}
			if(i<10) {
				A = A.multiply(BigInteger.TEN).add(new BigInteger(Integer.toString(i)));
				chars[i]--;
			}
			
			while(i<10&&chars[i]==0) {
				i++;
			}
			if(i<10) {
				B = B.multiply(BigInteger.TEN).add(new BigInteger(Integer.toString(i)));
				chars[i]--;
			}
		}
		bw.write(A.add(B).toString());
		
		bw.close();
	} // end of main()
} // end of Main class