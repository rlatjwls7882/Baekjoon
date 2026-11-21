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
		
		int t = Integer.valueOf(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			
			int earn=0;
			for(int i=0;i<str1.length();i++) {
				earn += str1.charAt(i)-str2.charAt(i);
			}
			
			if(earn==0) {
				bw.write("Swapping letters to make "+str1+" look like "+str2+" was FREE.\n");
			} else if(earn>0) {
				bw.write("Swapping letters to make "+str1+" look like "+str2+" earned "+earn+" coins.\n");
			} else {
				bw.write("Swapping letters to make "+str1+" look like "+str2+" cost "+(-earn)+" coins.\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class