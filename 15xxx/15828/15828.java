import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 버퍼의 크기 N
		int N = Integer.valueOf(br.readLine());
		Queue<String> queue = new LinkedList<String>();
		
		// 라우터에 패킷 집어넣기
		while(true) {
			String string = br.readLine();
			if(string.equals("-1")) break;
			
			else if(string.equals("0")) queue.poll();
			else if(queue.size()<N) queue.add(string);
		}
		
		// 라우터에 남아있는 패킷 출력
		if(!queue.isEmpty()) {
			while(!queue.isEmpty())
				bw.write(queue.poll()+" ");
		} else {
			bw.write("empty");
		}
		
		bw.close();
	} // end of main
} // end of Main class