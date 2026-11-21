import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 명령의 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	Deque<Integer> deque = new LinkedList<Integer>();
    	
    	while(N--!=0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String string = st.nextToken();
    		
    		// push
    		if(string.equals("push"))
    			deque.offer(Integer.valueOf(st.nextToken()));
    		
    		// pop
    		else if(string.equals("pop")) {
    			if(deque.peekLast()==null)
    				bw.write("-1\n");
    			else
    				bw.write(deque.poll()+"\n");
    		}
    		
    		// size
    		else if(string.equals("size"))
    			bw.write(deque.size()+"\n");
    		
    		// empty
    		else if(string.equals("empty")) {
    			if(deque.isEmpty())
    				bw.write("1\n");
    			else
    				bw.write("0\n");
    		}
    		
    		// front
    		else if(string.equals("front")) {
    			if(deque.peekFirst()==null)
    				bw.write("-1\n");
    			else
    				bw.write(deque.peekFirst()+"\n");
    		}
    		
    		// back
    		else if(string.equals("back")) {
    			if(deque.peekLast()==null)
    				bw.write("-1\n");
    			else
    				bw.write(deque.peekLast()+"\n");
    		}
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class