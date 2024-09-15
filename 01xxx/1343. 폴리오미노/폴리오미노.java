import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		char[] board = br.readLine().toCharArray();
		int length = board.length;
		StringBuilder sb = new StringBuilder();
		
		// 사전순으로 가장 앞서는 답 계산
		for(int i=0;i<length;) {
			if(i+3<length&&board[i]=='X'&&board[i+1]=='X'&&board[i+2]=='X'&&board[i+3]=='X') {
				sb.append("AAAA");
				i += 4;
			} else if(i+1<length&&board[i]=='X'&&board[i+1]=='X') {
				sb.append("BB");
				i += 2;
			} else if(board[i]=='X') {
				sb = new StringBuilder("-1");
				break;
			} else {
				sb.append('.');
				i += 1;
			}
		}
		
		bw.write(sb.toString());
		
		bw.close();
	} // end of main()
} // end of Main class