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
		
		while(N-->0) {
			
			// 감염 날짜
			StringTokenizer st = new StringTokenizer(br.readLine());
			int startM = Integer.valueOf(st.nextToken());
			int startY = Integer.valueOf(st.nextToken());
			
			// 파업 날짜
			st = new StringTokenizer(br.readLine());
			int endM = Integer.valueOf(st.nextToken());
			int endY = Integer.valueOf(st.nextToken());
			
			// EIT 계산
			double EIT=0;
			
			if(startY==endY) {
				EIT += 0.5 * (endM-startM) / (12-startM+1);
			} else {
				EIT += 0.5 + (endY-startY-1) + (endM-1)/12.;
			}
			
			// 출력
			bw.write(String.format("%.04f\n", EIT));
		}
		
		bw.close();
	} // end of main()
} // end of Main class