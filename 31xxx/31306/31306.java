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
		
		int vowel=0, y=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u') {
				vowel++;
			} else if(string.charAt(i)=='y') {
				y++;
			}
		}
		bw.write(vowel+" "+(vowel+y));
		
		bw.close();
	} // end of main()
} // end of Main class