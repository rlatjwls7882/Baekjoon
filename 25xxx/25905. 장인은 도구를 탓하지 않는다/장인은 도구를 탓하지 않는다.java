import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		// 10개의 강화확률 입력
		PriorityQueue<Double> percents = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<10;i++) {
			percents.add(Double.valueOf(br.readLine()));
		}
		
		// 9강에 도달할 최대 확률 *10^9 계산
		double percent=1_000_000_000;
		
		for(int i=1;i<=9;i++) {
			percent *= percents.poll()/i;
		}
		
		bw.write(Double.toString(percent));
		
		bw.close();
	} // end of main()
} // end of Main class