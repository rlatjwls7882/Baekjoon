import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String string = br.readLine().toLowerCase();
		int[] chars = new int[26];
		
		for(int i=0;i<string.length();i++) {
			if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
				chars[string.charAt(i)-'a']++;
			}
		}
		
		for(int i=0;i<26;i++) {
			bw.write(String.format("%c | ", i+'A'));
			while(chars[i]-->0) {
				bw.write('*');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class