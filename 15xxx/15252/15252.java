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
		
		int K = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			
			int[] m = new int[c];
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<c;j++) {
				m[j] = Integer.valueOf(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			while(n-->0) {
				m[Integer.valueOf(st.nextToken())-1]--;
			}
			
			int max=0;
			for(int j=0;j<c;j++) {
				max = Math.max(max, m[j]);
			}
			bw.write("Data Set "+i+":\n"+max+"\n\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class