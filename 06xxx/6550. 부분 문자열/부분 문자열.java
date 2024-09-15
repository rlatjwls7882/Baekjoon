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
			try {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				String t = st.nextToken();
				
				// s가 t의 부분문자열인지 확인
				int idx=0;
				for(int i=0;i<t.length();i++) {
					if(s.charAt(idx)==t.charAt(i)) {
						idx++;
						if(idx==s.length()) {
							bw.write("Yes\n");
							break;
						}
					}
				}
				
				if(idx!=s.length()) {
					bw.write("No\n");
				}
				
			} catch (Exception e) {
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class