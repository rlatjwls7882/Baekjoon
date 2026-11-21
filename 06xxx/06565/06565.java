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
		
		while(true) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(string, "+=");
			
			StringBuilder sb = new StringBuilder(st.nextToken()).reverse();
			int A = Integer.valueOf(sb.toString());
			
			sb = new StringBuilder(st.nextToken()).reverse();
			int B = Integer.valueOf(sb.toString());
			
			sb = new StringBuilder(st.nextToken()).reverse();
			int C = Integer.valueOf(sb.toString());
			
			if(A+B==C) {
				bw.write("True\n");
			} else {
				bw.write("False\n");
			}
		}

		bw.close();
	} // end of main()
} // end of Main class