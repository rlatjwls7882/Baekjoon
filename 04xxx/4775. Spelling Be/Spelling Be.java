import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	int N = Integer.valueOf(br.readLine());
    	
    	HashSet<String> dict = new HashSet<>();
    	while(N-->0) {
    		dict.add(br.readLine());
    	}
    	
    	int X = Integer.valueOf(br.readLine());
    	for(int i=1;i<=X;i++) {
    		ArrayList<String> unknown = new ArrayList<>();
    		while(true) {
    			String string = br.readLine();
    			if(string.equals("-1")) {
    				break;
    			}
    			
    			if(!dict.contains(string)) {
    				unknown.add(string);
    			}
    		}
    		
    		if(unknown.size()==0) {
    			bw.write("Email "+i+" is spelled correctly.\n");
    		} else {
    			bw.write("Email "+i+" is not spelled correctly.\n");
				for(String string:unknown) {
					bw.write(string+"\n");
				}
			}
    	}
    	bw.write("End of Output");
    	
        bw.close();
    } // end of main
} // end of Main class