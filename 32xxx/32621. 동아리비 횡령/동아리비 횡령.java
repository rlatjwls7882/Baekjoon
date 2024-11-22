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
		
		String tmp = br.readLine();
		int cnt=0;
		for(int i=0;i<tmp.length();i++) {
			if(tmp.charAt(i)=='+') cnt++;
			else if(!('0'<=tmp.charAt(i) && tmp.charAt(i)<='9')) cnt=100;
		}

		if(cnt!=1) {
			bw.write("No Money");
		} else {			
			try {
				StringTokenizer st = new StringTokenizer(tmp, "+");
				String a = st.nextToken();
				String b = st.nextToken();
				
				if(!st.hasMoreTokens() && a.equals(b) && a.charAt(0)!='0' && b.charAt(0)!='0') bw.write("CUTE");
				else bw.write("No Money");			
			} catch (Exception e) {
				bw.write("No Money");
			}
		}
				
        bw.close();
    } // end of main
} // end of Main