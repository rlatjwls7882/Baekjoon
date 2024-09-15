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
		String letter = st.nextToken();
		String string = st.nextToken();
		
		if(letter.equals("E")) {
			int cnt=1;
			for(int i=1;i<string.length();i++) {
				if(string.charAt(i)==string.charAt(i-1)) {
					cnt++;
				} else {
					bw.write(string.charAt(i-1)+""+cnt);
					cnt=1;
				}
			}
			bw.write(string.charAt(string.length()-1)+""+cnt);
		} else {
			for(int i=1;i<string.length();i+=2) {
				for(int j='0';j<string.charAt(i);j++) {
					bw.write(string.charAt(i-1));
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class