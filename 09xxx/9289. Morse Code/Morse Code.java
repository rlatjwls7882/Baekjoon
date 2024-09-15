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
		
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		
		int t = Integer.valueOf(br.readLine());
		for(int i=1;i<=t;i++) {
			bw.write("Case "+i+": ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				String string = st.nextToken();
				for(int j=0;j<26;j++) {
					if(morse[j].equals(string)) {
						bw.write('A'+j);
					}
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class