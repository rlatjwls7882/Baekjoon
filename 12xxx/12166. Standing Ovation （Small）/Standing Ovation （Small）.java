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
		
		int T = Integer.valueOf(br.readLine());
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int S = Integer.valueOf(st.nextToken());
			String string = st.nextToken();
			
			int person=0, cnt=0;
			for(int j=0;j<=S;j++) {
				if(j>person) {
					cnt += j-person;
					person=j;
				}
				person += string.charAt(j)-'0';
			}
			bw.write(String.format("Case #%d: %d\n", i, cnt));
		}
		
		bw.close();
	} // end of main()
} // end of Main class