import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	char[] chars = br.readLine().toCharArray();
    	
    	for(int i=0;i<26;i++) {
    		StringBuilder sb = new StringBuilder();
    		for(int j=0;j<chars.length;j++) {
    			if('A'<=chars[j]&&chars[j]<='Z') {
    				sb.append((char)((chars[j]-'A'+i)%26+'A'));
    			} else {
    				sb.append(chars[j]);
    			}
    		}
    		String string = sb.toString();
    		if(string.indexOf("CHIPMUNKS")!=-1||string.indexOf("LIVE")!=-1) {
    			bw.write(string);
    			break;
    		}
    	}
    	
        bw.close();
    } // end of main
} // end of Main class