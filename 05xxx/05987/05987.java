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
		
		int Z = Integer.valueOf(br.readLine());
		
		while(Z-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			String string = st.nextToken();
			
			while(C-->0) {
				string = string.substring(N)+string;
			}
			bw.write(string+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class