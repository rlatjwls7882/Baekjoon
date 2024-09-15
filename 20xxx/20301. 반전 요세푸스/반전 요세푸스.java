import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=1;i<=N;i++)
			deque.add(i);
		
		// 반전 요세푸스 순열 계산
		for(int i=0;!deque.isEmpty();i++) {
			
			// 오른쪽으로 회전
			if(i/M%2==0) {
				for(int j=1;j<K;j++)
					deque.add(deque.poll());
				bw.write(deque.poll()+"\n");
			}
			
			// 왼쪽으로 회전
			else {
				for(int j=0;j<K;j++)
					deque.addFirst(deque.pollLast());
				bw.write(deque.poll()+"\n");
			}
		}
		
		bw.close();
	} // end of main
} // end of Main class