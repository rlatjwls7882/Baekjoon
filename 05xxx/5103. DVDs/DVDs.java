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
			if(string.equals("#")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.valueOf(st.nextToken());
			int S = Integer.valueOf(st.nextToken());
			
			int T = Integer.valueOf(br.readLine());
			while(T-->0) {
				st = new StringTokenizer(br.readLine());
				if(st.nextToken().equals("S")) {
					S = Math.max(0, S-Integer.valueOf(st.nextToken()));
				} else {
					S = Math.min(M, S+Integer.valueOf(st.nextToken()));
				}
			}
			bw.write(string+" "+S+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class