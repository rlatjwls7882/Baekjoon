import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		// 피보나치 수 계산
		BigInteger[] F = new BigInteger[N+2];
		F[0]=BigInteger.ZERO;
		F[1]=BigInteger.ONE;
		
		for(int i=2;i<=N;i++)
			F[i]=F[i-1].add(F[i-2]);
		
		bw.write(F[N]+"");
		
		bw.close();
	} // end of main
} // end of Main class