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
		
		String string = br.readLine();
		
		int n = Integer.valueOf(br.readLine());
		int a=0, b=string.length();
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.valueOf(st.nextToken());
			int length = Integer.valueOf(st.nextToken());
			
			a += start;
			b = Math.min(a+length, b);
		}
		bw.write(string.substring(a, b));
		
		bw.close();
	} // end of main()
} // end of Main class