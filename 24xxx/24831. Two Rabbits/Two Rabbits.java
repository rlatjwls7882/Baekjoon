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
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			int move = Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken());
			
			if((y-x)%move==0) {
				bw.write((y-x)/move+"\n");
			} else {
				bw.write("-1\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class