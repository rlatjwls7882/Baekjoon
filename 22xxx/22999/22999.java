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
			int N = Integer.valueOf(st.nextToken());
			int K = Integer.valueOf(st.nextToken());
			String string = br.readLine();
			
			int cnt=0;
			for(int j=0;j<N/2;j++) {
				if(string.charAt(j)!=string.charAt(N-1-j)) {
					cnt++;
				}
			}
			bw.write(String.format("Case #%d: %d\n", i, Math.abs(K-cnt)));
		}

		bw.close();
	} // end of main()
} // end of Main class