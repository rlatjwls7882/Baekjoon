import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	HashMap<ArrayList<Integer>, PriorityQueue<String>> words = new HashMap<>();
    	
    	for(int i=0;i<2;i++) {
    		while(true) {
    			String string = br.readLine();
    			if(string.equals("XXXXXX")) {
    				break;
    			}
    			
    			ArrayList<Integer> chars = new ArrayList<>();
    			for(int j=0;j<26;j++) {
    				chars.add(0);
    			}
    			for(int j=0;j<string.length();j++) {
    				int idx=string.charAt(j)-'a';
    				chars.set(idx, chars.get(idx)+1);
    			}
    			
    			if(i==0) {
    				if(!words.containsKey(chars)) {
    					words.put(chars, new PriorityQueue<>());
    				}
    				words.get(chars).add(string);
    			} else {
    				if(words.containsKey(chars)) {
    					PriorityQueue<String> cur = words.get(chars);
    					while(!cur.isEmpty()) {
    						bw.write(cur.poll()+"\n");
    					}
    					bw.write("******\n");
    				} else {
    					bw.write("NOT A VALID WORD\n******\n");
					}
				}
    		}
    	}
    	
        bw.close();
    } // end of main
} // end of Main class