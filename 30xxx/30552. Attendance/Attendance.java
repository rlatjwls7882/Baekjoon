import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 말할 문장의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// N개의 문장 수행
		Deque<String> deque = new ArrayDeque<String>();
		while(N-->0) {
			String string = br.readLine();
			if(string.equals("Present!")) {
				deque.pollLast();
			} else {
				deque.add(string);
			}
		}
		
		// 남아있는 문장 확인
		if(deque.isEmpty()) {
			bw.write("No Absences");
		} else {
			while(!deque.isEmpty()) {
				bw.write(deque.poll());
				bw.newLine();
			}
		}

		bw.close();
	} // end of main()
} // end of Main class