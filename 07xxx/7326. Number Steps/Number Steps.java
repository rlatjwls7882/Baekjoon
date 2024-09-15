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
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			if(x==y||x==y+2) {
				if(x%2==0) {
					bw.write(x+y+"\n");
				} else {
					bw.write(x+y-1+"\n");
				}
			} else {
				bw.write("No Number\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class