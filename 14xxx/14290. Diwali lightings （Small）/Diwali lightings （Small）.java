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
		for(int i=1;i<=T;i++) {
			String string = br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int I = Integer.valueOf(st.nextToken());
			int J = Integer.valueOf(st.nextToken())-I+1;
			I = (I-1)%string.length();
			
			int cnt=0;
			while(J-->0) {
				if(string.charAt(I)=='B') {
					cnt++;
				}
				I = (I+1)%string.length();
			}
			
			bw.write("Case #"+i+": "+cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class