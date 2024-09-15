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
		
		BigInteger N = new BigInteger(br.readLine());
		
		// 처음으로 실수한 구간 확인
		int idx=64;
		while(N.remainder(BigInteger.TWO).equals(BigInteger.ZERO)) {
			N = N.divide(BigInteger.TWO);
			idx--;
		}
		
		bw.write(Integer.toString(idx));
		
		bw.close();
	} // end of main()
} // end of Main class