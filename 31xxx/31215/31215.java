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
			int n = Integer.valueOf(br.readLine());
			
			if(n<=2) {
				bw.write("1\n");
			} else {
				bw.write("3\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class