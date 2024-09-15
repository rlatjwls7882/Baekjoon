import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 카드 생성
		int N = Integer.valueOf(br.readLine());
		Deque<Integer> cards = new ArrayDeque<Integer>();
		for(int i=1;i<=N;i++)
			cards.add(i);
		
		// 카드 뽑기
		while(!cards.isEmpty()) {
			bw.write(cards.poll()+" ");
			if(cards.isEmpty()) break;
			
			cards.add(cards.poll());
		}

		bw.close();
	} // end of main
} // end of Main class