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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int Q = Integer.valueOf(st.nextToken());
		
		int[] hay = new int[N+1];
		for(int i=1;i<=N;i++) {
			hay[i] = hay[i-1] + Integer.valueOf(br.readLine());
		}
		
		while(Q-->0) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.valueOf(st.nextToken());
			int E = Integer.valueOf(st.nextToken());
			bw.write(hay[E]-hay[S-1]+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class