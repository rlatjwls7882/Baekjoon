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
        
        // 전체 케이스의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        for(int numCases=1;numCases<=N;numCases++) {
        	
        	// 여러개의 단어 입력
        	Stack<String> stack = new Stack<String>(); 
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	while(st.hasMoreTokens())
        		stack.push(st.nextToken());
        	
        	// 모든 단어를 반대 순서로 출력
        	bw.write(String.format("Case #%d:", numCases));
        	
        	while(!stack.isEmpty())
        		bw.write(" "+stack.pop());
        	bw.write("\n");
        }

        bw.close();
    } // end of main
} // end of Main class