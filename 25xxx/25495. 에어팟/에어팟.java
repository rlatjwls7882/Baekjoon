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
		
		// 핸드폰의 연결한 횟수 N
		int N = Integer.valueOf(br.readLine());
		
		// 현재 에어팟의 배터리 소모량 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int last=0, curUse=0, lastUse=2;
		
		while(N-->0) {
			int cur = Integer.valueOf(st.nextToken());
			
			if(cur!=last) {
				lastUse=2;
				curUse+=2;
				last=cur;
			} else {
				lastUse*=2;
				curUse+=lastUse;
			}
			
			// 새로운 에어팟으로 교체
			if(curUse>=100) {
				last=0;
				curUse=0;
				lastUse=2;
			}
		}
		
		bw.write(Integer.toString(curUse));
		
		bw.close();
	} // end of main()
} // end of Main class