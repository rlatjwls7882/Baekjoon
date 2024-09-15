import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			String string = br.readLine();
			int idx = Math.max(string.indexOf("0"), string.indexOf("1"));
			
			int num = string.charAt(idx)-'0';
			if(string.length()>idx+1) {
				num=1;
			}
			
			if(idx%2==1) {
				if(num==1) {
					num=0;
				} else {
					num=1;
				}
			}
			bw.write(num+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class