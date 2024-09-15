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
			if(string.equals("quit!")) {
				break;
			}
			
			int length = string.length();
			if(length>=4&&(string.charAt(length-3)!='a'&&string.charAt(length-3)!='e'&&string.charAt(length-3)!='i'&&string.charAt(length-3)!='o'&&string.charAt(length-3)!='u')&&string.charAt(length-2)=='o'&&string.charAt(length-1)=='r') {
				bw.write(string.substring(0, length-2)+"our\n");
			} else {
				bw.write(string+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class