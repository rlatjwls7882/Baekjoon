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
		
		int x1=1000, x2=0, y1=100, y2=0;
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(),",");
			int X = Integer.valueOf(st.nextToken());
			int Y = Integer.valueOf(st.nextToken());
			x1 = Math.min(x1, X-1);
			x2 = Math.max(x2, X+1);
			y1 = Math.min(y1, Y-1);
			y2 = Math.max(y2, Y+1);
		}
		bw.write(x1+","+y1+"\n");
		bw.write(x2+","+y2);
		
		bw.close();
	} // end of main()
} // end of Main class