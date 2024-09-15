import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// N명 원에 세우기
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1;i<=N;i++)
			queue.add(i);
		
		// 요세푸스 순열 출력
		bw.write("<");
		while(queue.size()!=1) {
			for(int i=1;i<K;i++)
				queue.add(queue.poll());
			bw.write(queue.poll()+", ");
		}
		bw.write(queue.poll()+">");
		
		bw.close();
	} // end of main
} // end of Main class