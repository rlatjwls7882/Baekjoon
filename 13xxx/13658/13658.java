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
			String remove = st.nextToken();
			String string = st.nextToken();
			if(remove.equals("0")&&string.equals("0")) {
				break;
			}
			string = string.replace(remove, "");
			
			if(string.length()==0) {
				bw.write("0\n");
			} else {
				int idx=0;
				while(idx<string.length()&&string.charAt(idx)=='0') {
					idx++;
				}
				bw.write(string.substring(Math.min(string.length()-1, idx))+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class