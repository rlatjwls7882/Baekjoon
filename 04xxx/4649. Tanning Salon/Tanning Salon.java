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
    		int n = Integer.valueOf(st.nextToken());
    		if(n==0) {
    			break;
    		}
    		
    		String string = st.nextToken();
    		HashSet<Character> tanned = new HashSet<>();
    		HashSet<Character> leave = new HashSet<>();
    		for(int i=0;i<string.length();i++) {
    			char c = string.charAt(i);
    			if(tanned.contains(c)) {
    				tanned.remove(c);
    			} else {
					if(n==tanned.size()) {
						leave.add(c);
					} else {
						tanned.add(c);
					}
				}
    		}
    		bw.write(leave.size()==0?"All customers tanned successfully.\n":leave.size()+" customer(s) walked away.\n");
    	}
    	
        bw.close();
    } // end of main
} // end of Main class
