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

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int Z = Integer.valueOf(st.nextToken());
			if(name.equals("#")&&Z==0) {
				break;
			}
			
			int P = Integer.valueOf(br.readLine());
			int S = Integer.valueOf(br.readLine());
			while(S-->0) {
				st = new StringTokenizer(br.readLine());
				int out = Integer.valueOf(st.nextToken());
				int in = Integer.valueOf(st.nextToken());
				P = Math.min(Z, P-out+in);
			}
			bw.write(name+" "+P+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class