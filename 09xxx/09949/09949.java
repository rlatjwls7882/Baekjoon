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
		
		for(int i=1;;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char a = st.nextToken().charAt(0);
			char b = st.nextToken().charAt(0);
			if(a=='#') {
				break;
			}
			bw.write("Case "+i+"\n");
			
			int N = Integer.valueOf(br.readLine());
			while(N-->0) {
				String string = br.readLine();
				for(int j=0;j<string.length();j++) {
					if(string.charAt(j)==a||string.charAt(j)==a-32||string.charAt(j)==b||string.charAt(j)==b-32) {
						bw.write('_');
					} else {
						bw.write(string.charAt(j));
					}
				}
				bw.newLine();
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class