import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int length = br.readLine().length();
		
		bw.write("AWHO");
		for(int i=4;i<=length;i++) {
			bw.write("O");
		}
		
		bw.close();
	} // end of main()
} // end of Main class