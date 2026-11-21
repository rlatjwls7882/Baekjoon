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
		
		long cost=0;
		while(true) {
			String name = br.readLine();
			
			if(name.equals("TOTAL")) {
				if(Long.valueOf(br.readLine())<=cost) {
					bw.write("PAY");
				} else {
					bw.write("PROTEST");
				}
				break;
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			cost += Long.valueOf(st.nextToken())*Long.valueOf(st.nextToken());
		}
		
		bw.close();
	} // end of main()
} // end of Main class