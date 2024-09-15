import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		double e=1, val=1;
		for(int i=1;i<=n;i++) {
			val /= i;
			e += val;
		}
		bw.write(Double.toString(e));
		
		bw.close();
	} // end of main()
} // end of Main class