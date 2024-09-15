import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 암호 K와 L
		StringTokenizer st = new StringTokenizer(bf.readLine());
		BigInteger K = new BigInteger(st.nextToken());
		BigInteger L = new BigInteger(st.nextToken());

		// 두 소수중 작은 값 p 계산
		BigInteger p = BigInteger.TWO;

		for(;p.compareTo(L)<0;p = p.add(BigInteger.ONE))
			if(K.remainder(p)==BigInteger.ZERO)
				break;

		// 좋은 암호인지 판단
		bw.write(String.format("%s", p.compareTo(L)>=0?"GOOD":"BAD "+p));
		
		bw.close();
	} // end of main
} // end of main class