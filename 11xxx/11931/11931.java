import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// N개의 수를 내림차순으로 정렬
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		int N = Integer.valueOf(br.readLine());
		while(N-->0)
			queue.add(Integer.valueOf(br.readLine()));
		
		// 출력
		while(!queue.isEmpty()) {
			bw.write(Integer.toString(queue.poll()));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class