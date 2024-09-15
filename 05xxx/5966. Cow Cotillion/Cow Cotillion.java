import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int i = Integer.valueOf(st.nextToken());
			String K = st.nextToken();
			
			// 합법적인지 확인
			LinkedList<Character> stack = new LinkedList<>();
			for(int j=0;j<i;j++) {
				if(K.charAt(j)=='>')
					stack.push(K.charAt(j));
				else if(!stack.isEmpty()&&stack.peek()=='>')
					stack.pop();
				else {
					stack.push('<');
					break;
				}
			}
			
			if(stack.isEmpty()) bw.write("legal\n");
			else bw.write("illegal\n");
		}

		bw.close();
	} // end of main
} // end of Main class