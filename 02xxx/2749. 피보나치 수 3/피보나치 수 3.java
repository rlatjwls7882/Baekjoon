import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long MOD = 1_000_000;
		long n = Long.valueOf(br.readLine())%(MOD*15/10);
		long F0=0;
		long F1=1;
		
		// n번째 피보나치 수 계산
		while(n-->0) {
			long tmp = F0;
			F0=F1;
			F1=(F1+tmp)%MOD;
		}
		
		bw.write(F0+"");
		
		bw.close();
	} // end of main
} // end of Main class