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
		
		while(N-->0) {
			BigInteger num = new BigInteger(br.readLine());
			BigInteger tmp = num;
			
			while(true) {
				bw.write(tmp+"\n");
				if(tmp.compareTo(new BigInteger("99"))<=0) {
					break;
				}
				
				BigInteger delete = tmp.mod(BigInteger.TEN);
				tmp = tmp.divide(BigInteger.TEN).subtract(delete);
			}
			
			if(tmp.mod(new BigInteger("11"))==BigInteger.ZERO) {
				bw.write("The number "+num+" is divisible by 11.\n\n");
			} else {
				bw.write("The number "+num+" is not divisible by 11.\n\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class