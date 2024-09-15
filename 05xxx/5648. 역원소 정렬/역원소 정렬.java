import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		
		// N개의 원소를 뒤집어서 정렬
		PriorityQueue<Long> sort = new PriorityQueue<>();
		
		while(N>0) { // 입력에 빈줄이 존재
			if(!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			} if(st.hasMoreTokens()) {
				sort.add(Long.valueOf(new StringBuilder(st.nextToken()).reverse().toString()));
				N--;
			}
		}
		
		// 정렬한 값 출력
		StringBuilder sb = new StringBuilder();
		while(!sort.isEmpty())
			sb.append(sort.poll()).append('\n');
		
		bw.write(sb.toString());
		
		bw.close();
	} // end of main()
} // end of Main class