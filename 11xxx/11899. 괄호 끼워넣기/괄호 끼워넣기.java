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

		String string = br.readLine();
		
		// 올바른 괄호열을 위해 추가해야하는 괄호의 개수 계산
		LinkedList<Character> stack = new LinkedList<>();
		int leftAdd=0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='(') stack.push('(');
			else if(stack.isEmpty()) leftAdd++;
			else stack.poll();
		}
		
		bw.write(leftAdd+stack.size()+"");
		
		bw.close();
	} // end of main
} // end of Main class