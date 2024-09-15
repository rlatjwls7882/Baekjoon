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
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "1");
		
		int cnt=0;
		while(st.hasMoreTokens()) {
			String string = st.nextToken();
			cnt = Math.max(cnt, (string.length()+1)/2);
		}
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class