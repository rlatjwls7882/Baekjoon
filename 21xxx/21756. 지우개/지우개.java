import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 정수 N 입력
		int N = Integer.valueOf(br.readLine());
		
		// 마지막으로 남는 수 계산
		int remain=1;
		while(remain*2<=N)
			remain*=2;
		
		bw.write(remain+"");

		bw.close();
	} // end of main
} // end of Main class