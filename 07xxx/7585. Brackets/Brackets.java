import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String string = br.readLine();
			if(string.equals("#")) break;
			
			// 모든 괄호가 적절하게 닫혔는지 확인
			LinkedList<Character> brackets = new LinkedList<>();
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='('||string.charAt(i)=='{'||string.charAt(i)=='[')
					brackets.push(string.charAt(i));
				else if(!brackets.isEmpty()&&
						(string.charAt(i)==')'&&brackets.peek()=='('
						||string.charAt(i)=='}'&&brackets.peek()=='{'
						||string.charAt(i)==']'&&brackets.peek()=='['))
					brackets.pop();
				else if(string.charAt(i)==')'||string.charAt(i)=='}'||string.charAt(i)==']') {
					brackets.push('a');
					break;
				}
			}
			
			if(brackets.isEmpty())
				bw.write("Legal\n");
			else
				bw.write("Illegal\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class