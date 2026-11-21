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

		// 양념, 후라이드, 반반치킨의 가격 A B C, 준비해야 하는 양념치킨과 후라이드 치킨 X Y마리
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int X = Integer.valueOf(st.nextToken());
		int Y = Integer.valueOf(st.nextToken());
		
		// 최소 X, Y마리의 최소비용 계산
		int allBanban=Integer.MAX_VALUE, almostBanban=0;
		if(A+B>2*C) {
			int buy = Math.min(X, Y);
			allBanban = almostBanban = C*2*buy;
			X -= buy; Y -= buy;
			allBanban += C*2*Math.max(X, Y);
		}
		almostBanban += X*A+Y*B;
		
		bw.write(Math.min(allBanban, almostBanban)+"");
		
		bw.close();
	} // end of main
} // end of Main class