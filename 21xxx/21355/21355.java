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
		
		if(string.indexOf('+')!=-1) {
			if(Integer.valueOf(string.substring(0, 2))>20) {
				bw.write("18");
			} else {
				bw.write("19");
			}
		} else {
			if(Integer.valueOf(string.substring(0, 2))>20) {
				bw.write("19");
			} else {
				bw.write("20");
			}
		}
		bw.write(string.substring(0, 6));
		bw.write(string.substring(7));
		
		bw.close();
	} // end of main()
} // end of Main class