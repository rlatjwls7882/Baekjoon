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
		
		// 수열의 크기 N
		int N = Integer.valueOf(br.readLine());
		
		// 가장 큰 오르막길의 크기 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max=0, before = Integer.valueOf(st.nextToken()), height=0;
		
		while(N-->1) {
			int cur = Integer.valueOf(st.nextToken());
			
			if(cur>before) {
				height += cur-before;
				max = Math.max(max, height);
			} else {
				height=0;
			}
			
			before=cur;
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class