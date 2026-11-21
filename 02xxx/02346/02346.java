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

		// 풍선 생성
		int N = Integer.valueOf(br.readLine());
		Deque<int[]> balloon = new ArrayDeque<int[]>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=N;i++)
			balloon.add(new int[] {Integer.valueOf(st.nextToken()), i});
		
		// 풍선 터트리기
		while(true) {
			bw.write(balloon.peekFirst()[1]+" ");
			int move = balloon.pollFirst()[0];
			if(balloon.isEmpty()) break;
			
			if(move>0) {
				while(move-->1)
					balloon.addLast(balloon.pollFirst());
			} else {
				while(move++<0)
					balloon.addFirst(balloon.pollLast());
			}
		}
		
		bw.close();
	} // end of main
} // end of Main class