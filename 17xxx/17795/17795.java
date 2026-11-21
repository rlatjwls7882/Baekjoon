import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		long n = Long.valueOf(br.readLine());
		
		int cnt = Long.toString(n).length()-2;
		if(cnt>-1) {
			n /= Math.pow(10, cnt);
			n = Math.round((double)n/10)*10*(long)Math.pow(10, cnt);
		}
		
		bw.write(n+"");
		
		bw.close();
	} // end of main()
} // end of Main class