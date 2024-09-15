import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 명령의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        Stack<String> stack = new Stack<String>();
        
        while(N--!=0) {
        	
        	// 명령 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String cmd = st.nextToken();
        	
        	// 1
        	if(cmd.equals("1"))
        		stack.push(st.nextToken());
        	
        	// 2
        	else if(cmd.equals("2")) {
        		
        		if(stack.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(stack.pop()+"\n");
        	}
        	
        	// 3
        	else if(cmd.equals("3"))
        		bw.write(stack.size()+"\n");
        	
        	// 4
        	else if(cmd.equals("4")) {
        		
        		if(stack.isEmpty())
        			bw.write("1\n");
        		else
        			bw.write("0\n");
        	}
        		
        	// 5
        	else {
        		
        		if(stack.isEmpty())
        			bw.write("-1\n");
        		else
        			bw.write(stack.peek()+"\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class