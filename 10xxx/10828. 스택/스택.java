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
    	
    	// 명령 수행
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	while(N--!=0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String string = st.nextToken();
    		
    		// push
    		if(string.equals("push"))
    			stack.push(Integer.valueOf(st.nextToken()));
    		
    		// pop
    		else if(string.equals("pop")) {
    			try {
    				bw.write(stack.pop()+"\n");
				} catch (Exception e) { bw.write("-1\n"); }
    		}
    		
    		// size
    		else if(string.equals("size"))
    			bw.write(stack.size()+"\n");
    		
    		// empty
    		else if(string.equals("empty")) {
    			if(stack.empty()) bw.write("1\n");
    			else bw.write("0\n");
    		}
    		
    		// top
    		else {
    			try {
    				bw.write(stack.peek()+"\n");
					
				} catch (Exception e) { bw.write("-1\n"); }
    		}
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class