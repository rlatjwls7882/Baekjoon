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

		// 두 개의 이진수 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken(), 2);
		BigInteger B = new BigInteger(st.nextToken(), 2);
		
		// 이진수의 덧셈 결과 출력
		bw.write(A.add(B).toString(2)+"");
		
		bw.close();
	} // end of main
} // end of Main class