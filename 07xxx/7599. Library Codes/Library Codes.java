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
			int f = Integer.valueOf(st.nextToken());
			
			if(name.equals("#")) {
				break;
			}
			
			bw.write(name+" Library\n");
			
			int c = Integer.valueOf(br.readLine());
			for(int i=1;i<=c;i++) {
				st = new StringTokenizer(br.readLine());
				int w = Integer.valueOf(st.nextToken());
				int length = st.nextToken().length();
				if(w>=f*length+2) {
					bw.write("Book "+i+" horizontal\n");
				} else {
					bw.write("Book "+i+" vertical\n");
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class