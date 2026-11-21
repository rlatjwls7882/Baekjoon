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
			int day = Integer.valueOf(st.nextToken());
			String mon = st.nextToken();
			if(day==0) {
				break;
			}
			
			if(mon.equals("February")&&day==29) {
				bw.write("Unlucky\n");
			} else if(mon.equals("August")&&day==4) {
				bw.write("Happy birthday\n");
			} else if(mon.equals("August")&&day>4||mon.equals("September")||mon.equals("October")||mon.equals("November")||mon.equals("December")) {
				bw.write("No\n");
			} else {
				bw.write("Yes\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class