import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		int A0 = Integer.valueOf(br.readLine());
		
		// 최소로 돌리는 각도의 합 계산
		int min=0;
		
		while(N-->0) {
			int A1 = Integer.valueOf(br.readLine());
			
			int case1 = Math.abs(A1-A0);
			min += Math.min(case1, 360-case1);
			A0=A1;
		}
		
		bw.write(Integer.toString(min));

		bw.close();
	} // end of main()
} // end of Main class