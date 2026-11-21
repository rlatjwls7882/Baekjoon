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
		
		// 과제산의 높이 H, 스노우볼이 커지는 정도 x
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.valueOf(st.nextToken());
		int x = Integer.valueOf(st.nextToken());
		
		// 스노우볼의 각각의 높이
		int[] snowball = new int[H];
		for(int i=0;i<H;i++) {
			snowball[i] = Integer.valueOf(br.readLine());
		}
		
		// 모든 스노우볼이 내려왔을 때의 크기의 합 계산
		long size=0;
		for(int i=H-1;i>=0;i--) {
			size += snowball[i];
			size *= x;
			size %= 1_000_000_007;
		}
		
		bw.write(Long.toString(size));
		
		bw.close();
	} // end of main()
} // end of Main class