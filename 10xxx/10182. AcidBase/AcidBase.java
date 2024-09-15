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
			if(string.charAt(0)=='H') {
				double H = Double.valueOf(string.substring(4));
				bw.write(String.format("%.02f\n", -Math.log10(H)));
			} else {
				double OH = Double.valueOf(string.substring(5));
				bw.write(String.format("%.02f\n", 14+Math.log10(OH)));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class