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
		int first = 2000, last=0;
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ":");
			int now = Integer.valueOf(st.nextToken())*100+Integer.valueOf(st.nextToken());
			
			if(630<=now&&now<=1900) {
				first = Math.min(first, now);
				last = Math.max(last, now);
			}
		}
		
		if(first!=2000&&first>=1001) {
			if(last>=1601) {
				bw.write("24000");
			} else {
				bw.write("16800");
			}
		} else if(first!=2000&&first>=630) {
			if(last>=1601) {
				bw.write("36000");
			} else {
				bw.write("24000");
			}
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class