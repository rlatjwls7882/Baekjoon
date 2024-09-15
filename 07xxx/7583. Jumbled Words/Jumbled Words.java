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
			if(string.equals("#")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(string);
			
			while(st.hasMoreTokens()) {
				string = st.nextToken();
				bw.write(string.charAt(0));
				
				for(int i=string.length()-2;i>0;i--) {
					bw.write(string.charAt(i));
				}
				
				if(string.length()>1) {
					bw.write(string.charAt(string.length()-1));
				}
				bw.write(' ');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class