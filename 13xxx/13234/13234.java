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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String val1 = st.nextToken();
		String opt = st.nextToken();
		String val2 = st.nextToken();
		
		if(opt.equals("OR")&&(val1.equals("true")||val2.equals("true"))||opt.equals("AND")&&val1.equals("true")&&val2.equals("true")) {
			bw.write("true");
		} else {
			bw.write("false");
		}
		
		bw.close();
	} // end of main()
} // end of Main class