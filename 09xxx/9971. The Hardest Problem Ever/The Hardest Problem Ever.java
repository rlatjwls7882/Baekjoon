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
			if(string.equals("ENDOFINPUT")) {
				break;
			}
			
			string = br.readLine();
			
			for(int i=0;i<string.length();i++) {
				if('A'<=string.charAt(i)&&string.charAt(i)<='Z') {
					bw.write((string.charAt(i)-44)%26+'A');
				} else {
					bw.write(string.charAt(i));
				}
			}
			
			br.readLine();
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class