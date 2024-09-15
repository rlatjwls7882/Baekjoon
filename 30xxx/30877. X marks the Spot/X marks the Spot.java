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
			String S = st.nextToken();
			String T = st.nextToken();
			
			for(int i=0;i<S.length();i++) {
				if(S.charAt(i)=='x'||S.charAt(i)=='X') {
					if('a'<=T.charAt(i)) {
						bw.write(T.charAt(i)-32);
					} else {
						bw.write(T.charAt(i));
					}
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class