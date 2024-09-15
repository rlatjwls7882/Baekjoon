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
		
		// 캐릭터의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 캐릭터의 레벨 입력
		PriorityQueue<Integer> levels = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<N;i++) {
			levels.add(Integer.valueOf(br.readLine()));
		}
		
		// 공격대에 속한 캐릭터들의 레벨의 합과 상승한 능력치의 합 계산
		N = Math.min(N, 42);
		int levelSum=0, increasing=0;
		
		while(N-->0) {
			int level = levels.poll();
			levelSum += level;
			
			if(level>=250) {
				increasing += 5;
			} else if(level>=200) {
				increasing += 4;
			} else if(level>=140) {
				increasing += 3;
			} else if(level>=100) {
				increasing += 2;
			} else if(level>=60) {
				increasing += 1;
			}
		}
		
		bw.write(Integer.toString(levelSum));
		bw.write(' ');
		bw.write(Integer.toString(increasing));
		
		bw.close();
	} // end of main()
} // end of Main class