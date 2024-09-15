import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 욱제가 획득할 점수 계산
		int score=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			score += Math.abs(Integer.valueOf(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			score += Math.abs(Integer.valueOf(st.nextToken()));
		}
		
		bw.write(Integer.toString(score));
		
		bw.close();
	} // end of main()
} // end of Main class