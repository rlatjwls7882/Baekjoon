import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int z = Integer.valueOf(br.readLine());
		while(z-->0) {
			String string = br.readLine();
			for(int j=0;j<string.length();j++) {
				bw.write((string.charAt(j)-'a'+13)%26+'a');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class