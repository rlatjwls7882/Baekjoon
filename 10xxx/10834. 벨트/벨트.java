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

		// 벨트의 개수 M
		int M = Integer.valueOf(br.readLine());
		
		// 회전방향과 분당 회전수 계산
		int dir=0;
		double rotate=1;
		
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			rotate = rotate/Double.valueOf(st.nextToken())*Double.valueOf(st.nextToken());
			dir += Integer.valueOf(st.nextToken());
		}
		
		bw.write(dir%2+" "+(long)rotate);
		
		bw.close();
	} // end of main
} // end of Main class