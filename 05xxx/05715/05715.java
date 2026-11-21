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
			if(string.equals("*")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(string, "/");
			int cnt=0;
			while(st.hasMoreTokens()) {
				string = st.nextToken();
				double length=0;
				for(int i=0;i<string.length();i++) {
					if(string.charAt(i)=='W') {
						length++;
					} else if(string.charAt(i)=='H') {
						length += 1/2.;
					} else if(string.charAt(i)=='Q') {
						length += 1/4.;
					} else if(string.charAt(i)=='E') {
						length += 1/8.;
					} else if(string.charAt(i)=='S') {
						length += 1/16.;
					} else if(string.charAt(i)=='T') {
						length += 1/32.;
					} else {
						length += 1/64.;
					}
				}
				if(length==1) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class