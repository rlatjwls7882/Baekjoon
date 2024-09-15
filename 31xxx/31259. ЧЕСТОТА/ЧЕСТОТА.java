import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int[] chars = new int[26];
		int max=0;
		while(true) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			
			string = string.toUpperCase();
			for(int i=0;i<string.length();i++) {
				if('A'<=string.charAt(i)&&string.charAt(i)<='Z') {
					max = Math.max(max, ++chars[string.charAt(i)-'A']);
				}
			}
		}
		
		for(int i=max;i>=1;i--) {
			for(int j=0;j<26;j++) {
				if(i<=chars[j]) {
					bw.write((char)('A'+j));
				} else {
					bw.write(' ');
				}
			}
			bw.newLine();
		}
		bw.write("--------------------------\nABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		bw.close();
	} // end of main()
} // end of Main class