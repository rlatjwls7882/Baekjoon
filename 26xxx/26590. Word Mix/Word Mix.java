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
		String A = st.nextToken();
		String B = st.nextToken();
		
		int length = Math.min(A.length(), B.length());
		for(int i=0;i<length;i++) {
			if(i%2==0) {
				bw.write(A.charAt(i));
			} else {
				bw.write(B.charAt(i));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class