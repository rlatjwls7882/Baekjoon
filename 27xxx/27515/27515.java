import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 쿼리의 개수 Q
		int Q = Integer.valueOf(br.readLine());
		
		// 쿼리 수행
		long sum=0;
		
		while(Q-->0) {
			sum += Long.valueOf(br.readLine());
			
			// 만들 수 있는 가장 큰 2의 거듭제곱 값(2진수로 나타냈을 때의 최상위 비트) 계산
			bw.write(Long.toString(Long.highestOneBit(sum)));
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class