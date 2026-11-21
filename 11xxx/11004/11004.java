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
		
		// N개의 수를 오름차순으로 정렬
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		st = new StringTokenizer(br.readLine());
		while(N-->0)
			pq.add(Integer.valueOf(st.nextToken()));
		
		// 앞에서 K번째에 있는 수 출력
		while(K-->1)
			pq.poll();
		bw.write(Integer.toString(pq.peek()));
		
		bw.close();
	} // end of main()
} // end of Main class