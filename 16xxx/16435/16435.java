import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		// 과일의 개수 N, 스네이크버드의 초기 길이 L
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int L = Integer.valueOf(st.nextToken());
		
		// 과일이 달려 있는 높이 입력
		PriorityQueue<Integer> length = new PriorityQueue<>();
		st = new StringTokenizer(br.readLine());
		
		while(N-->0) {
			length.add(Integer.valueOf(st.nextToken()));
		}
		
		// 스네이크버드의 최대 길이 계산
		while(!length.isEmpty()) {
			if(length.peek()<=L) {
				L++;
				length.poll();
			} else {
				break;
			}
		}
		
		bw.write(Integer.toString(L));
		
		bw.close();
	} // end of main()
} // end of Main class