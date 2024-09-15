import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		while(n-->0) {
			StringBuilder sb = new StringBuilder();
			
			int cnt=1;
			for(int i=1;i<string.length();i++) {
				if(string.charAt(i)==string.charAt(i-1)) {
					cnt++;
				} else {
					sb.append(cnt).append(string.charAt(i-1));
					cnt=1;
				}
			}
			sb.append(cnt).append(string.charAt(string.length()-1));
			string = sb.toString();
		}
		bw.write(string);
		
		bw.close();
	} // end of main()
} // end of Main class