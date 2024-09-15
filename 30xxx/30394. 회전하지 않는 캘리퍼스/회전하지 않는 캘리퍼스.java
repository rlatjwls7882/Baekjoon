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
		
		// y좌표의 최댓값, 최솟값 계산
		int maxY=-1_000_000_000, minY=1_000_000_000;
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			int y = Integer.valueOf(st.nextToken());
			
			maxY = Math.max(maxY, y);
			minY = Math.min(minY, y);
		}
		
		// 캘리퍼스로 측정한 거리 출력
		bw.write(Integer.toString(maxY-minY));
		
		bw.close();
	} // end of main()
} // end of Main class