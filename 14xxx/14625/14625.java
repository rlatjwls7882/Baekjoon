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
		
		// 시작시간과 종료 시간, 찾을 숫자 N 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.valueOf(st.nextToken())*100+Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int end = Integer.valueOf(st.nextToken())*100+Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(br.readLine());
		
		// N이 나오는 시간의 수 계산
		int cnt=0;
		while(start<=end) {
			if(start%100==60) {
				start+=40;
			}
			
			if(start%10==N||start/10%10==N||start/100%10==N||start/1000==N) {
				cnt++;
			}
			start++;
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class