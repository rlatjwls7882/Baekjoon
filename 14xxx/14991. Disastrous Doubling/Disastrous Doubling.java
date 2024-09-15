import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger bacteria=BigInteger.ONE;
		boolean chk=true;
		while(n-->0) {
			BigInteger require = new BigInteger(st.nextToken());
			bacteria = bacteria.multiply(BigInteger.TWO);
			
			if(bacteria.compareTo(require)<0) {
				chk=false;
				break;
			} else {
				bacteria = bacteria.subtract(require);
			}
		}
		
		if(chk) {
			bw.write(bacteria.mod(new BigInteger("1000000007")).toString());
		} else {
			bw.write("error");
		}

		bw.close();
	} // end of main()
} // end of Main class