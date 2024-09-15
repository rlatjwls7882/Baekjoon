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
			String A = st.nextToken();
			String B = st.nextToken();
			
			boolean[] Achars = new boolean[26];
			for(int i=0;i<A.length();i++) {
				Achars[A.charAt(i)-'A']=true;
			}
			
			boolean[] Bchars = new boolean[26];
			for(int i=0;i<B.length();i++) {
				Bchars[B.charAt(i)-'A']=true;
			}
			
			boolean chk=true;
			for(int i=0;i<26;i++) {
				if(Achars[i]!=Bchars[i]) {
					chk=false;
					break;
				}
			}
			bw.write(chk?"YES\n":"NO\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class