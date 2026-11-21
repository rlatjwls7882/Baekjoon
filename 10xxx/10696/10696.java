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
		
		StringTokenizer st = null;
		for(int i=1;i<=T;i++) {
			st = new StringTokenizer(br.readLine());
			String N = st.nextToken();
			int X = Integer.valueOf(st.nextToken());
			
			int remainder=0;
			for(int j=0;j<N.length();j++) {
				remainder = (remainder*10+N.charAt(j)-'0')%X;
			}
			bw.write("Case "+i+": "+remainder+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class