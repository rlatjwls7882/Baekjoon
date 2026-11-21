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
		
		String max = "";
		while(true) {
			String string = br.readLine();
			if(string==null) break;
			StringTokenizer st = new StringTokenizer(string, " !@#$%^&*()_+=[]{}\\|;:\'\",<.>/?~`");
			while(st.hasMoreTokens()) {
				String tmp = st.nextToken();
				for(int i=0;i<tmp.length();i++) {
					if(max.length()<tmp.length()) {
						max=tmp.toLowerCase();
					}
				}
			}
		}
		bw.write(max);
		
		bw.close();
	} // end of main
} // end of Main class