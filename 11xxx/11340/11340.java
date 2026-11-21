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
		
		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int score = Integer.valueOf(st.nextToken())*15;
			score += Integer.valueOf(st.nextToken())*20;
			score += Integer.valueOf(st.nextToken())*25;
			
			int require = (int)Math.ceil((9000-score)*0.025);
			if(require>100) {
				bw.write("impossible\n");
			} else {
				bw.write(require+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class