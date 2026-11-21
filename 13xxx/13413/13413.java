import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			String start = br.readLine();
			String end = br.readLine();
			
			// 위치가 다른 개수와 검은 말의 개수 확인
			int diff=0, blackS=0, blackE=0;
			for(int i=0;i<N;i++) {
				if(start.charAt(i)!=end.charAt(i)) {
					diff++;
				}
				if(start.charAt(i)=='B') {
					blackS++;
				}
				if(end.charAt(i)=='B') {
					blackE++;
				}
			}
			
			// 작업의 최소 횟수 계산
			int flip = Math.abs(blackS-blackE);
			int move = (diff-flip)/2;
			
			bw.write(Integer.toString(flip+move));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class