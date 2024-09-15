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
		
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), ".?!");
		
		while(N-->0) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken());
			
			int cnt=0;
			while(st2.hasMoreTokens()) {
				boolean chk=true;
				String string = st2.nextToken();
				
				if(!('A'<=string.charAt(0)&&string.charAt(0)<='Z')) {
					chk=false;
				} else {
					for(int i=1;i<string.length();i++) {
						if(!('a'<=string.charAt(i)&&string.charAt(i)<='z')) {
							chk=false;
							break;
						}
					}
				}
				if(chk) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class