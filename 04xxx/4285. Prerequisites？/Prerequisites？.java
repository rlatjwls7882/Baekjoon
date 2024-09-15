import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.valueOf(st.nextToken());
			if(k==0) {
				break;
			}
			int m = Integer.valueOf(st.nextToken());
			
			HashSet<String> choose = new HashSet<>();
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				choose.add(st.nextToken());
			}
			
			boolean chk=true;
			while(m-->0) {
				st = new StringTokenizer(br.readLine());
				if(chk) {
					int c = Integer.valueOf(st.nextToken());
					int r = Integer.valueOf(st.nextToken());
					
					int cnt=0;
					while(c-->0) {
						if(choose.contains(st.nextToken())) {
							cnt++;
						}
					}
					if(cnt<r) {
						chk=false;
					}
				}
			}
			
			if(chk) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class