import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 심은 묘목의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 묘목이 자라는데 걸리는 시간 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> grow_time = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			grow_time.add(Integer.valueOf(st.nextToken()));
		}
		
		// 며칠만에 이장을 초대할 수 있는지 계산
		int min_time=0;
		for(int i=0;i<N;i++) {
			min_time = Math.max(min_time, i+2+grow_time.poll());
		}
		
		bw.write(Integer.toString(min_time));
		
		bw.close();
	} // end of main()
} // end of Main class