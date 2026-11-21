import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.valueOf(st.nextToken());
		long P = Long.valueOf(st.nextToken());
		
		// N! mod P 계산
		long fac=1;
		
		for(long i=2;i<=N;i++)
			fac = fac*i%P;
		
		bw.write(fac+"");
		
		bw.close();
	} // end of main
} // end of Main class