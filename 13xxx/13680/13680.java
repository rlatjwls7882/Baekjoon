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
			int X1 = Integer.valueOf(st.nextToken());
			int Y1 = Integer.valueOf(st.nextToken());
			int X2 = Integer.valueOf(st.nextToken());
			int Y2 = Integer.valueOf(st.nextToken());
			if(X1==0) {
				break;
			}
			
			if(X1==X2&&Y1==Y2) {
				bw.write("0\n");
			} else if(X1==X2||Y1==Y2||Math.abs(X1-X2)==Math.abs(Y1-Y2)) {
				bw.write("1\n");
			} else {
				bw.write("2\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class