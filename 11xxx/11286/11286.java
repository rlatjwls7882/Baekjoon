import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 연산의 개수 N
    	int N = Integer.valueOf(br.readLine());
    	
    	// N개의 연산 수행
    	PriorityQueue<Long> minus = new PriorityQueue<>(Collections.reverseOrder());
    	PriorityQueue<Long> plus = new PriorityQueue<>();
    	
    	while(N-->0) {
    		
    		long x = Long.valueOf(br.readLine());
    		
    		// x가 0이 아닌 경우
    		if(x>0)
    			plus.add(x);
    		else if(x<0)
    			minus.add(x);
    		
    		// x가 0인 경우
    		else if(!minus.isEmpty()&&!plus.isEmpty()) {
    			if(-minus.peek()<=plus.peek())
    				bw.write(minus.poll()+"\n");
    			else
    				bw.write(plus.poll()+"\n");
    		}
    		else if(!minus.isEmpty()&&plus.isEmpty())
    			bw.write(minus.poll()+"\n");
    		else if(minus.isEmpty()&&!plus.isEmpty())
    			bw.write(plus.poll()+"\n");
    		else
    			bw.write("0\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class