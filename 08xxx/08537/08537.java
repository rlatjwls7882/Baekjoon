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
		
		int max=0;
		while(n-->0) {
			String string = br.readLine();
			boolean[] chars = new boolean[26];
			int cnt=0;
			for(int i=0;i<string.length();i++) {
				if(!chars[string.charAt(i)-'a']) {
					cnt++;
				}
				chars[string.charAt(i)-'a']=true;
			}
			max = Math.max(max, cnt);
		}
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class