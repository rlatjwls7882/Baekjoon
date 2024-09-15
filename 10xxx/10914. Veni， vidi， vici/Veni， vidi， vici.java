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
		
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 암호화된 단어 복호화
		while(st.hasMoreTokens()) {
			String string = st.nextToken();
			
			for(int i=1;i<string.length();i+=2) {
				bw.write((char)((string.charAt(i-1)+string.charAt(i)-'a'*2+26-n)%26+'a'));
			}
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class