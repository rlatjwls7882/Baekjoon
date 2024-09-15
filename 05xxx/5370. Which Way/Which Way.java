import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			
			string = Integer.toBinaryString(Integer.valueOf(string));
			int cnt0=0, cnt1=0;
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='0') {
					cnt0++;
				} else {
					cnt1++;
				}
			}
			
			if(cnt0>cnt1) {
				bw.write("left\n");
			} else if(cnt0<cnt1) {
				bw.write("right\n");
			} else {
				bw.write("straight\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class