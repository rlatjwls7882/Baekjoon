import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		double a = Double.valueOf(br.readLine());
		
		double r = Math.sqrt(a/Math.PI);
		bw.write(Double.toString(r*2));
		
		bw.close();
	} // end of main()
} // end of Main class