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
			int p = Integer.valueOf(br.readLine());
			
			char[][] replace = new char[p][2];
			for(int j=0;j<p;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				replace[j][0] = st.nextToken().charAt(0);
				replace[j][1] = st.nextToken().charAt(0);
			}
			
			bw.write("Test case #"+i+":\n");
			
			int q = Integer.valueOf(br.readLine());
			while(q-->0) {
				String string = br.readLine();
				String replacedString = string;
				for(int j=0;j<p;j++) {
					replacedString = replacedString.replace(replace[j][0], replace[j][1]);
				}
				
				int length = replacedString.length();
				boolean chk=true;
				for(int j=0;j<length;j++) {
					if(replacedString.charAt(j)!=replacedString.charAt(length-1-j)) {
						chk=false;
						break;
					}
				}
				
				if(chk) {
					bw.write(string+" YES\n");
				} else {
					bw.write(string+" NO\n");
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class