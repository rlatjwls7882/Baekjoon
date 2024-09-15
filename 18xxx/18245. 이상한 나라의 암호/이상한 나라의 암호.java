import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 암호 해석
		for(int i=2;;i++) {
			String string = br.readLine();
			
			if(string.equals("Was it a cat I saw?")) {
				break;
			}
			
			for(int j=0;j<string.length();j+=i) {
				bw.write(string.charAt(j));
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class