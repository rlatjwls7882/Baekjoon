import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Integer.valueOf(st.nextToken());
		long K = Integer.valueOf(st.nextToken());
		long remainder=0;
		for(long i=1;i<=N;i++) {
			remainder = (remainder*(long)Math.pow(10, (long)(Math.log10(i)+1))+i)%K;
		}
		bw.write(remainder+"");
		
		bw.close();
	} // end of main()
} // end of Main class