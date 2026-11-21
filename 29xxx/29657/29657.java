import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 1번 시간 포멧
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.valueOf(st.nextToken());
		int b1 = Integer.valueOf(st.nextToken());
		int c1 = Integer.valueOf(st.nextToken());
		
		// 2번 시간 포멧
		st = new StringTokenizer(br.readLine());
		int a2 = Integer.valueOf(st.nextToken());
		int b2 = Integer.valueOf(st.nextToken());
		int c2 = Integer.valueOf(st.nextToken());
		
		// 1번 포멧으로 했을때의 현재 시간
		st = new StringTokenizer(br.readLine());
		int h1 = Integer.valueOf(st.nextToken());
		int m1 = Integer.valueOf(st.nextToken());
		int s1 = Integer.valueOf(st.nextToken());
		
		// 2번 포멧으로 했을때의 현재 시간 계산
		int time = h1*b1*c1+m1*c1+s1;
		int s2 = time%c2; time/=c2;
		int m2 = time%b2; time/=b2;
		int h2 = time;
		
		bw.write(h2+" "+m2+" "+s2);
		
		bw.close();
	} // end of main
} // end of Main class