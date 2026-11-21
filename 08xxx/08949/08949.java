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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        
        // 희주 방식대로 더한 결과 계산
        Stack<String> stack = new Stack<String>();
        while(A!=0||B!=0) {
        	stack.add(String.valueOf(A%10+B%10));
        	A/=10; B/=10;
        }
        
        while(!stack.isEmpty())
        	bw.write(stack.pop());
        
        bw.close();
    } // end of main
} // end of Main class