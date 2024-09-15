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
		
		bw.write(string.substring(0, string.length()/2)+" "+string.substring(string.length()/2));
		
		bw.close();
	} // end of main()
} // end of Main class