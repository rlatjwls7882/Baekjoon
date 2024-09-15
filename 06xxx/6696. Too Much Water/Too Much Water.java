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
			double X = Double.valueOf(st.nextToken());
			double Y = Double.valueOf(st.nextToken());
			if(X==0&&Y==0) {
				break;
			}
			
			double area = (X*X+Y*Y)*Math.PI/2;
			bw.write(String.format("The property will be flooded in hour %d.\n", (int)Math.ceil(area/50)));
		}

		bw.close();
	} // end of main()
} // end of Main class