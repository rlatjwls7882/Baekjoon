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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int drinkTime = Integer.valueOf(st.nextToken())/Integer.valueOf(st.nextToken());
		
		// 우승자가 걸린 시간 계산
		int min=Integer.MAX_VALUE;
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.valueOf(st.nextToken());
			int s = Integer.valueOf(st.nextToken());
			
			int totalTime = ((int)Math.ceil(drinkTime/(double)t)-1)*s+drinkTime;
			min = Math.min(totalTime, min);
		}
		
		bw.write(Integer.toString(min));
		
		bw.close();
	} // end of main()
} // end of Main class