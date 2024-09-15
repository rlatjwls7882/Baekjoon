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
		if(string.length()>2&&string.charAt(0)=='\"'&&string.charAt(string.length()-1)=='\"') {
			bw.write(string.substring(1, string.length()-1));
		} else {
			bw.write("CE");
		}
		
		bw.close();
	} // end of main()
} // end of Main class