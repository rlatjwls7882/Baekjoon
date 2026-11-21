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
		int X = Integer.valueOf(br.readLine());
		
		int cnt=0;
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int P1 = Integer.valueOf(st.nextToken());
			int P2 = Integer.valueOf(st.nextToken());
			
			if(Math.abs(P1-P2)<=X) {
				cnt += Math.max(P1, P2);
			} else {
				cnt += Integer.valueOf(br.readLine());
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class