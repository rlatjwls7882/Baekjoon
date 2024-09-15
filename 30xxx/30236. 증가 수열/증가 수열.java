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
		
		int t = Integer.valueOf(br.readLine());
		
		while(t-->0) {
			
			// 수열 b의 마지막 요소의 최솟값 찾기
			int n = Integer.valueOf(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b=0;
			while(n-->0) {
				b++;
				if(b==Integer.valueOf(st.nextToken())) {
					b++;
				}
			}
			
			// 출력
			bw.write(Integer.toString(b));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class