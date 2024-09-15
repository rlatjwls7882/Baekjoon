import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.valueOf(st.nextToken());
    	int k = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	while(n-->0) {
    		pq.add(Integer.valueOf(st.nextToken()));
    	}
    	
    	long cnt=0, sum=0;
    	while(!pq.isEmpty()) {
    		sum += Math.min(cnt++, k)*pq.poll();
    	}
    	bw.write(Long.toString(sum));
    	
        bw.close();
    } // end of main
} // end of Main