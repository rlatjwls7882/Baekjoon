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
			String string = br.readLine();
			if(string.equals("#")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(string);
			st.nextToken();
			string = st.nextToken();
			boolean[] chk = new boolean[10];
			int cnt=0;
			for(int i=0;i<3;i++) {
				if(string.charAt(i)==string.charAt(i+1)) {
					int idx = string.charAt(i)-'0';
					
					if(!chk[idx]) {
						chk[idx]=true;
						if(cnt++>0) {
							bw.write(" and ");
						}
						bw.write(idx+" "+idx+" glued");
					}
				}
			}
			if(cnt>0) {
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class