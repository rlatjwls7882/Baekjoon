import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		int cnt1=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='S') {
				cnt1++;
			}
		}
		
		string = br.readLine();
		int cnt2=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='S') {
				cnt2++;
			}
		}
		
		int cnt = cnt1*cnt2;
		for(int i=0;i<cnt;i++) {
			bw.write("S(");
		}
		bw.write("0");
		for(int i=0;i<cnt;i++) {
			bw.write(")");
		}

		bw.close();
	} // end of main()
} // end of Main class