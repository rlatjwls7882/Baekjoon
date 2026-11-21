import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.valueOf(br.readLine());
		
		for(int Class=1;Class<=K;Class++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			
			// 최댓값
			TreeSet<Integer> scores = new TreeSet<Integer>(Collections.reverseOrder());
			while(N-->0)
				scores.add(Integer.valueOf(st.nextToken()));
			
			bw.write("Class "+Class+"\n");
			bw.write("Max "+scores.first());
			
			// 최솟값과 인접한 가장 큰 점수 차이 계산
			int lastVal=scores.first(), largestGap=0;
			while(scores.size()>0) {
				int curVal=scores.pollFirst();
				
				if(largestGap<lastVal-curVal)
					largestGap=lastVal-curVal;
				lastVal=curVal;
			}
			
			bw.write(", Min "+lastVal);
			bw.write(", Largest gap "+largestGap+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class