import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	int K = Integer.valueOf(st.nextToken());
    	
    	HashMap<String, Integer> subjects = new HashMap<>();
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine());
    		subjects.put(st.nextToken(), Integer.valueOf(st.nextToken()));
    	}
    	
    	int score=0;
    	for(int i=0;i<K;i++) {
    		String string = br.readLine();
    		score += subjects.get(string);
    		subjects.remove(string);
    	}
    	
    	ArrayList<String> keys = new ArrayList<>(subjects.keySet());
    	Collections.sort(keys, new Comparator<String>() {
    		@Override
    		public int compare(String o1, String o2) {
    			return subjects.get(o2)-subjects.get(o1);
    		}
		});
    	
    	N -= K;
    	M -= K;
    	int min=score, max=score;
    	for(int i=0;i<M;i++) {
    		max += subjects.get(keys.get(i));
    		min += subjects.get(keys.get(N-1-i));
    	}
    	bw.write(min+" "+max);
    	
        bw.close();
    } // end of main
} // end of Main class