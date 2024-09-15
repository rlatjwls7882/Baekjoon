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
			String A = st.nextToken();
			if(A.equals("#")) {
				break;
			}
			String B = st.nextToken();
			String C = st.nextToken();
			
			bw.write(A+" "+B+" "+C+" ");
			for(int i=0;i<C.length();i++) {
				bw.write((C.charAt(i)-'a'+B.charAt(i)-A.charAt(i)+26)%26+'a');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class