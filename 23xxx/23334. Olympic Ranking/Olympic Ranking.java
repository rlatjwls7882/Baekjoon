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
		
		int maxG=0, maxS=0, maxB=0;
		String name="";
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int g = Integer.valueOf(st.nextToken());
			int s = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			if(g>maxG||g==maxG&&s>maxS||g==maxG&&s==maxS&&b>maxB) {
				maxG=g;
				maxS=s;
				maxB=b;
				StringBuilder sb = new StringBuilder();
				while(st.hasMoreTokens()) {
					sb.append(st.nextToken()).append(' ');
				}
				name=sb.toString();
			}
		}
		bw.write(name);
		
		bw.close();
	} // end of main()
} // end of Main class