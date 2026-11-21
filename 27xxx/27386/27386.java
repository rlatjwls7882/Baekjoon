import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int idx1=0, idx2=0;
		while(idx1<str1.length()&&idx2<str2.length()) {
			if(str1.charAt(idx1)<str2.charAt(idx2)) {
				bw.write(str1.charAt(idx1++));
			} else {
				bw.write(str2.charAt(idx2++));
			}
		}
		
		while(idx1<str1.length()) {
			bw.write(str1.charAt(idx1++));
		}
		while(idx2<str2.length()) {
			bw.write(str2.charAt(idx2++));
		}
		
		bw.close();
	} // end of main()
} // end of Main class