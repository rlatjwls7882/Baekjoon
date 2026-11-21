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
		
		// 체스판의 크기 N, M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 출발점의 좌표
		st = new StringTokenizer(br.readLine());
		int sx = Integer.valueOf(st.nextToken());
		int sy = Integer.valueOf(st.nextToken());
		
		// 도착점의 좌표
		st = new StringTokenizer(br.readLine());
		int ex = Integer.valueOf(st.nextToken());
		int ey = Integer.valueOf(st.nextToken());
		
		// 비숍이 출발점에서 도착점으로 이동할 수 있는지 확인
		if(!(sx==ex&&sy==ey)&&(N==1||M==1)) {
			bw.write("NO");
		} else {
			if(sx%2==sy%2) {
				if(ex%2==ey%2) {
					bw.write("YES");
				} else {
					bw.write("NO");
				}
			} else {
				if(ex%2!=ey%2) {
					bw.write("YES");
				} else {
					bw.write("NO");
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class