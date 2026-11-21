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
        	
        	// 1
        	if(cmd.equals("1"))
        		deque.offerFirst(Integer.valueOf(st.nextToken()));
        	
        	// 2
        	else if(cmd.equals("2"))
        		deque.offerLast(Integer.valueOf(st.nextToken()));
        	
        	// 3
        	else if(cmd.equals("3")) {
        		
        		if(deque.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(deque.pollFirst()+"\n");
        	}
        	
        	// 4
        	else if(cmd.equals("4")) {
        		
        		if(deque.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(deque.pollLast()+"\n");
        	}
        	
        	// 5
        	else if(cmd.equals("5"))
        		bw.write(deque.size()+"\n");
        	
        	// 6
        	else if(cmd.equals("6")) {
        		
        		if(deque.isEmpty())
        			bw.write("1\n");
        		else
        			bw.write("0\n");
        	}
        	
        	// 7
        	else if(cmd.equals("7")) {
        		
        		if(deque.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(deque.peekFirst()+"\n");
        	}
        	
        	// 8
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