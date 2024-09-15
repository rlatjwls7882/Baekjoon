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

		// 원소 N개의 합 계산
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum=0;
		while(N-->0) {
			sum += Long.valueOf(st.nextToken());
		}
		
		// 만들 수 있는 가장 큰 값(2진수로 나타냈을 때의 최상위 비트) 계산
		bw.write(Long.highestOneBit(sum)+"");

		bw.close();
	} // end of main()
} // end of Main class