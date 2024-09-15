import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String a = br.readLine();
		String b = br.readLine();
		
		char[] string = (a+b).toCharArray();
		Arrays.sort(string);
		
		for(int i=0;i<a.length();i++) {
			bw.write(string[i]);
		}
		
		bw.close();
	} // end of main()
} // end of Main class