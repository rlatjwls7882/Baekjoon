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

		int N = Integer.valueOf(br.readLine());
		
		int score=0;
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			double dist = Math.sqrt(x*x+y*y);

			for(int i=0;i<10;i++) {
				if(dist<=i*20+10) {
					score += 10-i;
					break;
				}
			}
		}
		bw.write(Integer.toString(score));

		bw.close();
	} // end of main()
} // end of Main class