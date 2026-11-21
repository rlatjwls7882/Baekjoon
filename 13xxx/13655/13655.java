import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(string);
			int D = Integer.valueOf(st.nextToken());
			double VF = Double.valueOf(st.nextToken());
			double VG = Double.valueOf(st.nextToken());
			
			if(12/VF*VG>=Math.sqrt(144+D*D)) {
				bw.write("S\n");
			} else {
				bw.write("N\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class