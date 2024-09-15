import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int W = Integer.valueOf(br.readLine())*2;
		
		int length = (int)Math.sqrt(W);
		bw.write(length*4+"");
		
		bw.close();
	} // end of main()
} // end of Main class