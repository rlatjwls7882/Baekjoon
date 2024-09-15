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
		
		// N까지의 숫자를 나열
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(i);
		}
		
		// 가장 먼저 N이 나오는 위치 출력
		bw.write(Integer.toString(sb.indexOf(Integer.toString(N))+1));
		
		bw.close();
	} // end of main()
} // end of Main class