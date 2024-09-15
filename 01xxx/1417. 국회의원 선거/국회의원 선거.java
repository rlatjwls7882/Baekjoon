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

		// 후보자 N명의 득표수 입력
		int N = Integer.valueOf(br.readLine());
		int Dasom = Integer.valueOf(br.readLine());
		
		PriorityQueue<Integer> other = new PriorityQueue<>(Collections.reverseOrder());
		while(N-->1)
			other.add(Integer.valueOf(br.readLine()));
		
		// 매수해야 하는 사람의 최솟값 계산
		int cnt=0;
		if(!other.isEmpty())
			while(other.peek()>=Dasom) {
				other.add(other.poll()-1);
				Dasom++;
				cnt++;
			}
		
		bw.write(cnt+"");
		
		bw.close();
	} // end of main
} // end of Main class