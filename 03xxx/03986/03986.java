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

		// 단어의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 좋은 단어의 개수 계산
		int cnt=0;
		while(N-->0) {
			String word = br.readLine();
			LinkedList<Character> stack = new LinkedList<>();
			
			for(int i=0;i<word.length();i++) {
				if(stack.isEmpty()||stack.peek()!=word.charAt(i))
					stack.push(word.charAt(i));
				else
					stack.pop();
			}
			
			if(stack.isEmpty())
				cnt++;
		}
		
		bw.write(cnt+"");
		
		bw.close();
	} // end of main
} // end of Main class