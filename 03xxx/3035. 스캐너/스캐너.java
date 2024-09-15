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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int ZR = Integer.valueOf(st.nextToken());
		int ZC = Integer.valueOf(st.nextToken());
		
		// R*C 크기의 신문 기사 입력
		String[] news = new String[R];
		
		for(int i=0;i<R;i++) {
			news[i] = br.readLine();
		}
		
		// 신문기사를 ZR, ZC배 늘려서 출력
		for(int i=0;i<R*ZR;i++) {
			for(int j=0;j<C*ZC;j++) {
				bw.write(news[i/ZR].charAt(j/ZC));
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class