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
		
		int n = Integer.valueOf(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max=0;
		for(int i=0;i<n;i++) {
			int val = Integer.valueOf(st.nextToken());
			if(val>max) {
				max=val;
				sb = new StringBuilder();
				sb.append((char)('A'+i));
			} else if(val==max) {
				sb.append((char)('A'+i));
			}
		}
		bw.write(sb.toString());
		
		bw.close();
	} // end of main()
} // end of Main class