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
        
        Deque<String> que = new LinkedList<String>();
        
        while(N--!=0) {
            
            // 명령 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String cmd = st.nextToken();
        	
        	// push
        	if(cmd.equals("push"))
        		que.push(st.nextToken());
        	
        	// pop
        	else if(cmd.equals("pop")) {
        		
        		if(que.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(que.pollLast()+"\n");
        	}
        	
        	// size
        	else if(cmd.equals("size"))
        		bw.write(que.size()+"\n");
        	
        	// empty
        	else if(cmd.equals("empty")) {
        		
        		if(que.isEmpty())
        			bw.write("1\n");
        		else
        			bw.write("0\n");
        	}
        	
        	// front
        	else if(cmd.equals("front")) {
        		
        		if(que.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(que.peekLast()+"\n");
        	}
        	
        	// back
        	else {
        		
        		if(que.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(que.peekFirst()+"\n");
        	}
        	
        }
        
        bw.close();
    } // end of main
} // end of Main class