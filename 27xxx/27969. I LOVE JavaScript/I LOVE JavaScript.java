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
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ]");
    	
    	int cnt=0;
    	while(st.hasMoreTokens()) {
    		String string = st.nextToken();
    		if(!string.equals("[")&&!('0'<=string.charAt(0)&&string.charAt(0)<='9')) {
    			cnt+=string.length()+12;
    		} else {
				cnt+=8;
			}
    	}
    	bw.write(cnt+"");
    	
        bw.close();
    } // end of main
} // end of Main class