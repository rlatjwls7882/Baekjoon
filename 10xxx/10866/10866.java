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
        	
        	// 명령 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String cmd = st.nextToken();
        	
        	// push_front
        	if(cmd.equals("push_front"))
        		deque.offerFirst(Integer.valueOf(st.nextToken()));
        	
        	// push_back
        	else if(cmd.equals("push_back"))
        		deque.offerLast(Integer.valueOf(st.nextToken()));
        	
        	// pop_front
        	else if(cmd.equals("pop_front")) {
        		
        		if(deque.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(deque.pollFirst()+"\n");
        	}
        	
        	// pop_back
        	else if(cmd.equals("pop_back")) {
        		
        		if(deque.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(deque.pollLast()+"\n");
        	}
        	
        	// size
        	else if(cmd.equals("size"))
        		bw.write(deque.size()+"\n");
        	
        	// empty
        	else if(cmd.equals("empty")) {
        		
        		if(deque.isEmpty())
        			bw.write("1\n");
        		else
        			bw.write("0\n");
        	}
        	
        	// front
        	else if(cmd.equals("front")) {
        		
        		if(deque.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(deque.peekFirst()+"\n");
        	}
        	
        	// back
        	else {
        		
        		if(deque.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(deque.peekLast()+"\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class