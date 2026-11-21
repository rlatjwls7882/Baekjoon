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
		
		for(int i=1;i<=N;i++) {
			int M = Integer.valueOf(br.readLine());
			
			int cnt=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(M-->0) {
				if(st.nextToken().equals("sheep")) {
					cnt++;
				}
			}
			bw.write(String.format("Case %d: This list contains %d sheep.\n\n", i, cnt));
		}
		
		bw.close();
	} // end of main()
} // end of Main class