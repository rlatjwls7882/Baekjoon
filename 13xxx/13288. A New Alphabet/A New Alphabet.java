import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String[] alphabet = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};
		
		String string = br.readLine().toLowerCase();
		for(int i=0;i<string.length();i++) {
			if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
				bw.write(alphabet[string.charAt(i)-'a']);
			} else {
				bw.write(string.charAt(i));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class