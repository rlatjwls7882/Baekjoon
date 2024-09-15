import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int cnt=0;
		while(true) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			
			int idx=-1;
			while(idx!=0) {
				idx = string.indexOf("joke", idx)+1;
				if(idx!=0) {
					cnt++;
				}
			}
		}
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class