import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	
        	String string = br.readLine();
        	
        	// 온점 입력시 종료
        	if(string.equals("."))
        		break;
        	
        	// 소괄호와 대괄호의 수 계산
        	Stack<Character> parentheses = new Stack<Character>(); 
        	
        	for(int i=0;i<string.length();i++) {
        		try {
        			
        			// '(' 나 '[' 인경우 스택에 넣음
        			if(string.charAt(i)=='('
        					||string.charAt(i)=='[')
        				parentheses.push(string.charAt(i));
        			
        			// ')' 인경우 '('을 스택에서 뺌
        			else if(string.charAt(i)==')') {
        				
        				if(parentheses.peek()=='(')
        					parentheses.pop();
        				else
        					break;
        			}
        			
        			// ']' 인경우 '['을 스택에서 뺌
        			else if(string.charAt(i)==']') {
        				
        				if(parentheses.peek()=='[')
        					parentheses.pop();
        				else
        					break;
        			}
        			
				} catch (Exception e) {
					
					// 예외처리가 된경우 문자 하나를 스택에 넣고 종료
					parentheses.push('A');
					break; }
        	}
        	
        	// 균형잡힌 문자열인지 판단
        	if(parentheses.isEmpty())
        		bw.write("yes\n");
        	else
        		bw.write("no\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class