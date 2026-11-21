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
		
		/*
		 * 1(1) : 0
		 * 2(3) : 00 1 2
		 * 3(5) : 000 01 10 02 20
		 * 4(11) : 0000 001 010 100 11 002 020 200 21 12 22
		 */
		
		BigInteger[] method = new BigInteger[251];
		method[0]=method[1]=BigInteger.ONE;
		
		for(int i=2;i<=250;i++) {
			if(i%2==0) {
				method[i] = method[i-1].multiply(BigInteger.TWO).add(BigInteger.ONE);
			} else {
				method[i] = method[i-1].multiply(BigInteger.TWO).subtract(BigInteger.ONE);
			}
		}
		
		// 2*n 직사각형을 채우는 방법 계산
		while(true) {
			
			String string = br.readLine();
			if(string==null) {
				break;
			}
			
			bw.write(method[Integer.valueOf(string)].toString());
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class