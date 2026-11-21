import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String chars = br.readLine();
		String string = br.readLine();
		
		for(int i=0;i<string.length();i++) {
			if('A'<=string.charAt(i)&&string.charAt(i)<='Z') {
				bw.write(chars.charAt(string.charAt(i)-'A')-32);
			} else if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
				bw.write(chars.charAt(string.charAt(i)-'a'));
			} else {
				bw.write(string.charAt(i));
			} 
		}
		
		bw.close();
	} // end of main()
} // end of Main class