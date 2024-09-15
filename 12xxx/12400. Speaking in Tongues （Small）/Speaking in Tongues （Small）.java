import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String mapping = "yhesocvxduiglbkrztnwjpfmaq";
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			bw.write("Case #"+i+": ");
			String string = br.readLine();
			
			for(int j=0;j<string.length();j++) {
				if(string.charAt(j)==' ') {
					bw.write(' ');
				} else {
					bw.write(mapping.charAt(string.charAt(j)-'a'));
				}
			}
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class