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
		
		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				String string = st.nextToken();
				int sum=0;
				for(int i=0;i<string.length();i++) {
					sum += string.charAt(i)-'a';
				}
				sum%=27;
				
				if(sum==26) {
					bw.write(' ');
				} else {
					bw.write(sum+'a');
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class