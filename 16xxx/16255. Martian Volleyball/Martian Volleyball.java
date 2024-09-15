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
		
		int t = Integer.valueOf(br.readLine());
		
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.valueOf(st.nextToken());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			if(x>y) {
				bw.write(Math.max(y+2, k)-x+"\n");
			} else {
				bw.write(Math.max(x+2, k)-y+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class