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

		// Player1
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h1 = Integer.valueOf(st.nextToken());
		int d1 = Integer.valueOf(st.nextToken());
		int t1 = Integer.valueOf(st.nextToken());
		
		// Player2
		st = new StringTokenizer(br.readLine());
		int h2 = Integer.valueOf(st.nextToken());
		int d2 = Integer.valueOf(st.nextToken());
		int t2 = Integer.valueOf(st.nextToken());
		
		// 게임 시작
		for(int time=0;h1>0&&h2>0;time++) {
			if(time%t1==0) {
				h2-=d1;
			}
			if(time%t2==0) {
				h1-=d2;
			}
		}
		
		// 이기는 사람 확인
		if(h1<=0&&h2<=0) {
			bw.write("draw");
		} else if(h1<=0) {
			bw.write("player two");
		} else {
			bw.write("player one");
		}
		
		bw.close();
	} // end of main()
} // end of Main class