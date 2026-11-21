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
			if(name.equals("#")) {
				break;
			}
			int n = Integer.valueOf(st.nextToken());

			while(true) {
				st = new StringTokenizer(br.readLine());
				String Q = st.nextToken();
				int amount = Integer.valueOf(st.nextToken());

				if(Q.equals("B")) {
					if(n+amount<=68) {
						n = n+amount;
					}
				} else if(Q.equals("C")) {
					if(n-amount>=0) {
						n = n-amount;
					}
				} else {
					break;
				}
			}
			bw.write(name+" "+n+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class