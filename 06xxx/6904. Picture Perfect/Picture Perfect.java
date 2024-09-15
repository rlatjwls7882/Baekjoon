import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			int C = Integer.valueOf(br.readLine());
			if(C==0) {
				break;
			}
			
			for(int i=(int)Math.sqrt(C);;i--) {
				if(C%i==0) {
					bw.write(String.format("Minimum perimeter is %d with dimensions %d x %d\n", (i+C/i)*2, i, C/i));
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class