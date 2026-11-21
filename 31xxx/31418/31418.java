import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long MOD = 998_244_353L;

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.valueOf(st.nextToken());
		int H = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int T = Integer.valueOf(st.nextToken());
		
		long val=1;
		while(K-->0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			long col=1;
			col += Math.min(x-1, T);
			col += Math.min(W-x, T);
			long row=1;
			row += Math.min(y-1, T);
			row += Math.min(H-y, T);
			val=val*col%MOD*row%MOD;
		}
		bw.write(val+"");
		
		bw.close();
	} // end of main()
} // end of Main class