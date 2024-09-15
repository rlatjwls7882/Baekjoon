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
		
		// 문자열 뒤집어서 출력
		boolean isTag=false;
		LinkedList<Character> stack = new LinkedList<>();
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='<') isTag=true;
			
			// 태그는 그냥 출력
			if(isTag) {
				while(!stack.isEmpty())
					bw.write(stack.poll());
				
				bw.write(string.charAt(i));
				if(string.charAt(i)=='>') isTag=false;
			}
			
			// 공백이 나오면 스택에 있는 내용 출력
			else if(string.charAt(i)==' ') {
				while(!stack.isEmpty())
					bw.write(stack.poll());
				bw.write(' ');
			}
			
			// 그 외에는 스택에 추가
			else {
				stack.push(string.charAt(i));
			}
		}
		
		// 스택에 남아있는 내용 출력
		while(!stack.isEmpty())
			bw.write(stack.poll());
		
		bw.close();
	} // end of main
} // end of Main class