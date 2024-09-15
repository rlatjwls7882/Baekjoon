import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			
			for(int i=0;i<string.length();i+=2) {
				bw.write(Integer.valueOf(string.substring(i, i+2), 16));
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class