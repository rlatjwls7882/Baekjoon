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
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int D = Integer.valueOf(st.nextToken());
			int N = Integer.valueOf(st.nextToken());
			
			double t=0;
			while(N-->0) {
				st = new StringTokenizer(br.readLine());
				int K = Integer.valueOf(st.nextToken());
				int S = Integer.valueOf(st.nextToken());
				t = Math.max(t, (D-K)/(double)S);
			}
			bw.write(String.format("Case #%d: %f\n", i, D/t));
		}
		
		bw.close();
	} // end of main()
} // end of Main class