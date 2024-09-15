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
		
		int T = Integer.valueOf(br.readLine());
		
		// 개미 로봇이 이동한 거리 계산
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.valueOf(st.nextToken());
			long b = Long.valueOf(st.nextToken());
			long c = Long.valueOf(st.nextToken());
			
			if(c>=a&&c>=b) {
				bw.write(Long.toString((a+b)*(a+b)+c*c));
			} else if(b>=a) {
				bw.write(Long.toString((a+c)*(a+c)+b*b));
			} else {
				bw.write(Long.toString((b+c)*(b+c)+a*a));
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class