import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		
		bw.write(Integer.valueOf(A)+Integer.valueOf(B)-Integer.valueOf(C)+"\n");
		bw.write(Integer.toString(Integer.valueOf(A+B)-Integer.valueOf(C)));
		
		bw.close();
	} // end of main()
} // end of Main class