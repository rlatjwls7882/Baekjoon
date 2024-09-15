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
			String key = br.readLine();
			if(key.equals("0")) {
				break;
			}
			String plainText = br.readLine();
			
			for(int i=0;i<plainText.length();i++) {
				bw.write((plainText.charAt(i)+key.charAt(i%key.length())-129)%26+65);
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class