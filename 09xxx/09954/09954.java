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
			if(string.equals("#")) {
				break;
			}
			
			int change = string.charAt(string.length()-1)-'A';
			for(int i=0;i<string.length()-1;i++) {
				if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
					bw.write((string.charAt(i)-71-change)%26+'a');
				} else if('A'<=string.charAt(i)&&string.charAt(i)<='Z') {
					bw.write((string.charAt(i)-39-change)%26+'A');
				} else {
					bw.write(string.charAt(i));
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class