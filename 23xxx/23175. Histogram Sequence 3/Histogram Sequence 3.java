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

		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int b = Integer.valueOf(st.nextToken());
			bw.write(b+" ");
			
			while(b-->1) {
				st.nextToken();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class