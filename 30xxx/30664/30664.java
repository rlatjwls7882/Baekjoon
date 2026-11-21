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

		while(true) {
			BigInteger N = new BigInteger(br.readLine());
			if(N.equals(BigInteger.ZERO)) {
				break;
			}
			
			// N이 42의 배수인지 확인
			if(N.remainder(new BigInteger("42")).equals(BigInteger.ZERO)) {
				bw.write("PREMIADO\n");
			} else {
				bw.write("TENTE NOVAMENTE\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class