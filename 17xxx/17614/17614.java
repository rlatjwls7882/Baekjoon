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
		
		BigInteger N = new BigInteger(bf.readLine());
		BigInteger num = BigInteger.ZERO;
		
		for(BigInteger i = BigInteger.ONE;i.compareTo(N)<=0;i=i.add(BigInteger.ONE)) {
			
			BigInteger tmp = i;
			while(!tmp.equals(BigInteger.ZERO)) { //3 6 9 개수 확인
				
				if(tmp.remainder(BigInteger.TEN)==BigInteger.ZERO); // 1의자리숫자 0 제외
				else if(tmp.remainder(BigInteger.TEN).remainder(new BigInteger("3"))==BigInteger.ZERO)
					num = num.add(BigInteger.ONE);
				
				tmp = tmp.divide(BigInteger.TEN);
			}
		}
		
		bw.write(num+"");
		bw.close();
	} // end of main
} // end of main class