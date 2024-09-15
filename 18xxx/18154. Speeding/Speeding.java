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
		
		int lastT=0, lastD=0, max=0;
		br.readLine();
		while(N-->1) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t = Integer.valueOf(st.nextToken());
			int d = Integer.valueOf(st.nextToken());
			
			max = Math.max(max, (d-lastD)/(t-lastT));
			lastT=t;
			lastD=d;
		}
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class