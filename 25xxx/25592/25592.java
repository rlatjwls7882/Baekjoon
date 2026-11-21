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
		
		// 푸앙이가 이기기 위해 추가해야할 최소 바둑돌의 수 계산
		int step = (int)Math.ceil(Math.sqrt(2*N+1/4.)-1/2.);
		
		if(step%2==1) {
			bw.write(Integer.toString(step*(step+1)/2-N));
		} else if(step*(step+1)/2==N) {
			bw.write(Integer.toString(step+1));
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class