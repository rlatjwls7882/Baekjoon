import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int P = Integer.valueOf(st.nextToken());
    	int T = Integer.valueOf(st.nextToken());
    	
    	HashMap<Integer, HashSet<Integer>> heard = new HashMap<>();
    	while(true) {
    		String string = br.readLine();
    		if(string==null) {
    			break;
    		}
    		st = new StringTokenizer(string);
    		int i = Integer.valueOf(st.nextToken());
    		int j = Integer.valueOf(st.nextToken());
    		
    		if(!heard.containsKey(i)) {
    			heard.put(i, new HashSet<Integer>());
    		}
    		heard.get(i).add(j);
    	}
    	
    	HashSet<String> set = new HashSet<>();
    	for(int val:heard.keySet()) {
    		set.add(heard.get(val).toString());
    	}
    	bw.write(set.size()+"");
    	
        bw.close();
    } // end of main
} // end of Main class