import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String left = "qwertasdfgzxcvb";
		String string = br.readLine();
		
		boolean chk=true;
		int last=-1;
		for(int i=0;i<string.length();i++) {
			if(left.indexOf(string.charAt(i))!=-1) {
				if(last==0) {
					chk=false;
					break;
				} else {
					last=0;
				}
			} else {
				if(last==1) {
					chk=false;
					break;
				} else {
					last=1;
				}
			}
		}
		bw.write(chk?"yes":"no");

		bw.close();
	} // end of main()
} // end of Main class