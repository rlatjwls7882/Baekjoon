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
    	
    	HashSet<ArrayList<Integer>> word = new HashSet<>();
    	while(N-->0) {
    		String string = br.readLine();
    		
    		ArrayList<Integer> list = new ArrayList<>();
    		for(int i=0;i<26;i++) {
    			list.add(0);
    		}
    		
    		for(int i=0;i<string.length();i++) {
    			int idx = string.charAt(i)-'a';
    			list.set(idx, list.get(idx)+1);
    		}
    		word.add(list);
    	}
    	bw.write(word.size()+"");
    	
        bw.close();
    } // end of main
} // end of Main class