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
		
		char[] res = new char[string.length()];
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='R') {
				res[i]='S';
			} else if(string.charAt(i)=='B') {
				res[i]='K';
			} else {
				res[i]='H';
			}
		}
		
		for(int i=0;i<string.length();) {
			if(i+2<string.length()&&res[i]!=res[i+1]&&res[i]!=res[i+2]&&res[i+1]!=res[i+2]) {
				bw.write('C');
				i+=3;
			} else {
				bw.write(res[i]);
				i+=1;
			}
		}

		bw.close();
	} // end of main()
} // end of Main class