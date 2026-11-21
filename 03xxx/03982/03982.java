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
    	
    	int c = Integer.valueOf(br.readLine());
    	
    	while(c-->0) {
    		HashMap<String, Integer> team = new HashMap<>();
    		for(int i=0;i<16;i++) {
    			StringTokenizer st = new StringTokenizer(br.readLine());
    			String g1 = st.nextToken();
    			String g2 = st.nextToken();
    			int t1 = Integer.valueOf(st.nextToken());
    			int t2 = Integer.valueOf(st.nextToken());
    			
    			String winner=g2;
    			if(t1>t2) {
    				winner=g1;
    			}
    			
    			team.put(winner, team.getOrDefault(winner, 0)+1);
    		}
    		
    		for(String key:team.keySet()) {
    			if(team.getOrDefault(key, 0)==4) {
    				bw.write(key+"\n");
    				break;
    			}
    		}
    	}
        
        bw.close();
    } // end of main
} // end of Main class