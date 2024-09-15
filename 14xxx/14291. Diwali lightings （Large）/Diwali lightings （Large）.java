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
			long I = Long.valueOf(st.nextToken());
			long J = Long.valueOf(st.nextToken());
			
			long cnt=0;
			for(int j=0;j<string.length();j++) {
				if(string.charAt(j)=='B') {
					cnt++;
				}
			}
			cnt = cnt*((J-I+1)/string.length());
			
			J = (J-I+1)%string.length();
			int idx = (int)((I-1)%string.length());
			while(J-->0) {
				if(string.charAt(idx)=='B') {
					cnt++;
				}
				idx = (idx+1)%string.length();
			}
			
			bw.write("Case #"+i+": "+cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class