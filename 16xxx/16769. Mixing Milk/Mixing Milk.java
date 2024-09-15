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
		
		// 세 양동이의 총량 c와 현재 양동이에 들어있는 우유의 양 m
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c1 = Integer.valueOf(st.nextToken());
		int m1 = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int c2 = Integer.valueOf(st.nextToken());
		int m2 = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int c3 = Integer.valueOf(st.nextToken());
		int m3 = Integer.valueOf(st.nextToken());
		
		// 100번 붓기
		for(int i=0;i<100;i++) {
			if(i%3==0) {
				int tmp = Math.min(c2-m2, m1);
				m1 -= tmp;
				m2 += tmp;
			} else if(i%3==1) {
				int tmp = Math.min(c3-m3, m2);
				m2 -= tmp;
				m3 += tmp;
			} else {
				int tmp = Math.min(c1-m1, m3);
				m3 -= tmp;
				m1 += tmp;
			}
		}
		
		// 출력
		bw.write(String.format("%d\n%d\n%d", m1, m2, m3));
		
		bw.close();
	} // end of main()
} // end of Main class