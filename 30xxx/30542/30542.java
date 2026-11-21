import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = br.readLine().replace(" ", "").toLowerCase();
		int length = string.length();
		
		boolean palindrome=false;
		for(int i=0;i<length-1;i++) {
			if(i+2<length&&string.charAt(i)==string.charAt(i+2)||string.charAt(i)==string.charAt(i+1)) {
				palindrome=true;
				break;
			}
		}
		bw.write(palindrome?"Palindrome":"Anti-palindrome");
		
		bw.close();
	} // end of main()
} // end of Main class