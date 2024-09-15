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
		
		// 시침과 분침의 현재 각도
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 시계의 각도가 정상인지 확인
		if(H*12%360==M) {
			bw.write("O");
		} else {
			bw.write("X");
		}
		
		bw.close();
	} // end of main()
} // end of Main class