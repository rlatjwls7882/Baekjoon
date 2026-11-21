import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		for(int i=0;i<N;i++) {
			if(i+2<N&&string.substring(i, i+3).equals("joi")) {
				bw.write("JOI");
				i+=2;
			} else {
				bw.write(string.charAt(i));
			}
		}

		bw.close();
	} // end of main()
} // end of Main class