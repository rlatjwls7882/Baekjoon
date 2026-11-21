import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int m = Integer.valueOf(st.nextToken());
    	int n = Integer.valueOf(st.nextToken());
    	
    	HashMap<String, Integer> word = new HashMap<>();
    	while(m-->0) {
    		st = new StringTokenizer(br.readLine());
    		word.put(st.nextToken(), Integer.valueOf(st.nextToken()));
    	}
    	
    	while(n-->0) {
    		int point=0;
    		while(true) {
    			String string = br.readLine();
    			if(string.equals(".")) {
    				break;
    			}
    			st = new StringTokenizer(string);
    			
    			while(st.hasMoreTokens()) {
    				point += word.getOrDefault(st.nextToken(), 0);
    			}
    		}
    		bw.write(point+"\n");
    	}
    	
        bw.close();
    } // end of main
} // end of Main class