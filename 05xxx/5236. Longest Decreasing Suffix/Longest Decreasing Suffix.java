import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			String string = br.readLine();
			
			int idx = string.length()-2;
			while(idx>=0&&string.charAt(idx)>=string.charAt(idx+1)) {
				idx--;
			}
			
			bw.write(String.format("The longest decreasing suffix of %s is %s\n", string, string.substring(idx+1)));
		}

		bw.close();
	} // end of main()
} // end of Main class