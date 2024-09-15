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
			StringTokenizer st = new StringTokenizer(br.readLine());
			double A = Double.valueOf(st.nextToken());
			double B = Double.valueOf(st.nextToken());
			double C = Double.valueOf(st.nextToken());
			double D = Double.valueOf(st.nextToken());
			if(A==0) {
				break;
			}
			
			if(C>A&&D>B||C>B&&D>A) {
				bw.write("100%\n");
			} else {
				bw.write((int)(Math.max(Math.min(C/A, D/B), Math.min(D/A, C/B))*100)+"%\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class