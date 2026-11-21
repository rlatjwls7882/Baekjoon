import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 카드의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 카드의 순서 조정
		Deque<Integer> cards = new LinkedList<Integer>();
		for(int i=N;i>0;i--) {
			cards.addFirst(i);
			
			int repeat = i%cards.size();
			while(repeat-->0)
				cards.addFirst(cards.pollLast());
		}
		
		while(!cards.isEmpty())
			bw.write(cards.poll()+" ");
		
		bw.close();
	} // end of main
} // end of Main class