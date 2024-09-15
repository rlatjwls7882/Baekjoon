import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	for(int i=0;i<N;i++) {
    		pq.add(Integer.valueOf(br.readLine()));
    	}
    	
    	HashMap<Integer, Integer> idx = new HashMap<>();
    	for(int i=0;i<N;i++) {
    		int num = pq.poll();
    		if(!idx.containsKey(num)) {
    			idx.put(num, i);
    		}
    	}
    	
    	while(M-->0) {
    		bw.write(idx.getOrDefault(Integer.valueOf(br.readLine()), -1)+"\n");
    	}
    	
        bw.close();
    } // end of main
} // end of Main class