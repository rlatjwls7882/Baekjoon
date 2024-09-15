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
		
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				String string = st.nextToken();
				if(string.length()==4) {
					bw.write("**** ");
				} else {
					bw.write(string+" ");
				}
			}
			bw.newLine();
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class