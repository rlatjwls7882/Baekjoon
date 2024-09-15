import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long MOD = 1_000_000_007;
	
	public static void main(String[] args) throws IOException {
		
		int L = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// 각 염기의 개수 계산
		long A=0, C=0, G=0, T=0;
		for(int i=0;i<L;i++) {
			if(string.charAt(i)=='A') {
				A++;
			} else if(string.charAt(i)=='C') {
				C++;
			} else if(string.charAt(i)=='G') {
				G++;
			} else {
				T++;
			}
		}
		
		// 가능한 피노키오의 종류 계산
		bw.write(Long.toString(A*C%MOD*G%MOD*T%MOD));
		
		bw.close();
	} // end of main()
} // end of Main class