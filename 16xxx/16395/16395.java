import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken())-1;
		int k = Integer.valueOf(st.nextToken())-1;

		// n번째 행의 k번째 수 계산
		if(n==0||k==0) {
			bw.write("1");
		} else {
			// nCk == (n)(n-1)...(n-k+1)/k!
			BigInteger sum = BigInteger.ONE;
			for(int i=0;i<k;i++) {
				sum = sum.multiply(new BigInteger(Integer.toString(n-i)));
			}
			for(int i=2;i<=k;i++) {
				sum = sum.divide(new BigInteger(Integer.toString(i)));
			}
			
			bw.write(sum.toString());
		}
		
		bw.close();
	} // end of main()
} // end of Main class